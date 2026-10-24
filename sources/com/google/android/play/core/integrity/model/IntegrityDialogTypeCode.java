package com.google.android.play.core.integrity.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
@Target({ElementType.TYPE_USE, ElementType.PARAMETER})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface IntegrityDialogTypeCode {
    public static final int CLOSE_ALL_ACCESS_RISK = 3;
    public static final int CLOSE_UNKNOWN_ACCESS_RISK = 2;
    public static final int GET_LICENSED = 1;
}
