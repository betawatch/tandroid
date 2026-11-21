package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
