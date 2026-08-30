package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, f4 f4Var, long j10, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(f4Var, j10, obj, obj2)) {
            if (unsafe.getObject(f4Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
