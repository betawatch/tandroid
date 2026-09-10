package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class d {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public d(t tVar) {
        this._prev$volatile = tVar;
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
        d c10;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.d()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d c11 = c();
            kotlin.jvm.internal.i.b(c11);
            while (c11.d() && (c10 = c11.c()) != null) {
                c11 = c10;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c11);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(c11, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(c11) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                a.set(dVar, c11);
            }
            if (!c11.d() || c11.c() == null) {
                if (dVar == null || !dVar.d()) {
                    return;
                }
            }
        }
    }
}
