package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, e4 e4Var, long j10, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(e4Var, j10, obj, obj2)) {
            if (unsafe.getObject(e4Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
