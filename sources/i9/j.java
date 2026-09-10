package i9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ boolean a(Unsafe unsafe, o oVar, long j3, c cVar, c cVar2) {
        while (!unsafe.compareAndSwapObject(oVar, j3, cVar, cVar2)) {
            if (unsafe.getObject(oVar, j3) != cVar) {
                return false;
            }
        }
        return true;
    }
}
