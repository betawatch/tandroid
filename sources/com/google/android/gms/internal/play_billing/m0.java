package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j3, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j3, obj2, obj3)) {
            if (unsafe.getObject(obj, j3) != obj2) {
                return false;
            }
        }
        return true;
    }
}
