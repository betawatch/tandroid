package i9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
