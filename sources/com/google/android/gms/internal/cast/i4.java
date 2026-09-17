package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, h4 h4Var, long j3, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(h4Var, j3, obj, obj2)) {
            if (unsafe.getObject(h4Var, j3) != obj) {
                return false;
            }
        }
        return true;
    }
}
