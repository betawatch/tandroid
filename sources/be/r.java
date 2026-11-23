package be;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
import zd.b1;
import zd.n1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class r extends zd.a implements s, g {
    public final c d;

    public r(id.h hVar, c cVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // zd.a
    public final void Q(Throwable th2, boolean z10) {
        if (this.d.g(th2, false) || z10) {
            return;
        }
        b0.m(this.c, th2);
    }

    @Override // zd.a
    public final void R(Object obj) {
        this.d.g(null, false);
    }

    public final void T(q qVar) {
        c cVar = this.d;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.s;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, qVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    ee.t tVar = e.q;
                    if (obj != tVar) {
                        if (obj == e.r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    ee.t tVar2 = e.r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, tVar, tVar2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != tVar) {
                            break;
                        }
                    }
                    qVar.invoke(cVar.m());
                    return;
                }
            }
        }
    }

    @Override // be.u
    public final Object a(id.c cVar, Object obj) {
        return this.d.a(cVar, obj);
    }

    @Override // be.u
    public final Object b(Object obj) {
        return this.d.b(gd.k.a);
    }

    @Override // zd.n1, zd.a1, be.t
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new b1(m(), null, this);
        }
        k(cancellationException);
    }

    @Override // zd.n1
    public final void k(CancellationException cancellationException) {
        CancellationException N = n1.N(this, cancellationException);
        this.d.g(N, true);
        j(N);
    }
}
