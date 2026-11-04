package hd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wd.m;
import wd.x;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final fd.h _context;
    private transient fd.c intercepted;

    public c(fd.c cVar, fd.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // fd.c
    public fd.h getContext() {
        fd.h hVar = this._context;
        kotlin.jvm.internal.j.b(hVar);
        return hVar;
    }

    public final fd.c intercepted() {
        fd.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        fd.e eVar = (fd.e) getContext().get(fd.d.a);
        fd.c fVar = eVar != null ? new be.f((x) eVar, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override // hd.a
    public void releaseIntercepted() {
        fd.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            fd.f fVar = getContext().get(fd.d.a);
            kotlin.jvm.internal.j.b(fVar);
            be.f fVar2 = (be.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.f.n;
            while (atomicReferenceFieldUpdater.get(fVar2) == be.a.c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar2);
            m mVar = obj instanceof m ? (m) obj : null;
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.a;
    }

    public c(fd.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
