package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, f4 f4Var, long j3, Object obj, Object obj2) {
        while (!g4.a(unsafe, f4Var, j3, obj, obj2)) {
            if (unsafe.getObject(f4Var, j3) != obj) {
                return false;
            }
        }
        return true;
    }
}
