package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class b extends p {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.a;

    @Override // ee.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        d9.f fVar = a.a;
        if (obj2 == fVar) {
            d9.f c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == fVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, fVar, c10)) {
                        obj2 = c10;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != fVar) {
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

    public abstract d9.f c(Object obj);
}
