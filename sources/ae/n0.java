package ae;

import java.util.concurrent.CancellationException;
import v7.a8;
import v7.y7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class n0 extends he.i {
    public int c;

    public n0(int i10) {
        super(0L, he.k.g);
        this.c = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract jd.c f();

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
            y7.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.i.b(th2);
        g0.m(new f0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), f().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (ae.h1) r7.get(ae.c0.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = hd.i.a;
        com.google.android.gms.internal.cast.a aVar = this.b;
        try {
            jd.c f7 = f();
            kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            fe.h hVar = (fe.h) f7;
            ld.c cVar = hVar.e;
            Object obj2 = hVar.h;
            jd.h context = cVar.getContext();
            Object k10 = fe.a.k(context, obj2);
            i2 v = k10 != fe.a.f ? g0.v(cVar, context, k10) : null;
            try {
                jd.h context2 = cVar.getContext();
                Object j3 = j();
                Throwable g10 = g(j3);
                if (g10 == null) {
                    int i10 = this.c;
                    boolean z10 = true;
                    if (i10 != 1 && i10 != 2) {
                        z10 = false;
                    }
                }
                h1 h1Var = null;
                if (h1Var != null && !h1Var.isActive()) {
                    CancellationException cancellationException = h1Var.getCancellationException();
                    c(j3, cancellationException);
                    cVar.resumeWith(a8.a(cancellationException));
                } else if (g10 != null) {
                    cVar.resumeWith(a8.a(g10));
                } else {
                    cVar.resumeWith(h(j3));
                }
                if (v == null || v.M()) {
                    fe.a.f(context, k10);
                }
                try {
                    aVar.getClass();
                } catch (Throwable th2) {
                    obj = a8.a(th2);
                }
                i(null, hd.f.a(obj));
            } catch (Throwable th3) {
                if (v == null || v.M()) {
                    fe.a.f(context, k10);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                aVar.getClass();
            } catch (Throwable th5) {
                obj = a8.a(th5);
            }
            i(th4, hd.f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
