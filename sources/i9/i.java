package i9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ boolean a(Unsafe unsafe, o oVar, long j3, n nVar, n nVar2) {
        while (!unsafe.compareAndSwapObject(oVar, j3, nVar, nVar2)) {
            if (unsafe.getObject(oVar, j3) != nVar) {
                return false;
            }
        }
        return true;
    }
}
