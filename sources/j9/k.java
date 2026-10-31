package j9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ boolean a(Unsafe unsafe, o oVar, long j10, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(oVar, j10, obj, obj2)) {
            if (unsafe.getObject(oVar, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
