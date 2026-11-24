// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class a3f {
    public static /* synthetic */ boolean a(Unsafe unsafe, cmd cmdVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(cmdVar, j, obj, obj2)) {
            if (unsafe.getObject(cmdVar, j) != obj && unsafe.getObject(cmdVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
