package he;

import c3.h0;
import ce.a0;
import ce.d2;
import ce.f0;
import ce.m0;
import ce.x0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h extends m0 implements nd.d, ld.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final nd.c e;
    public Object f;
    public final Object h;

    public h(a0 a0Var, nd.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f = a.c;
        Object fold = cVar.getContext().fold(0, x.c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override // ce.m0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof ce.w) {
            throw null;
        }
    }

    @Override // nd.d
    public final nd.d getCallerFrame() {
        nd.c cVar = this.e;
        if (h0.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // ld.c
    public final ld.h getContext() {
        return this.e.getContext();
    }

    @Override // ce.m0
    public final Object j() {
        Object obj = this.f;
        this.f = a.c;
        return obj;
    }

    @Override // ld.c
    public final void resumeWith(Object obj) {
        nd.c cVar = this.e;
        ld.h context = cVar.getContext();
        Throwable a2 = jd.f.a(obj);
        Object vVar = a2 == null ? obj : new ce.v(a2, false);
        a0 a0Var = this.d;
        if (a0Var.d()) {
            this.f = vVar;
            this.c = 0;
            a0Var.c(context, this);
            return;
        }
        x0 a10 = d2.a();
        if (a10.c >= 4294967296L) {
            this.f = vVar;
            this.c = 0;
            kd.e eVar = a10.e;
            if (eVar == null) {
                eVar = new kd.e();
                a10.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            ld.h context2 = cVar.getContext();
            Object k10 = a.k(context2, this.h);
            try {
                cVar.resumeWith(obj);
                while (a10.j()) {
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

    @Override // ce.m0
    public final ld.c c() {
        return this;
    }
}
