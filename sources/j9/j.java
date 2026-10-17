package j9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ boolean a(Unsafe unsafe, o oVar, long j10, c cVar, c cVar2) {
        while (!unsafe.compareAndSwapObject(oVar, j10, cVar, cVar2)) {
            if (unsafe.getObject(oVar, j10) != cVar) {
                return false;
            }
        }
        return true;
    }
}
