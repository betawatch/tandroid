package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, d4 d4Var, long j10, Object obj, Object obj2) {
        while (!e4.a(unsafe, d4Var, j10, obj, obj2)) {
            if (unsafe.getObject(d4Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
