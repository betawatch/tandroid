package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
