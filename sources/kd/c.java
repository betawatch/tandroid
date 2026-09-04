package kd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.a0;
import zd.m;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final id.h _context;
    private transient id.c intercepted;

    public c(id.c cVar, id.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // id.c
    public id.h getContext() {
        id.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final id.c intercepted() {
        id.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        id.e eVar = (id.e) getContext().get(id.d.a);
        id.c hVar = eVar != null ? new ee.h((a0) eVar, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // kd.a
    public void releaseIntercepted() {
        id.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            id.f fVar = getContext().get(id.d.a);
            kotlin.jvm.internal.i.b(fVar);
            ee.h hVar = (ee.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.h.n;
            while (atomicReferenceFieldUpdater.get(hVar) == ee.a.d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            m mVar = obj instanceof m ? (m) obj : null;
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.a;
    }

    public c(id.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
