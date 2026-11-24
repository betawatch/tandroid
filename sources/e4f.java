// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class e4f {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, vbf vbfVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(vbfVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(vbfVar) != obj && atomicReferenceFieldUpdater.get(vbfVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
