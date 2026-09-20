package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
