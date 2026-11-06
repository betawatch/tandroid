package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, c4 c4Var, long j3, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(c4Var, j3, obj, obj2)) {
            if (unsafe.getObject(c4Var, j3) != obj) {
                return false;
            }
        }
        return true;
    }
}
