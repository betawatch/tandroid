// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class m2f {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, y4f y4fVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(y4fVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(y4fVar) != obj && atomicReferenceFieldUpdater.get(y4fVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
