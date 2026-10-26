package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, c4 c4Var, long j10, Object obj, Object obj2) {
        while (!d4.a(unsafe, c4Var, j10, obj, obj2)) {
            if (unsafe.getObject(c4Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
