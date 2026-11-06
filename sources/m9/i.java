package m9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
