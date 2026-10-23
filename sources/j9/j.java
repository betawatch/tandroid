package j9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
