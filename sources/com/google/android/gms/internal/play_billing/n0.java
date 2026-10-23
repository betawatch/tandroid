package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
