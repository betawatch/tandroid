package com.google.android.play.integrity.internal;

/* loaded from: classes.dex */
public abstract class ak extends aj {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
