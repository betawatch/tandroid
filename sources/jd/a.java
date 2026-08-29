package jd;

import i7.c7;
import i7.r6;
import i7.v7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a extends u1 implements sc.c, c0 {
    public final sc.h c;

    public a(sc.h hVar, boolean z10) {
        super(z10);
        x((f1) hVar.get(b0.b));
        this.c = hVar.plus(this);
    }

    @Override // jd.u1
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, bd.p pVar) {
        Object invoke;
        int ordinal = d0Var.ordinal();
        if (ordinal == 0) {
            r6.a(pVar, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.j.e(pVar, "<this>");
                v7.b(v7.a(pVar, aVar, this)).resumeWith(qc.i.a);
                return;
            }
            if (ordinal != 3) {
                throw new a6.b();
            }
            try {
                sc.h hVar = this.c;
                Object k9 = od.a.k(hVar, null);
                try {
                    if (pVar instanceof uc.a) {
                        kotlin.jvm.internal.t.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        kotlin.jvm.internal.j.e(pVar, "<this>");
                        sc.h hVar2 = this.c;
                        Object dVar = hVar2 == sc.i.a ? new tc.d(this) : new tc.e(this, hVar2);
                        kotlin.jvm.internal.t.a(2, pVar);
                        invoke = pVar.invoke(aVar, dVar);
                    }
                    if (invoke != tc.a.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    od.a.f(hVar, k9);
                }
            } catch (Throwable th2) {
                resumeWith(c7.a(th2));
            }
        }
    }

    @Override // jd.c0
    public final sc.h c() {
        return this.c;
    }

    @Override // sc.c
    public final sc.h getContext() {
        return this.c;
    }

    @Override // jd.u1
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // sc.c
    public final void resumeWith(Object obj) {
        Throwable a2 = qc.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == e0.e) {
            return;
        }
        g(B);
    }

    @Override // jd.u1
    public final void w(a6.b bVar) {
        e0.m(bVar, this.c);
    }
}
