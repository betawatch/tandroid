package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, l0 l0Var, long j10, Object obj, Object obj2) {
        while (!m0.a(unsafe, l0Var, j10, obj, obj2)) {
            if (unsafe.getObject(l0Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
