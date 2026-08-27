package nd;

import id.a0;
import id.d2;
import id.f0;
import id.m0;
import id.x0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h extends m0 implements tc.d, rc.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final tc.c e;
    public Object f;
    public final Object h;

    public h(a0 a0Var, tc.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f = a.c;
        Object fold = cVar.getContext().fold(0, w.c);
        kotlin.jvm.internal.j.b(fold);
        this.h = fold;
    }

    @Override // id.m0
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof id.w) {
            throw null;
        }
    }

    @Override // tc.d
    public final tc.d getCallerFrame() {
        tc.c cVar = this.e;
        if (com.google.android.recaptcha.internal.a.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // rc.c
    public final rc.h getContext() {
        return this.e.getContext();
    }

    @Override // id.m0
    public final Object j() {
        Object obj = this.f;
        this.f = a.c;
        return obj;
    }

    @Override // rc.c
    public final void resumeWith(Object obj) {
        tc.c cVar = this.e;
        rc.h context = cVar.getContext();
        Throwable a2 = pc.f.a(obj);
        Object vVar = a2 == null ? obj : new id.v(a2, false);
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
            qc.e eVar = a3.e;
            if (eVar == null) {
                eVar = new qc.e();
                a3.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a3.h(true);
        try {
            rc.h context2 = cVar.getContext();
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

    @Override // id.m0
    public final rc.c f() {
        return this;
    }
}
