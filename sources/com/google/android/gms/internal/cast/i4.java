package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, g4 g4Var, long j10, Object obj, Object obj2) {
        while (!h4.a(unsafe, g4Var, j10, obj, obj2)) {
            if (unsafe.getObject(g4Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
