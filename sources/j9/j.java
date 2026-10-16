package j9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
