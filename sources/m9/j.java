package m9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
