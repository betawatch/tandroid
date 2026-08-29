package jd;

import i7.a7;
import i7.c7;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class l0 extends qd.i {
    public int c;

    public l0(int i10) {
        super(0L, qd.k.g);
        this.c = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract sc.c f();

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
            a7.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.j.b(th2);
        e0.m(new ad.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), f().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (jd.f1) r7.get(jd.b0.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = qc.i.a;
        a5.c cVar = this.b;
        try {
            sc.c f9 = f();
            kotlin.jvm.internal.j.c(f9, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            od.h hVar = (od.h) f9;
            uc.c cVar2 = hVar.e;
            Object obj2 = hVar.h;
            sc.h context = cVar2.getContext();
            Object k9 = od.a.k(context, obj2);
            g2 v = k9 != od.a.f ? e0.v(cVar2, context, k9) : null;
            try {
                sc.h context2 = cVar2.getContext();
                Object j10 = j();
                Throwable g10 = g(j10);
                if (g10 == null) {
                    int i10 = this.c;
                    boolean z10 = true;
                    if (i10 != 1 && i10 != 2) {
                        z10 = false;
                    }
                }
                f1 f1Var = null;
                if (f1Var != null && !f1Var.isActive()) {
                    CancellationException cancellationException = f1Var.getCancellationException();
                    c(j10, cancellationException);
                    cVar2.resumeWith(c7.a(cancellationException));
                } else if (g10 != null) {
                    cVar2.resumeWith(c7.a(g10));
                } else {
                    cVar2.resumeWith(h(j10));
                }
                if (v == null || v.M()) {
                    od.a.f(context, k9);
                }
                try {
                    cVar.getClass();
                } catch (Throwable th2) {
                    obj = c7.a(th2);
                }
                i(null, qc.f.a(obj));
            } catch (Throwable th3) {
                if (v == null || v.M()) {
                    od.a.f(context, k9);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                cVar.getClass();
            } catch (Throwable th5) {
                obj = c7.a(th5);
            }
            i(th4, qc.f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
