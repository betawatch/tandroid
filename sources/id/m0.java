package id;

import h7.i6;
import h7.k6;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class m0 extends pd.i {
    public int c;

    public m0(int i10) {
        super(0L, pd.k.g);
        this.c = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract rc.c f();

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
            i6.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.j.b(th);
        f0.m(new e0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), f().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r7 = (id.g1) r7.get(id.b0.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = pc.i.a;
        com.google.android.gms.internal.cast.a aVar = this.b;
        try {
            rc.c f10 = f();
            kotlin.jvm.internal.j.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            nd.h hVar = (nd.h) f10;
            tc.c cVar = hVar.e;
            Object obj2 = hVar.h;
            rc.h context = cVar.getContext();
            Object k10 = nd.a.k(context, obj2);
            h2 v = k10 != nd.a.f ? f0.v(cVar, context, k10) : null;
            try {
                rc.h context2 = cVar.getContext();
                Object j10 = j();
                Throwable g10 = g(j10);
                if (g10 == null) {
                    int i10 = this.c;
                    boolean z10 = true;
                    if (i10 != 1 && i10 != 2) {
                        z10 = false;
                    }
                }
                g1 g1Var = null;
                if (g1Var != null && !g1Var.isActive()) {
                    CancellationException cancellationException = g1Var.getCancellationException();
                    c(j10, cancellationException);
                    cVar.resumeWith(k6.a(cancellationException));
                } else if (g10 != null) {
                    cVar.resumeWith(k6.a(g10));
                } else {
                    cVar.resumeWith(h(j10));
                }
                if (v == null || v.M()) {
                    nd.a.f(context, k10);
                }
                try {
                    aVar.getClass();
                } catch (Throwable th) {
                    obj = k6.a(th);
                }
                i(null, pc.f.a(obj));
            } catch (Throwable th2) {
                if (v == null || v.M()) {
                    nd.a.f(context, k10);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                aVar.getClass();
            } catch (Throwable th4) {
                obj = k6.a(th4);
            }
            i(th3, pc.f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
