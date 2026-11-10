package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, c4 c4Var, long j3, Object obj, Object obj2) {
        while (!d4.a(unsafe, c4Var, j3, obj, obj2)) {
            if (unsafe.getObject(c4Var, j3) != obj) {
                return false;
            }
        }
        return true;
    }
}
