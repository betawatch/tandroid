package j9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
