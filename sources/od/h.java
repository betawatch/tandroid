package od;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.a0;
import jd.c2;
import jd.e0;
import jd.l0;
import jd.w0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h extends l0 implements uc.d, sc.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final uc.c e;
    public Object f;
    public final Object h;

    public h(a0 a0Var, uc.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f = a.c;
        Object fold = cVar.getContext().fold(0, x.c);
        kotlin.jvm.internal.j.b(fold);
        this.h = fold;
    }

    @Override // jd.l0
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof jd.w) {
            throw null;
        }
    }

    @Override // uc.d
    public final uc.d getCallerFrame() {
        uc.c cVar = this.e;
        if (com.google.android.recaptcha.internal.a.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // sc.c
    public final sc.h getContext() {
        return this.e.getContext();
    }

    @Override // jd.l0
    public final Object j() {
        Object obj = this.f;
        this.f = a.c;
        return obj;
    }

    @Override // sc.c
    public final void resumeWith(Object obj) {
        uc.c cVar = this.e;
        sc.h context = cVar.getContext();
        Throwable a2 = qc.f.a(obj);
        Object vVar = a2 == null ? obj : new jd.v(a2, false);
        a0 a0Var = this.d;
        if (a0Var.e()) {
            this.f = vVar;
            this.c = 0;
            a0Var.c(context, this);
            return;
        }
        w0 a10 = c2.a();
        if (a10.c >= 4294967296L) {
            this.f = vVar;
            this.c = 0;
            rc.e eVar = a10.e;
            if (eVar == null) {
                eVar = new rc.e();
                a10.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            sc.h context2 = cVar.getContext();
            Object k9 = a.k(context2, this.h);
            try {
                cVar.resumeWith(obj);
                while (a10.j()) {
                }
            } finally {
                a.f(context2, k9);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + e0.t(this.e) + ']';
    }

    @Override // jd.l0
    public final sc.c f() {
        return this;
    }
}
