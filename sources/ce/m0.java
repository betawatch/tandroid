package ce;

import a8.hd;
import a8.jd;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class m0 extends je.i {
    public int c;

    public m0(int i10) {
        super(0L, je.k.g);
        this.c = i10;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract ld.c c();

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
            hd.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.i.b(th2);
        f0.m(new e0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), c().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (ce.g1) r7.get(ce.b0.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = jd.i.a;
        ag.j jVar = this.b;
        try {
            ld.c c10 = c();
            kotlin.jvm.internal.i.c(c10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            he.h hVar = (he.h) c10;
            nd.c cVar = hVar.e;
            Object obj2 = hVar.h;
            ld.h context = cVar.getContext();
            Object k10 = he.a.k(context, obj2);
            h2 v = k10 != he.a.f ? f0.v(cVar, context, k10) : null;
            try {
                ld.h context2 = cVar.getContext();
                Object j10 = j();
                Throwable g7 = g(j10);
                if (g7 == null) {
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
                    cVar.resumeWith(jd.a(cancellationException));
                } else if (g7 != null) {
                    cVar.resumeWith(jd.a(g7));
                } else {
                    cVar.resumeWith(h(j10));
                }
                if (v == null || v.M()) {
                    he.a.f(context, k10);
                }
                try {
                    jVar.getClass();
                } catch (Throwable th2) {
                    obj = jd.a(th2);
                }
                i(null, jd.f.a(obj));
            } catch (Throwable th3) {
                if (v == null || v.M()) {
                    he.a.f(context, k10);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                jVar.getClass();
            } catch (Throwable th5) {
                obj = jd.a(th5);
            }
            i(th4, jd.f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
