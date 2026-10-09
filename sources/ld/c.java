package ld;

import ae.b0;
import ae.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final jd.h _context;
    private transient jd.c intercepted;

    public c(jd.c cVar, jd.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // jd.c
    public jd.h getContext() {
        jd.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final jd.c intercepted() {
        jd.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        jd.e eVar = (jd.e) getContext().get(jd.d.a);
        jd.c hVar = eVar != null ? new fe.h((b0) eVar, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // ld.a
    public void releaseIntercepted() {
        jd.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            jd.f fVar = getContext().get(jd.d.a);
            kotlin.jvm.internal.i.b(fVar);
            fe.h hVar = (fe.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.h.n;
            while (atomicReferenceFieldUpdater.get(hVar) == fe.a.d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            m mVar = obj instanceof m ? (m) obj : null;
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.a;
    }

    public c(jd.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
