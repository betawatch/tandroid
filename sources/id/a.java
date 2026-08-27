package id;

import h7.h7;
import h7.k6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class a extends v1 implements rc.c, c0 {
    public final rc.h c;

    public a(rc.h hVar, boolean z10) {
        super(z10);
        x((g1) hVar.get(b0.b));
        this.c = hVar.plus(this);
    }

    @Override // id.v1
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, ad.p pVar) {
        Object invoke;
        int ordinal = d0Var.ordinal();
        if (ordinal == 0) {
            h7.h0.a(pVar, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.j.e(pVar, "<this>");
                h7.b(h7.a(pVar, aVar, this)).resumeWith(pc.i.a);
                return;
            }
            if (ordinal != 3) {
                throw new a7.c();
            }
            try {
                rc.h hVar = this.c;
                Object k10 = nd.a.k(hVar, null);
                try {
                    if (pVar instanceof tc.a) {
                        kotlin.jvm.internal.t.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        kotlin.jvm.internal.j.e(pVar, "<this>");
                        rc.h hVar2 = this.c;
                        Object dVar = hVar2 == rc.i.a ? new sc.d(this) : new sc.e(this, hVar2);
                        kotlin.jvm.internal.t.a(2, pVar);
                        invoke = pVar.invoke(aVar, dVar);
                    }
                    if (invoke != sc.a.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    nd.a.f(hVar, k10);
                }
            } catch (Throwable th) {
                resumeWith(k6.a(th));
            }
        }
    }

    @Override // id.c0
    public final rc.h c() {
        return this.c;
    }

    @Override // rc.c
    public final rc.h getContext() {
        return this.c;
    }

    @Override // id.v1
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // rc.c
    public final void resumeWith(Object obj) {
        Throwable a2 = pc.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == f0.e) {
            return;
        }
        g(B);
    }

    @Override // id.v1
    public final void w(a7.c cVar) {
        f0.m(cVar, this.c);
    }
}
