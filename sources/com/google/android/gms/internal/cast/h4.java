package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, f4 f4Var, long j10, Object obj, Object obj2) {
        while (!g4.a(unsafe, f4Var, j10, obj, obj2)) {
            if (unsafe.getObject(f4Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
