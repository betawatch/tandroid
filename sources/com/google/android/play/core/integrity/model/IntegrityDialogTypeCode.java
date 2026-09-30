package com.google.android.play.core.integrity.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
@Target({ElementType.TYPE_USE, ElementType.PARAMETER})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface IntegrityDialogTypeCode {
    public static final int CLOSE_ALL_ACCESS_RISK = 3;
    public static final int CLOSE_UNKNOWN_ACCESS_RISK = 2;
    public static final int GET_LICENSED = 1;
}
