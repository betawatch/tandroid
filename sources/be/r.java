package be;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
import zd.b1;
import zd.n1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                    aa.b0 b0Var = e.q;
                    if (obj != b0Var) {
                        if (obj == e.r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    aa.b0 b0Var2 = e.r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, b0Var, b0Var2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != b0Var) {
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
