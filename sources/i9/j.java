package i9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
