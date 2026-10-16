package be;

import java.util.concurrent.CancellationException;
import v7.g8;
import v7.i8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class m0 extends ie.i {
    public int c;

    public m0(int i10) {
        super(0L, ie.k.g);
        this.c = i10;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract kd.c c();

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
            g8.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.i.b(th2);
        f0.m(new e0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), c().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (be.g1) r7.get(be.b0.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = id.i.a;
        com.google.android.gms.internal.cast.a aVar = this.b;
        try {
            kd.c c10 = c();
            kotlin.jvm.internal.i.c(c10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            ge.h hVar = (ge.h) c10;
            md.c cVar = hVar.e;
            Object obj2 = hVar.h;
            kd.h context = cVar.getContext();
            Object k10 = ge.a.k(context, obj2);
            h2 v = k10 != ge.a.f ? f0.v(cVar, context, k10) : null;
            try {
                kd.h context2 = cVar.getContext();
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
                    b(j10, cancellationException);
                    cVar.resumeWith(i8.a(cancellationException));
                } else if (g10 != null) {
                    cVar.resumeWith(i8.a(g10));
                } else {
                    cVar.resumeWith(h(j10));
                }
                if (v == null || v.M()) {
                    ge.a.f(context, k10);
                }
                try {
                    aVar.getClass();
                } catch (Throwable th2) {
                    obj = i8.a(th2);
                }
                i(null, id.f.a(obj));
            } catch (Throwable th3) {
                if (v == null || v.M()) {
                    ge.a.f(context, k10);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                aVar.getClass();
            } catch (Throwable th5) {
                obj = i8.a(th5);
            }
            i(th4, id.f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
