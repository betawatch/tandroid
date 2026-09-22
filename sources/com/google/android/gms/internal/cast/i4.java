package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
