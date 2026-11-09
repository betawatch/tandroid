package kd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.m;
import zd.x;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        kotlin.jvm.internal.j.b(hVar);
        return hVar;
    }

    public final id.c intercepted() {
        id.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        id.e eVar = (id.e) getContext().get(id.d.a);
        id.c fVar = eVar != null ? new ee.f((x) eVar, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override // kd.a
    public void releaseIntercepted() {
        id.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            id.f fVar = getContext().get(id.d.a);
            kotlin.jvm.internal.j.b(fVar);
            ee.f fVar2 = (ee.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.f.n;
            while (atomicReferenceFieldUpdater.get(fVar2) == ee.a.c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar2);
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
