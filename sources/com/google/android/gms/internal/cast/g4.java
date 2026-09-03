package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, e4 e4Var, long j10, Object obj, Object obj2) {
        while (!f4.a(unsafe, e4Var, j10, obj, obj2)) {
            if (unsafe.getObject(e4Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
