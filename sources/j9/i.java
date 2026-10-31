package j9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ boolean a(Unsafe unsafe, o oVar, long j10, n nVar, n nVar2) {
        while (!unsafe.compareAndSwapObject(oVar, j10, nVar, nVar2)) {
            if (unsafe.getObject(oVar, j10) != nVar) {
                return false;
            }
        }
        return true;
    }
}
