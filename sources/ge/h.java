package ge;

import be.a0;
import be.d2;
import be.f0;
import be.m0;
import be.x0;
import com.google.android.gms.internal.play_billing.k3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h extends m0 implements md.d, kd.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final md.c e;
    public Object f;
    public final Object h;

    public h(a0 a0Var, md.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f = a.c;
        Object fold = cVar.getContext().fold(0, w.c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override // be.m0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof be.w) {
            throw null;
        }
    }

    @Override // md.d
    public final md.d getCallerFrame() {
        md.c cVar = this.e;
        if (k3.s(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // kd.c
    public final kd.h getContext() {
        return this.e.getContext();
    }

    @Override // be.m0
    public final Object j() {
        Object obj = this.f;
        this.f = a.c;
        return obj;
    }

    @Override // kd.c
    public final void resumeWith(Object obj) {
        md.c cVar = this.e;
        kd.h context = cVar.getContext();
        Throwable a2 = id.f.a(obj);
        Object vVar = a2 == null ? obj : new be.v(a2, false);
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
            jd.e eVar = a10.e;
            if (eVar == null) {
                eVar = new jd.e();
                a10.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            kd.h context2 = cVar.getContext();
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

    @Override // be.m0
    public final kd.c c() {
        return this;
    }
}
