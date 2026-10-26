package ce;

import a8.jd;
import a8.pe;
import a8.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class a extends v1 implements ld.c, c0 {
    public final ld.h c;

    public a(ld.h hVar, boolean z10) {
        super(z10);
        x((g1) hVar.get(b0.b));
        this.c = hVar.plus(this);
    }

    @Override // ce.v1
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, ud.p pVar) {
        Object invoke;
        int ordinal = d0Var.ordinal();
        if (ordinal == 0) {
            wc.a(pVar, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.i.e(pVar, "<this>");
                pe.b(pe.a(aVar, this, pVar)).resumeWith(jd.i.a);
                return;
            }
            if (ordinal != 3) {
                throw new androidx.car.app.j();
            }
            try {
                ld.h hVar = this.c;
                Object k10 = he.a.k(hVar, null);
                try {
                    if (pVar instanceof nd.a) {
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        kotlin.jvm.internal.i.e(pVar, "<this>");
                        ld.h hVar2 = this.c;
                        Object dVar = hVar2 == ld.i.a ? new md.d(this) : new md.e(this, hVar2);
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, dVar);
                    }
                    if (invoke != md.a.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    he.a.f(hVar, k10);
                }
            } catch (Throwable th2) {
                resumeWith(jd.a(th2));
            }
        }
    }

    @Override // ce.c0
    public final ld.h c() {
        return this.c;
    }

    @Override // ld.c
    public final ld.h getContext() {
        return this.c;
    }

    @Override // ce.v1
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // ld.c
    public final void resumeWith(Object obj) {
        Throwable a2 = jd.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == f0.e) {
            return;
        }
        g(B);
    }

    @Override // ce.v1
    public final void w(androidx.car.app.j jVar) {
        f0.m(jVar, this.c);
    }
}
