package fe;

import ae.b0;
import ae.g0;
import ae.n0;
import ae.y0;
import com.google.android.gms.internal.vision.e2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h extends n0 implements ld.d, jd.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final b0 d;
    public final ld.c e;
    public Object f;
    public final Object h;

    public h(b0 b0Var, ld.c cVar) {
        super(-1);
        this.d = b0Var;
        this.e = cVar;
        this.f = a.c;
        Object fold = cVar.getContext().fold(0, w.c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override // ae.n0
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof ae.w) {
            throw null;
        }
    }

    @Override // ld.d
    public final ld.d getCallerFrame() {
        ld.c cVar = this.e;
        if (e2.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // jd.c
    public final jd.h getContext() {
        return this.e.getContext();
    }

    @Override // ae.n0
    public final Object j() {
        Object obj = this.f;
        this.f = a.c;
        return obj;
    }

    @Override // jd.c
    public final void resumeWith(Object obj) {
        ld.c cVar = this.e;
        jd.h context = cVar.getContext();
        Throwable a2 = hd.f.a(obj);
        Object vVar = a2 == null ? obj : new ae.v(a2, false);
        b0 b0Var = this.d;
        if (b0Var.e()) {
            this.f = vVar;
            this.c = 0;
            b0Var.c(context, this);
            return;
        }
        y0 a10 = ae.e2.a();
        if (a10.c >= 4294967296L) {
            this.f = vVar;
            this.c = 0;
            id.e eVar = a10.e;
            if (eVar == null) {
                eVar = new id.e();
                a10.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            jd.h context2 = cVar.getContext();
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
        return "DispatchedContinuation[" + this.d + ", " + g0.t(this.e) + ']';
    }

    @Override // ae.n0
    public final jd.c f() {
        return this;
    }
}
