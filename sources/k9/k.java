package k9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ boolean a(Unsafe unsafe, o oVar, long j10, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(oVar, j10, obj, obj2)) {
            if (unsafe.getObject(oVar, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
