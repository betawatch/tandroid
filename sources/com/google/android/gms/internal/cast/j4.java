package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, h4 h4Var, long j3, Object obj, Object obj2) {
        while (!i4.a(unsafe, h4Var, j3, obj, obj2)) {
            if (unsafe.getObject(h4Var, j3) != obj) {
                return false;
            }
        }
        return true;
    }
}
