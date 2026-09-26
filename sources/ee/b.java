package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class b extends p {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.a;

    @Override // ee.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        v vVar = a.a;
        if (obj2 == vVar) {
            v c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == vVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, c10)) {
                        obj2 = c10;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != vVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract v c(Object obj);
}
