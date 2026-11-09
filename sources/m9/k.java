package m9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
