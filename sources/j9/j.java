package j9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
