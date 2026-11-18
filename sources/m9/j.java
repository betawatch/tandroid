package m9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
