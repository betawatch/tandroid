package com.google.android.play.core.integrity.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
@Target({ElementType.TYPE_USE, ElementType.PARAMETER})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface IntegrityDialogTypeCode {
    public static final int CLOSE_ALL_ACCESS_RISK = 3;
    public static final int CLOSE_UNKNOWN_ACCESS_RISK = 2;
    public static final int GET_LICENSED = 1;
}
