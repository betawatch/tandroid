package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, l0 l0Var, long j3, Object obj, Object obj2) {
        while (!m0.a(unsafe, l0Var, j3, obj, obj2)) {
            if (unsafe.getObject(l0Var, j3) != obj) {
                return false;
            }
        }
        return true;
    }
}
