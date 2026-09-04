package ee;

import com.google.android.gms.internal.vision.e2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.a0;
import zd.c2;
import zd.e0;
import zd.l0;
import zd.w0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class h extends l0 implements kd.d, id.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final kd.c e;
    public Object f;
    public final Object h;

    public h(a0 a0Var, kd.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f = a.c;
        Object fold = cVar.getContext().fold(0, w.c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override // zd.l0
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof zd.w) {
            throw null;
        }
    }

    @Override // kd.d
    public final kd.d getCallerFrame() {
        kd.c cVar = this.e;
        if (e2.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // id.c
    public final id.h getContext() {
        return this.e.getContext();
    }

    @Override // zd.l0
    public final Object j() {
        Object obj = this.f;
        this.f = a.c;
        return obj;
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        kd.c cVar = this.e;
        id.h context = cVar.getContext();
        Throwable a2 = gd.f.a(obj);
        Object vVar = a2 == null ? obj : new zd.v(a2, false);
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
            hd.e eVar = a10.e;
            if (eVar == null) {
                eVar = new hd.e();
                a10.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            id.h context2 = cVar.getContext();
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
        return "DispatchedContinuation[" + this.d + ", " + e0.t(this.e) + ']';
    }

    @Override // zd.l0
    public final id.c f() {
        return this;
    }
}
