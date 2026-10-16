package j9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ boolean a(Unsafe unsafe, o oVar, long j10, n nVar, n nVar2) {
        while (!unsafe.compareAndSwapObject(oVar, j10, nVar, nVar2)) {
            if (unsafe.getObject(oVar, j10) != nVar) {
                return false;
            }
        }
        return true;
    }
}
