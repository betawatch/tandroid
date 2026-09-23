package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
