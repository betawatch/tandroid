package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
