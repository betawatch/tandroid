package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
