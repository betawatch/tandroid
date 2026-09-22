package com.google.android.play.core.integrity.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
@Target({ElementType.TYPE_USE, ElementType.PARAMETER})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface IntegrityDialogTypeCode {
    public static final int CLOSE_ALL_ACCESS_RISK = 3;
    public static final int CLOSE_UNKNOWN_ACCESS_RISK = 2;
    public static final int GET_LICENSED = 1;
}
