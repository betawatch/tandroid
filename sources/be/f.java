package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wd.b0;
import wd.i0;
import wd.t0;
import wd.v1;
import wd.x;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends i0 implements hd.d, fd.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final x d;
    public final hd.c e;
    public Object f;
    public final Object h;

    public f(x xVar, hd.c cVar) {
        super(-1);
        this.d = xVar;
        this.e = cVar;
        this.f = a.b;
        this.h = a.k(cVar.getContext());
    }

    @Override // hd.d
    public final hd.d getCallerFrame() {
        return this.e;
    }

    @Override // fd.c
    public final fd.h getContext() {
        return this.e.getContext();
    }

    @Override // wd.i0
    public final Object j() {
        Object obj = this.f;
        this.f = a.b;
        return obj;
    }

    @Override // fd.c
    public final void resumeWith(Object obj) {
        Throwable a10 = dd.g.a(obj);
        Object vVar = a10 == null ? obj : new wd.v(a10, false);
        hd.c cVar = this.e;
        fd.h context = cVar.getContext();
        x xVar = this.d;
        if (xVar.e(context)) {
            this.f = vVar;
            this.c = 0;
            xVar.c(cVar.getContext(), this);
            return;
        }
        t0 a11 = v1.a();
        if (a11.c >= 4294967296L) {
            this.f = vVar;
            this.c = 0;
            ed.e eVar = a11.e;
            if (eVar == null) {
                eVar = new ed.e();
                a11.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a11.i(true);
        try {
            fd.h context2 = cVar.getContext();
            Object l10 = a.l(context2, this.h);
            try {
                cVar.resumeWith(obj);
                while (a11.k()) {
                }
            } finally {
                a.g(context2, l10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + b0.v(this.e) + ']';
    }

    @Override // wd.i0
    public final fd.c c() {
        return this;
    }
}
