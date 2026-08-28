package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
