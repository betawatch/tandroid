package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
import zd.i0;
import zd.t0;
import zd.v1;
import zd.x;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class f extends i0 implements kd.d, id.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final x d;
    public final kd.c e;
    public Object f;
    public final Object h;

    public f(x xVar, kd.c cVar) {
        super(-1);
        this.d = xVar;
        this.e = cVar;
        this.f = a.b;
        this.h = a.k(cVar.getContext());
    }

    @Override // kd.d
    public final kd.d getCallerFrame() {
        return this.e;
    }

    @Override // id.c
    public final id.h getContext() {
        return this.e.getContext();
    }

    @Override // zd.i0
    public final Object j() {
        Object obj = this.f;
        this.f = a.b;
        return obj;
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        Throwable a10 = gd.g.a(obj);
        Object vVar = a10 == null ? obj : new zd.v(a10, false);
        kd.c cVar = this.e;
        id.h context = cVar.getContext();
        x xVar = this.d;
        if (xVar.d(context)) {
            this.f = vVar;
            this.c = 0;
            xVar.c(cVar.getContext(), this);
            return;
        }
        t0 a11 = v1.a();
        if (a11.c >= 4294967296L) {
            this.f = vVar;
            this.c = 0;
            hd.d dVar = a11.e;
            if (dVar == null) {
                dVar = new hd.d();
                a11.e = dVar;
            }
            dVar.addLast(this);
            return;
        }
        a11.i(true);
        try {
            id.h context2 = cVar.getContext();
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

    @Override // zd.i0
    public final id.c c() {
        return this;
    }
}
