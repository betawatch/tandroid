package md;

import hd.a0;
import hd.d2;
import hd.f0;
import hd.m0;
import hd.x0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends m0 implements sc.d, qc.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final sc.c e;
    public Object f;
    public final Object h;

    public h(a0 a0Var, sc.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f = a.c;
        Object fold = cVar.getContext().fold(0, w.c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override // hd.m0
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof hd.w) {
            throw null;
        }
    }

    @Override // sc.d
    public final sc.d getCallerFrame() {
        sc.c cVar = this.e;
        if (e2.c.v(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // qc.c
    public final qc.h getContext() {
        return this.e.getContext();
    }

    @Override // hd.m0
    public final Object j() {
        Object obj = this.f;
        this.f = a.c;
        return obj;
    }

    @Override // qc.c
    public final void resumeWith(Object obj) {
        sc.c cVar = this.e;
        qc.h context = cVar.getContext();
        Throwable a2 = oc.f.a(obj);
        Object vVar = a2 == null ? obj : new hd.v(a2, false);
        a0 a0Var = this.d;
        if (a0Var.e()) {
            this.f = vVar;
            this.c = 0;
            a0Var.c(context, this);
            return;
        }
        x0 a3 = d2.a();
        if (a3.c >= 4294967296L) {
            this.f = vVar;
            this.c = 0;
            pc.e eVar = a3.e;
            if (eVar == null) {
                eVar = new pc.e();
                a3.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a3.h(true);
        try {
            qc.h context2 = cVar.getContext();
            Object k10 = a.k(context2, this.h);
            try {
                cVar.resumeWith(obj);
                while (a3.j()) {
                }
            } finally {
                a.f(context2, k10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + f0.t(this.e) + ']';
    }

    @Override // hd.m0
    public final qc.c f() {
        return this;
    }
}
