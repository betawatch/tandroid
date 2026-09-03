package ld;

import k7.g7;
import k7.h8;
import k7.q7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class a extends u1 implements uc.c, c0 {
    public final uc.h c;

    public a(uc.h hVar, boolean z4) {
        super(z4);
        x((f1) hVar.get(b0.b));
        this.c = hVar.plus(this);
    }

    @Override // ld.u1
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, dd.p pVar) {
        Object invoke;
        int ordinal = d0Var.ordinal();
        if (ordinal == 0) {
            g7.a(pVar, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.j.e(pVar, "<this>");
                h8.b(h8.a(pVar, aVar, this)).resumeWith(sc.i.a);
                return;
            }
            if (ordinal != 3) {
                throw new a7.b();
            }
            try {
                uc.h hVar = this.c;
                Object k10 = qd.a.k(hVar, null);
                try {
                    if (pVar instanceof wc.a) {
                        kotlin.jvm.internal.t.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        kotlin.jvm.internal.j.e(pVar, "<this>");
                        uc.h hVar2 = this.c;
                        Object dVar = hVar2 == uc.i.a ? new vc.d(this) : new vc.e(this, hVar2);
                        kotlin.jvm.internal.t.a(2, pVar);
                        invoke = pVar.invoke(aVar, dVar);
                    }
                    if (invoke != vc.a.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    qd.a.f(hVar, k10);
                }
            } catch (Throwable th2) {
                resumeWith(q7.a(th2));
            }
        }
    }

    @Override // ld.c0
    public final uc.h c() {
        return this.c;
    }

    @Override // uc.c
    public final uc.h getContext() {
        return this.c;
    }

    @Override // ld.u1
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // uc.c
    public final void resumeWith(Object obj) {
        Throwable a2 = sc.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == e0.e) {
            return;
        }
        g(B);
    }

    @Override // ld.u1
    public final void w(a7.b bVar) {
        e0.m(bVar, this.c);
    }
}
