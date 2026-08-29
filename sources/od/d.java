package od;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class d {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public d(u uVar) {
        this._prev$volatile = uVar;
    }

    public final void b() {
        b.set(this, null);
    }

    public final d c() {
        Object obj = a.get(this);
        if (obj == a.b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean d();

    public final void e() {
        d c3;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.d()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d c6 = c();
            kotlin.jvm.internal.j.b(c6);
            while (c6.d() && (c3 = c6.c()) != null) {
                c6 = c3;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c6);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(c6, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(c6) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                a.set(dVar, c6);
            }
            if (!c6.d() || c6.c() == null) {
                if (dVar == null || !dVar.d()) {
                    return;
                }
            }
        }
    }
}
