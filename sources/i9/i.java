package i9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
