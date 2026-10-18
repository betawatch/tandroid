package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
