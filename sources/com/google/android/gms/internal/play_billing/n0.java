package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
