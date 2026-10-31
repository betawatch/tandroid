package j9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ boolean a(Unsafe unsafe, o oVar, long j10, c cVar, c cVar2) {
        while (!unsafe.compareAndSwapObject(oVar, j10, cVar, cVar2)) {
            if (unsafe.getObject(oVar, j10) != cVar) {
                return false;
            }
        }
        return true;
    }
}
