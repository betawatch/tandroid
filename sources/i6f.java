// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class i6f {
    public static /* synthetic */ boolean a(Unsafe unsafe, wdf wdfVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(wdfVar, j, obj, obj2)) {
            if (unsafe.getObject(wdfVar, j) != obj && unsafe.getObject(wdfVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
