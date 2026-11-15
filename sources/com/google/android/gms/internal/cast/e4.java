package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, c4 c4Var, long j3, Object obj, Object obj2) {
        while (!d4.a(unsafe, c4Var, j3, obj, obj2)) {
            if (unsafe.getObject(c4Var, j3) != obj) {
                return false;
            }
        }
        return true;
    }
}
