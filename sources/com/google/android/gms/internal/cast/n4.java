package com.google.android.gms.internal.cast;

import android.text.TextUtils;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n4 implements r5.h {
    public final /* synthetic */ c5.j a;

    public /* synthetic */ n4(c5.j jVar) {
        this.a = jVar;
    }

    @Override // r5.h
    public void e(r5.f fVar, int i10) {
        b4.e0 e0Var = new b4.e0(8, 2);
        e0Var.c = Integer.valueOf(i10);
        u6 u6Var = new u6(e0Var);
        c5.j jVar = this.a;
        c5.j.D(jVar, u6Var);
        jVar.F();
    }

    @Override // r5.h
    public void f(r5.f fVar, String str) {
        u6 u6Var = new u6(new b4.e0(4, 2));
        c5.j jVar = this.a;
        c5.j.D(jVar, u6Var);
        t6 t6Var = (t6) jVar.d;
        b6.m.h(t6Var);
        t6Var.a((r5.c) fVar);
        t6 t6Var2 = (t6) jVar.d;
        b6.m.h(t6Var2);
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

    @Override // r5.h
    public /* bridge */ /* synthetic */ void g(r5.f fVar, boolean z4) {
        u6 u6Var = new u6(new b4.e0(4, 2));
        c5.j jVar = this.a;
        c5.j.D(jVar, u6Var);
        t6 t6Var = (t6) jVar.d;
        b6.m.h(t6Var);
        t6Var.a((r5.c) fVar);
    }

    @Override // r5.h
    public void h(r5.f fVar, int i10) {
        b4.e0 e0Var = new b4.e0(6, 2);
        e0Var.c = Integer.valueOf(i10);
        u6 u6Var = new u6(e0Var);
        c5.j jVar = this.a;
        c5.j.D(jVar, u6Var);
        t6 t6Var = (t6) jVar.d;
        b6.m.h(t6Var);
        t6Var.a((r5.c) fVar);
    }

    @Override // r5.h
    public void i(r5.f fVar, int i10) {
        b4.e0 e0Var = new b4.e0(5, 2);
        e0Var.c = Integer.valueOf(i10);
        u6 u6Var = new u6(e0Var);
        c5.j jVar = this.a;
        c5.j.D(jVar, u6Var);
        jVar.F();
    }

    @Override // r5.h
    public void j(r5.f fVar) {
        r5.c cVar = (r5.c) fVar;
        b4.e0 e0Var = new b4.e0(2, 2);
        c5.j jVar = this.a;
        e0Var.d = Boolean.valueOf(((c) jVar.b).d == 2);
        c5.j.D(jVar, new u6(e0Var));
        t6 t6Var = (t6) jVar.d;
        b6.m.h(t6Var);
        t6Var.a(cVar);
        cVar.l = (n4) jVar.e;
    }

    @Override // r5.h
    public void k(r5.f fVar, String str) {
        u6 u6Var = new u6(new b4.e0(7, 2));
        c5.j jVar = this.a;
        c5.j.D(jVar, u6Var);
        t6 t6Var = (t6) jVar.d;
        b6.m.h(t6Var);
        t6Var.a((r5.c) fVar);
        t6 t6Var2 = (t6) jVar.d;
        b6.m.h(t6Var2);
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

    @Override // r5.h
    public /* bridge */ /* synthetic */ void m(r5.f fVar) {
    }

    @Override // r5.h
    public void o(r5.f fVar, int i10) {
        b4.e0 e0Var = new b4.e0(9, 2);
        e0Var.c = Integer.valueOf(i10);
        c5.j jVar = this.a;
        e0Var.d = Boolean.valueOf(((c) jVar.b).d == 2);
        c5.j.D(jVar, new u6(e0Var));
        jVar.F();
    }
}
