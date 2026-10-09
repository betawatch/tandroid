package com.google.android.gms.internal.cast;

import android.text.TextUtils;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class o4 implements d6.h {
    public final /* synthetic */ ci.u5 a;

    public /* synthetic */ o4(ci.u5 u5Var) {
        this.a = u5Var;
    }

    @Override // d6.h
    public void d(d6.f fVar, String str) {
        w6 w6Var = new w6(new a5.a(7, 2));
        ci.u5 u5Var = this.a;
        ci.u5.E(u5Var, w6Var);
        v6 v6Var = (v6) u5Var.d;
        n6.l.h(v6Var);
        v6Var.a((d6.c) fVar);
        v6 v6Var2 = (v6) u5Var.d;
        n6.l.h(v6Var2);
        String str2 = v6Var2.k;
        if (str2 == null) {
            v6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            v6Var2.b(4);
        }
    }

    @Override // d6.h
    public void g(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(5, 2);
        aVar.c = Integer.valueOf(i10);
        w6 w6Var = new w6(aVar);
        ci.u5 u5Var = this.a;
        ci.u5.E(u5Var, w6Var);
        u5Var.G();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void h(d6.f fVar, boolean z10) {
        w6 w6Var = new w6(new a5.a(4, 2));
        ci.u5 u5Var = this.a;
        ci.u5.E(u5Var, w6Var);
        v6 v6Var = (v6) u5Var.d;
        n6.l.h(v6Var);
        v6Var.a((d6.c) fVar);
    }

    @Override // d6.h
    public void j(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(9, 2);
        aVar.c = Integer.valueOf(i10);
        ci.u5 u5Var = this.a;
        aVar.d = Boolean.valueOf(((d) u5Var.b).d == 2);
        ci.u5.E(u5Var, new w6(aVar));
        u5Var.G();
    }

    @Override // d6.h
    public void o(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        a5.a aVar = new a5.a(2, 2);
        ci.u5 u5Var = this.a;
        aVar.d = Boolean.valueOf(((d) u5Var.b).d == 2);
        ci.u5.E(u5Var, new w6(aVar));
        v6 v6Var = (v6) u5Var.d;
        n6.l.h(v6Var);
        v6Var.a(cVar);
        cVar.l = (o4) u5Var.e;
    }

    @Override // d6.h
    public void u(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(8, 2);
        aVar.c = Integer.valueOf(i10);
        w6 w6Var = new w6(aVar);
        ci.u5 u5Var = this.a;
        ci.u5.E(u5Var, w6Var);
        u5Var.G();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void v(d6.f fVar) {
    }

    @Override // d6.h
    public void x(d6.f fVar, String str) {
        w6 w6Var = new w6(new a5.a(4, 2));
        ci.u5 u5Var = this.a;
        ci.u5.E(u5Var, w6Var);
        v6 v6Var = (v6) u5Var.d;
        n6.l.h(v6Var);
        v6Var.a((d6.c) fVar);
        v6 v6Var2 = (v6) u5Var.d;
        n6.l.h(v6Var2);
        String str2 = v6Var2.k;
        if (str2 == null) {
            v6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            v6Var2.b(4);
        }
    }

    @Override // d6.h
    public void y(d6.f fVar, int i10) {
        a5.a aVar = new a5.a(6, 2);
        aVar.c = Integer.valueOf(i10);
        w6 w6Var = new w6(aVar);
        ci.u5 u5Var = this.a;
        ci.u5.E(u5Var, w6Var);
        v6 v6Var = (v6) u5Var.d;
        n6.l.h(v6Var);
        v6Var.a((d6.c) fVar);
    }
}
