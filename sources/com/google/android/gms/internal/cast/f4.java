package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
