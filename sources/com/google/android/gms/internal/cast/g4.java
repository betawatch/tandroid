package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, e4 e4Var, long j10, Object obj, Object obj2) {
        while (!f4.a(unsafe, e4Var, j10, obj, obj2)) {
            if (unsafe.getObject(e4Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
