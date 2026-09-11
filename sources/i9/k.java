package i9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
