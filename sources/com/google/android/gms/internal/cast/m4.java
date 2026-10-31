package com.google.android.gms.internal.cast;

import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m4 implements d6.h {
    public final /* synthetic */ bh.d a;

    public /* synthetic */ m4(bh.d dVar) {
        this.a = dVar;
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void A(d6.f fVar) {
    }

    @Override // d6.h
    public void F(d6.f fVar, String str) {
        u6 u6Var = new u6(new a5.a(4, 3));
        bh.d dVar = this.a;
        bh.d.O(dVar, u6Var);
        t6 t6Var = (t6) dVar.d;
        n6.l.g(t6Var);
        t6Var.a((d6.c) fVar);
        t6 t6Var2 = (t6) dVar.d;
        n6.l.g(t6Var2);
        String str2 = t6Var2.k;
        if (str2 == null) {
            t6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            t6Var2.b(4);
        }
    }

    @Override // d6.h
    public void G(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(6, 3);
        aVar.c = Integer.valueOf(i10);
        u6 u6Var = new u6(aVar);
        bh.d dVar = this.a;
        bh.d.O(dVar, u6Var);
        t6 t6Var = (t6) dVar.d;
        n6.l.g(t6Var);
        t6Var.a((d6.c) fVar);
    }

    @Override // d6.h
    public void j(d6.f fVar, String str) {
        u6 u6Var = new u6(new a5.a(7, 3));
        bh.d dVar = this.a;
        bh.d.O(dVar, u6Var);
        t6 t6Var = (t6) dVar.d;
        n6.l.g(t6Var);
        t6Var.a((d6.c) fVar);
        t6 t6Var2 = (t6) dVar.d;
        n6.l.g(t6Var2);
        String str2 = t6Var2.k;
        if (str2 == null) {
            t6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            t6Var2.b(4);
        }
    }

    @Override // d6.h
    public void k(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(5, 3);
        aVar.c = Integer.valueOf(i10);
        u6 u6Var = new u6(aVar);
        bh.d dVar = this.a;
        bh.d.O(dVar, u6Var);
        dVar.Q();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void o(d6.f fVar, boolean z10) {
        u6 u6Var = new u6(new a5.a(4, 3));
        bh.d dVar = this.a;
        bh.d.O(dVar, u6Var);
        t6 t6Var = (t6) dVar.d;
        n6.l.g(t6Var);
        t6Var.a((d6.c) fVar);
    }

    @Override // d6.h
    public void q(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(9, 3);
        aVar.c = Integer.valueOf(i10);
        bh.d dVar = this.a;
        aVar.d = Boolean.valueOf(((c) dVar.b).d == 2);
        bh.d.O(dVar, new u6(aVar));
        dVar.Q();
    }

    @Override // d6.h
    public void t(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        a5.a aVar = new a5.a(2, 3);
        bh.d dVar = this.a;
        aVar.d = Boolean.valueOf(((c) dVar.b).d == 2);
        bh.d.O(dVar, new u6(aVar));
        t6 t6Var = (t6) dVar.d;
        n6.l.g(t6Var);
        t6Var.a(cVar);
        cVar.l = (m4) dVar.e;
    }

    @Override // d6.h
    public void u(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(8, 3);
        aVar.c = Integer.valueOf(i10);
        u6 u6Var = new u6(aVar);
        bh.d dVar = this.a;
        bh.d.O(dVar, u6Var);
        dVar.Q();
    }
}
