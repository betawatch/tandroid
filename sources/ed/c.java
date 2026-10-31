package ed;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.a0;
import td.m;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final cd.h _context;
    private transient cd.c intercepted;

    public c(cd.c cVar, cd.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // cd.c
    public cd.h getContext() {
        cd.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final cd.c intercepted() {
        cd.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        cd.e eVar = (cd.e) getContext().get(cd.d.a);
        cd.c hVar = eVar != null ? new yd.h((a0) eVar, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // ed.a
    public void releaseIntercepted() {
        cd.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            cd.f fVar = getContext().get(cd.d.a);
            kotlin.jvm.internal.i.b(fVar);
            yd.h hVar = (yd.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yd.h.n;
            while (atomicReferenceFieldUpdater.get(hVar) == yd.a.d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            m mVar = obj instanceof m ? (m) obj : null;
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.a;
    }

    public c(cd.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
