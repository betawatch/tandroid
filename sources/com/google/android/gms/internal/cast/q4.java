package com.google.android.gms.internal.cast;

import android.text.TextUtils;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class q4 implements d6.h {
    public final /* synthetic */ bi.u6 a;

    public /* synthetic */ q4(bi.u6 u6Var) {
        this.a = u6Var;
    }

    @Override // d6.h
    public void A(d6.f fVar, String str) {
        y6 y6Var = new y6(new a5.a(4, 2));
        bi.u6 u6Var = this.a;
        bi.u6.D(u6Var, y6Var);
        x6 x6Var = (x6) u6Var.d;
        n6.l.h(x6Var);
        x6Var.a((d6.c) fVar);
        x6 x6Var2 = (x6) u6Var.d;
        n6.l.h(x6Var2);
        String str2 = x6Var2.k;
        if (str2 == null) {
            x6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            x6Var2.b(4);
        }
    }

    @Override // d6.h
    public void B(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(6, 2);
        aVar.c = Integer.valueOf(i10);
        y6 y6Var = new y6(aVar);
        bi.u6 u6Var = this.a;
        bi.u6.D(u6Var, y6Var);
        x6 x6Var = (x6) u6Var.d;
        n6.l.h(x6Var);
        x6Var.a((d6.c) fVar);
    }

    @Override // d6.h
    public void b(d6.f fVar, String str) {
        y6 y6Var = new y6(new a5.a(7, 2));
        bi.u6 u6Var = this.a;
        bi.u6.D(u6Var, y6Var);
        x6 x6Var = (x6) u6Var.d;
        n6.l.h(x6Var);
        x6Var.a((d6.c) fVar);
        x6 x6Var2 = (x6) u6Var.d;
        n6.l.h(x6Var2);
        String str2 = x6Var2.k;
        if (str2 == null) {
            x6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            x6Var2.b(4);
        }
    }

    @Override // d6.h
    public void c(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(5, 2);
        aVar.c = Integer.valueOf(i10);
        y6 y6Var = new y6(aVar);
        bi.u6 u6Var = this.a;
        bi.u6.D(u6Var, y6Var);
        u6Var.F();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void d(d6.f fVar, boolean z10) {
        y6 y6Var = new y6(new a5.a(4, 2));
        bi.u6 u6Var = this.a;
        bi.u6.D(u6Var, y6Var);
        x6 x6Var = (x6) u6Var.d;
        n6.l.h(x6Var);
        x6Var.a((d6.c) fVar);
    }

    @Override // d6.h
    public void p(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(9, 2);
        aVar.c = Integer.valueOf(i10);
        bi.u6 u6Var = this.a;
        aVar.d = Boolean.valueOf(((d) u6Var.b).d == 2);
        bi.u6.D(u6Var, new y6(aVar));
        u6Var.F();
    }

    @Override // d6.h
    public void r(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        a5.a aVar = new a5.a(2, 2);
        bi.u6 u6Var = this.a;
        aVar.d = Boolean.valueOf(((d) u6Var.b).d == 2);
        bi.u6.D(u6Var, new y6(aVar));
        x6 x6Var = (x6) u6Var.d;
        n6.l.h(x6Var);
        x6Var.a(cVar);
        cVar.l = (q4) u6Var.e;
    }

    @Override // d6.h
    public void v(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(8, 2);
        aVar.c = Integer.valueOf(i10);
        y6 y6Var = new y6(aVar);
        bi.u6 u6Var = this.a;
        bi.u6.D(u6Var, y6Var);
        u6Var.F();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void z(d6.f fVar) {
    }
}
