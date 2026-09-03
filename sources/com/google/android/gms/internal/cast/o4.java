package com.google.android.gms.internal.cast;

import android.text.TextUtils;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o4 implements r5.h {
    public final /* synthetic */ c5.j a;

    public /* synthetic */ o4(c5.j jVar) {
        this.a = jVar;
    }

    @Override // r5.h
    public void d(r5.f fVar, int i10) {
        b4.e0 e0Var = new b4.e0(8, 3);
        e0Var.c = Integer.valueOf(i10);
        v6 v6Var = new v6(e0Var);
        c5.j jVar = this.a;
        c5.j.D(jVar, v6Var);
        jVar.F();
    }

    @Override // r5.h
    public void f(r5.f fVar, String str) {
        v6 v6Var = new v6(new b4.e0(4, 3));
        c5.j jVar = this.a;
        c5.j.D(jVar, v6Var);
        u6 u6Var = (u6) jVar.d;
        b6.m.h(u6Var);
        u6Var.a((r5.c) fVar);
        u6 u6Var2 = (u6) jVar.d;
        b6.m.h(u6Var2);
        String str2 = u6Var2.k;
        if (str2 == null) {
            u6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            u6Var2.b(4);
        }
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void g(r5.f fVar, boolean z4) {
        v6 v6Var = new v6(new b4.e0(4, 3));
        c5.j jVar = this.a;
        c5.j.D(jVar, v6Var);
        u6 u6Var = (u6) jVar.d;
        b6.m.h(u6Var);
        u6Var.a((r5.c) fVar);
    }

    @Override // r5.h
    public void i(r5.f fVar, int i10) {
        b4.e0 e0Var = new b4.e0(6, 3);
        e0Var.c = Integer.valueOf(i10);
        v6 v6Var = new v6(e0Var);
        c5.j jVar = this.a;
        c5.j.D(jVar, v6Var);
        u6 u6Var = (u6) jVar.d;
        b6.m.h(u6Var);
        u6Var.a((r5.c) fVar);
    }

    @Override // r5.h
    public void j(r5.f fVar, int i10) {
        b4.e0 e0Var = new b4.e0(5, 3);
        e0Var.c = Integer.valueOf(i10);
        v6 v6Var = new v6(e0Var);
        c5.j jVar = this.a;
        c5.j.D(jVar, v6Var);
        jVar.F();
    }

    @Override // r5.h
    public void k(r5.f fVar) {
        r5.c cVar = (r5.c) fVar;
        b4.e0 e0Var = new b4.e0(2, 3);
        c5.j jVar = this.a;
        e0Var.d = Boolean.valueOf(((c) jVar.b).d == 2);
        c5.j.D(jVar, new v6(e0Var));
        u6 u6Var = (u6) jVar.d;
        b6.m.h(u6Var);
        u6Var.a(cVar);
        cVar.l = (o4) jVar.e;
    }

    @Override // r5.h
    public void l(r5.f fVar, String str) {
        v6 v6Var = new v6(new b4.e0(7, 3));
        c5.j jVar = this.a;
        c5.j.D(jVar, v6Var);
        u6 u6Var = (u6) jVar.d;
        b6.m.h(u6Var);
        u6Var.a((r5.c) fVar);
        u6 u6Var2 = (u6) jVar.d;
        b6.m.h(u6Var2);
        String str2 = u6Var2.k;
        if (str2 == null) {
            u6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            u6Var2.b(4);
        }
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void m(r5.f fVar) {
    }

    @Override // r5.h
    public void o(r5.f fVar, int i10) {
        b4.e0 e0Var = new b4.e0(9, 3);
        e0Var.c = Integer.valueOf(i10);
        c5.j jVar = this.a;
        e0Var.d = Boolean.valueOf(((c) jVar.b).d == 2);
        c5.j.D(jVar, new v6(e0Var));
        jVar.F();
    }
}
