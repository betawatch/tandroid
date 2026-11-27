// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class f7f {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, p9f p9fVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(p9fVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(p9fVar) != obj && atomicReferenceFieldUpdater.get(p9fVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
