package md;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b extends p {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.a;

    @Override // md.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        e5.c cVar = a.a;
        if (obj2 == cVar) {
            e5.c c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == cVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, cVar, c10)) {
                        obj2 = c10;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != cVar) {
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

    public abstract e5.c c(Object obj);
}
