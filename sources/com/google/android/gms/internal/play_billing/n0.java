package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
