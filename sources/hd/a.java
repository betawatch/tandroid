package hd;

import g7.g7;
import g7.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a extends v1 implements qc.c, c0 {
    public final qc.h c;

    public a(qc.h hVar, boolean z10) {
        super(z10);
        x((g1) hVar.get(b0.b));
        this.c = hVar.plus(this);
    }

    @Override // hd.v1
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, zc.p pVar) {
        Object invoke;
        int ordinal = d0Var.ordinal();
        if (ordinal == 0) {
            g7.f0.a(pVar, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.i.e(pVar, "<this>");
                g7.b(g7.a(aVar, this, pVar)).resumeWith(oc.i.a);
                return;
            }
            if (ordinal != 3) {
                throw new androidx.car.app.j();
            }
            try {
                qc.h hVar = this.c;
                Object k10 = md.a.k(hVar, null);
                try {
                    if (pVar instanceof sc.a) {
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        kotlin.jvm.internal.i.e(pVar, "<this>");
                        qc.h hVar2 = this.c;
                        Object dVar = hVar2 == qc.i.a ? new rc.d(this) : new rc.e(this, hVar2);
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, dVar);
                    }
                    if (invoke != rc.a.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    md.a.f(hVar, k10);
                }
            } catch (Throwable th) {
                resumeWith(y5.a(th));
            }
        }
    }

    @Override // hd.c0
    public final qc.h c() {
        return this.c;
    }

    @Override // qc.c
    public final qc.h getContext() {
        return this.c;
    }

    @Override // hd.v1
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // qc.c
    public final void resumeWith(Object obj) {
        Throwable a2 = oc.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == f0.e) {
            return;
        }
        g(B);
    }

    @Override // hd.v1
    public final void w(androidx.car.app.j jVar) {
        f0.m(jVar, this.c);
    }
}
