package be;

import v7.i8;
import v7.t7;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class a extends v1 implements kd.c, c0 {
    public final kd.h c;

    public a(kd.h hVar, boolean z10) {
        super(z10);
        x((g1) hVar.get(b0.b));
        this.c = hVar.plus(this);
    }

    @Override // be.v1
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, td.p pVar) {
        Object invoke;
        int ordinal = d0Var.ordinal();
        if (ordinal == 0) {
            t7.a(pVar, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.i.e(pVar, "<this>");
                w7.n.b(w7.n.a(aVar, this, pVar)).resumeWith(id.i.a);
                return;
            }
            if (ordinal != 3) {
                throw new androidx.car.app.j();
            }
            try {
                kd.h hVar = this.c;
                Object k10 = ge.a.k(hVar, null);
                try {
                    if (pVar instanceof md.a) {
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        kotlin.jvm.internal.i.e(pVar, "<this>");
                        kd.h hVar2 = this.c;
                        Object dVar = hVar2 == kd.i.a ? new ld.d(this) : new ld.e(this, hVar2);
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, dVar);
                    }
                    if (invoke != ld.a.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    ge.a.f(hVar, k10);
                }
            } catch (Throwable th2) {
                resumeWith(i8.a(th2));
            }
        }
    }

    @Override // be.c0
    public final kd.h c() {
        return this.c;
    }

    @Override // kd.c
    public final kd.h getContext() {
        return this.c;
    }

    @Override // be.v1
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kd.c
    public final void resumeWith(Object obj) {
        Throwable a2 = id.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == f0.e) {
            return;
        }
        g(B);
    }

    @Override // be.v1
    public final void w(androidx.car.app.j jVar) {
        f0.m(jVar, this.c);
    }
}
