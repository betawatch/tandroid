package com.google.android.gms.internal.cast;

import android.text.TextUtils;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class q4 implements d6.h {
    public final /* synthetic */ cf.c a;

    public /* synthetic */ q4(cf.c cVar) {
        this.a = cVar;
    }

    @Override // d6.h
    public void d(d6.f fVar, String str) {
        y6 y6Var = new y6(new a5.a(7, 2));
        cf.c cVar = this.a;
        cf.c.y(cVar, y6Var);
        x6 x6Var = (x6) cVar.d;
        n6.l.h(x6Var);
        x6Var.a((d6.c) fVar);
        x6 x6Var2 = (x6) cVar.d;
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
    public void f(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(5, 2);
        aVar.c = Integer.valueOf(i10);
        y6 y6Var = new y6(aVar);
        cf.c cVar = this.a;
        cf.c.y(cVar, y6Var);
        cVar.C();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void g(d6.f fVar, boolean z10) {
        y6 y6Var = new y6(new a5.a(4, 2));
        cf.c cVar = this.a;
        cf.c.y(cVar, y6Var);
        x6 x6Var = (x6) cVar.d;
        n6.l.h(x6Var);
        x6Var.a((d6.c) fVar);
    }

    @Override // d6.h
    public void j(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(9, 2);
        aVar.c = Integer.valueOf(i10);
        cf.c cVar = this.a;
        aVar.d = Boolean.valueOf(((d) cVar.b).d == 2);
        cf.c.y(cVar, new y6(aVar));
        cVar.C();
    }

    @Override // d6.h
    public void n(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        a5.a aVar = new a5.a(2, 2);
        cf.c cVar2 = this.a;
        aVar.d = Boolean.valueOf(((d) cVar2.b).d == 2);
        cf.c.y(cVar2, new y6(aVar));
        x6 x6Var = (x6) cVar2.d;
        n6.l.h(x6Var);
        x6Var.a(cVar);
        cVar.l = (q4) cVar2.e;
    }

    @Override // d6.h
    public void q(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(8, 2);
        aVar.c = Integer.valueOf(i10);
        y6 y6Var = new y6(aVar);
        cf.c cVar = this.a;
        cf.c.y(cVar, y6Var);
        cVar.C();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void t(d6.f fVar) {
    }

    @Override // d6.h
    public void u(d6.f fVar, String str) {
        y6 y6Var = new y6(new a5.a(4, 2));
        cf.c cVar = this.a;
        cf.c.y(cVar, y6Var);
        x6 x6Var = (x6) cVar.d;
        n6.l.h(x6Var);
        x6Var.a((d6.c) fVar);
        x6 x6Var2 = (x6) cVar.d;
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
    public void v(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(6, 2);
        aVar.c = Integer.valueOf(i10);
        y6 y6Var = new y6(aVar);
        cf.c cVar = this.a;
        cf.c.y(cVar, y6Var);
        x6 x6Var = (x6) cVar.d;
        n6.l.h(x6Var);
        x6Var.a((d6.c) fVar);
    }
}
