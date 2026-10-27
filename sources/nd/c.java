package nd;

import ce.a0;
import ce.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final ld.h _context;
    private transient ld.c intercepted;

    public c(ld.c cVar, ld.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // ld.c
    public ld.h getContext() {
        ld.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final ld.c intercepted() {
        ld.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        ld.e eVar = (ld.e) getContext().get(ld.d.a);
        ld.c hVar = eVar != null ? new he.h((a0) eVar, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // nd.a
    public void releaseIntercepted() {
        ld.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            ld.f fVar = getContext().get(ld.d.a);
            kotlin.jvm.internal.i.b(fVar);
            he.h hVar = (he.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.h.n;
            while (atomicReferenceFieldUpdater.get(hVar) == he.a.d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            m mVar = obj instanceof m ? (m) obj : null;
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.a;
    }

    public c(ld.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
