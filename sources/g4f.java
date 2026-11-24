// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class g4f {
    public static /* synthetic */ boolean a(Unsafe unsafe, vbf vbfVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(vbfVar, j, obj, obj2)) {
            if (unsafe.getObject(vbfVar, j) != obj && unsafe.getObject(vbfVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
