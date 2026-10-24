package md;

import be.a0;
import be.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final kd.h _context;
    private transient kd.c intercepted;

    public c(kd.c cVar, kd.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // kd.c
    public kd.h getContext() {
        kd.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final kd.c intercepted() {
        kd.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        kd.e eVar = (kd.e) getContext().get(kd.d.a);
        kd.c hVar = eVar != null ? new ge.h((a0) eVar, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // md.a
    public void releaseIntercepted() {
        kd.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            kd.f fVar = getContext().get(kd.d.a);
            kotlin.jvm.internal.i.b(fVar);
            ge.h hVar = (ge.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ge.h.n;
            while (atomicReferenceFieldUpdater.get(hVar) == ge.a.d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            m mVar = obj instanceof m ? (m) obj : null;
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.a;
    }

    public c(kd.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
