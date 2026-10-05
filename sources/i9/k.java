package i9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
