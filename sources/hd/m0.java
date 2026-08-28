package hd;

import g7.w5;
import g7.y5;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class m0 extends od.i {
    public int c;

    public m0(int i9) {
        super(0L, od.k.g);
        this.c = i9;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract qc.c f();

    public Throwable g(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            w5.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.i.b(th);
        f0.m(new e0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), f().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r7 = (hd.g1) r7.get(hd.b0.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = oc.i.a;
        com.google.android.gms.internal.cast.a aVar = this.b;
        try {
            qc.c f10 = f();
            kotlin.jvm.internal.i.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            md.h hVar = (md.h) f10;
            sc.c cVar = hVar.e;
            Object obj2 = hVar.h;
            qc.h context = cVar.getContext();
            Object k10 = md.a.k(context, obj2);
            h2 v = k10 != md.a.f ? f0.v(cVar, context, k10) : null;
            try {
                qc.h context2 = cVar.getContext();
                Object j10 = j();
                Throwable g10 = g(j10);
                if (g10 == null) {
                    int i9 = this.c;
                    boolean z10 = true;
                    if (i9 != 1 && i9 != 2) {
                        z10 = false;
                    }
                }
                g1 g1Var = null;
                if (g1Var != null && !g1Var.isActive()) {
                    CancellationException cancellationException = g1Var.getCancellationException();
                    c(j10, cancellationException);
                    cVar.resumeWith(y5.a(cancellationException));
                } else if (g10 != null) {
                    cVar.resumeWith(y5.a(g10));
                } else {
                    cVar.resumeWith(h(j10));
                }
                if (v == null || v.M()) {
                    md.a.f(context, k10);
                }
                try {
                    aVar.getClass();
                } catch (Throwable th) {
                    obj = y5.a(th);
                }
                i(null, oc.f.a(obj));
            } catch (Throwable th2) {
                if (v == null || v.M()) {
                    md.a.f(context, k10);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                aVar.getClass();
            } catch (Throwable th4) {
                obj = y5.a(th4);
            }
            i(th3, oc.f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
