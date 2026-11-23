package m9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ boolean a(Unsafe unsafe, o oVar, long j3, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(oVar, j3, obj, obj2)) {
            if (unsafe.getObject(oVar, j3) != obj) {
                return false;
            }
        }
        return true;
    }
}
