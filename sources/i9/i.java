package i9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
