package ld;

import java.util.concurrent.CancellationException;
import k7.o7;
import k7.q7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class l0 extends sd.i {
    public int c;

    public l0(int i10) {
        super(0L, sd.k.g);
        this.c = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract uc.c f();

    public Throwable g(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.a;
        }
        return null;
    }

    public final void i(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            o7.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.j.b(th2);
        e0.m(new cd.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), f().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (ld.f1) r7.get(ld.b0.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = sc.i.a;
        c5.c cVar = this.b;
        try {
            uc.c f10 = f();
            kotlin.jvm.internal.j.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            qd.h hVar = (qd.h) f10;
            wc.c cVar2 = hVar.e;
            Object obj2 = hVar.h;
            uc.h context = cVar2.getContext();
            Object k10 = qd.a.k(context, obj2);
            g2 v = k10 != qd.a.f ? e0.v(cVar2, context, k10) : null;
            try {
                uc.h context2 = cVar2.getContext();
                Object j10 = j();
                Throwable g10 = g(j10);
                if (g10 == null) {
                    int i10 = this.c;
                    boolean z4 = true;
                    if (i10 != 1 && i10 != 2) {
                        z4 = false;
                    }
                }
                f1 f1Var = null;
                if (f1Var != null && !f1Var.isActive()) {
                    CancellationException cancellationException = f1Var.getCancellationException();
                    c(j10, cancellationException);
                    cVar2.resumeWith(q7.a(cancellationException));
                } else if (g10 != null) {
                    cVar2.resumeWith(q7.a(g10));
                } else {
                    cVar2.resumeWith(h(j10));
                }
                if (v == null || v.M()) {
                    qd.a.f(context, k10);
                }
                try {
                    cVar.getClass();
                } catch (Throwable th2) {
                    obj = q7.a(th2);
                }
                i(null, sc.f.a(obj));
            } catch (Throwable th3) {
                if (v == null || v.M()) {
                    qd.a.f(context, k10);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                cVar.getClass();
            } catch (Throwable th5) {
                obj = q7.a(th5);
            }
            i(th4, sc.f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
