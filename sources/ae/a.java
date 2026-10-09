package ae;

import v7.a8;
import v7.p7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class a extends w1 implements jd.c, d0 {
    public final jd.h c;

    public a(jd.h hVar, boolean z10) {
        super(z10);
        x((h1) hVar.get(c0.b));
        this.c = hVar.plus(this);
    }

    @Override // ae.w1
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.b.get((v) obj);
        }
    }

    public final void L(e0 e0Var, a aVar, sd.p pVar) {
        Object invoke;
        int ordinal = e0Var.ordinal();
        if (ordinal == 0) {
            p7.a(pVar, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.i.e(pVar, "<this>");
                w7.h.b(w7.h.a(aVar, this, pVar)).resumeWith(hd.i.a);
                return;
            }
            if (ordinal != 3) {
                throw new x();
            }
            try {
                jd.h hVar = this.c;
                Object k10 = fe.a.k(hVar, null);
                try {
                    if (pVar instanceof ld.a) {
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        kotlin.jvm.internal.i.e(pVar, "<this>");
                        jd.h hVar2 = this.c;
                        Object dVar = hVar2 == jd.i.a ? new kd.d(this) : new kd.e(this, hVar2);
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, dVar);
                    }
                    if (invoke != kd.a.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    fe.a.f(hVar, k10);
                }
            } catch (Throwable th2) {
                resumeWith(a8.a(th2));
            }
        }
    }

    @Override // ae.d0
    public final jd.h c() {
        return this.c;
    }

    @Override // jd.c
    public final jd.h getContext() {
        return this.c;
    }

    @Override // ae.w1
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // jd.c
    public final void resumeWith(Object obj) {
        Throwable a2 = hd.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == g0.e) {
            return;
        }
        g(B);
    }

    @Override // ae.w1
    public final void w(x xVar) {
        g0.m(xVar, this.c);
    }
}
