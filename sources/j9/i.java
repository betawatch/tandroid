package j9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
