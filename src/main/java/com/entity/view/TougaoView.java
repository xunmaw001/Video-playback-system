package com.entity.view;

import com.entity.TougaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投稿
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 17:50:16
 */
@TableName("tougao")
public class TougaoView  extends TougaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TougaoView(){
	}
 
 	public TougaoView(TougaoEntity tougaoEntity){
 	try {
			BeanUtils.copyProperties(this, tougaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
