package com.google.android.gms.internal.cast;

import android.text.TextUtils;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class o4 implements d6.h {
    public final /* synthetic */ z5 a;

    public /* synthetic */ o4(z5 z5Var) {
        this.a = z5Var;
    }

    @Override // d6.h
    public void d(d6.f fVar, String str) {
        x6 x6Var = new x6(new a5.a(7, 2));
        z5 z5Var = this.a;
        z5.D(z5Var, x6Var);
        w6 w6Var = (w6) z5Var.d;
        n6.l.h(w6Var);
        w6Var.a((d6.c) fVar);
        w6 w6Var2 = (w6) z5Var.d;
        n6.l.h(w6Var2);
        String str2 = w6Var2.k;
        if (str2 == null) {
            w6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            w6Var2.b(4);
        }
    }

    @Override // d6.h
    public void g(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(5, 2);
        aVar.c = Integer.valueOf(i10);
        x6 x6Var = new x6(aVar);
        z5 z5Var = this.a;
        z5.D(z5Var, x6Var);
        z5Var.G();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void i(d6.f fVar, boolean z10) {
        x6 x6Var = new x6(new a5.a(4, 2));
        z5 z5Var = this.a;
        z5.D(z5Var, x6Var);
        w6 w6Var = (w6) z5Var.d;
        n6.l.h(w6Var);
        w6Var.a((d6.c) fVar);
    }

    @Override // d6.h
    public void n(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(9, 2);
        aVar.c = Integer.valueOf(i10);
        z5 z5Var = this.a;
        aVar.d = Boolean.valueOf(((d) z5Var.c).d == 2);
        z5.D(z5Var, new x6(aVar));
        z5Var.G();
    }

    @Override // d6.h
    public void q(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        a5.a aVar = new a5.a(2, 2);
        z5 z5Var = this.a;
        aVar.d = Boolean.valueOf(((d) z5Var.c).d == 2);
        z5.D(z5Var, new x6(aVar));
        w6 w6Var = (w6) z5Var.d;
        n6.l.h(w6Var);
        w6Var.a(cVar);
        cVar.l = (o4) z5Var.e;
    }

    @Override // d6.h
    public void r(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(8, 2);
        aVar.c = Integer.valueOf(i10);
        x6 x6Var = new x6(aVar);
        z5 z5Var = this.a;
        z5.D(z5Var, x6Var);
        z5Var.G();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void t(d6.f fVar) {
    }

    @Override // d6.h
    public void u(d6.f fVar, String str) {
        x6 x6Var = new x6(new a5.a(4, 2));
        z5 z5Var = this.a;
        z5.D(z5Var, x6Var);
        w6 w6Var = (w6) z5Var.d;
        n6.l.h(w6Var);
        w6Var.a((d6.c) fVar);
        w6 w6Var2 = (w6) z5Var.d;
        n6.l.h(w6Var2);
        String str2 = w6Var2.k;
        if (str2 == null) {
            w6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            w6Var2.b(4);
        }
    }

    @Override // d6.h
    public void x(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(6, 2);
        aVar.c = Integer.valueOf(i10);
        x6 x6Var = new x6(aVar);
        z5 z5Var = this.a;
        z5.D(z5Var, x6Var);
        w6 w6Var = (w6) z5Var.d;
        n6.l.h(w6Var);
        w6Var.a((d6.c) fVar);
    }
}
