package com.google.android.gms.internal.cast;

import android.text.TextUtils;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m4 implements n5.i {
    public final /* synthetic */ af.h a;

    public /* synthetic */ m4(af.h hVar) {
        this.a = hVar;
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void a(n5.g gVar) {
    }

    @Override // n5.i
    public void b(n5.g gVar, int i10) {
        b6.a aVar = new b6.a(8, 3);
        aVar.b = Integer.valueOf(i10);
        u6 u6Var = new u6(aVar);
        af.h hVar = this.a;
        af.h.E(hVar, u6Var);
        hVar.G();
    }

    @Override // n5.i
    public void c(n5.g gVar, int i10) {
        b6.a aVar = new b6.a(9, 3);
        aVar.b = Integer.valueOf(i10);
        af.h hVar = this.a;
        aVar.d = Boolean.valueOf(((d) hVar.b).d == 2);
        af.h.E(hVar, new u6(aVar));
        hVar.G();
    }

    @Override // n5.i
    public void d(n5.g gVar) {
        n5.c cVar = (n5.c) gVar;
        b6.a aVar = new b6.a(2, 3);
        af.h hVar = this.a;
        aVar.d = Boolean.valueOf(((d) hVar.b).d == 2);
        af.h.E(hVar, new u6(aVar));
        t6 t6Var = (t6) hVar.d;
        y5.l.h(t6Var);
        t6Var.a(cVar);
        cVar.l = (m4) hVar.e;
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void e(n5.g gVar, boolean z10) {
        u6 u6Var = new u6(new b6.a(4, 3));
        af.h hVar = this.a;
        af.h.E(hVar, u6Var);
        t6 t6Var = (t6) hVar.d;
        y5.l.h(t6Var);
        t6Var.a((n5.c) gVar);
    }

    @Override // n5.i
    public void f(n5.g gVar, int i10) {
        b6.a aVar = new b6.a(6, 3);
        aVar.b = Integer.valueOf(i10);
        u6 u6Var = new u6(aVar);
        af.h hVar = this.a;
        af.h.E(hVar, u6Var);
        t6 t6Var = (t6) hVar.d;
        y5.l.h(t6Var);
        t6Var.a((n5.c) gVar);
    }

    @Override // n5.i
    public void h(n5.g gVar, int i10) {
        b6.a aVar = new b6.a(5, 3);
        aVar.b = Integer.valueOf(i10);
        u6 u6Var = new u6(aVar);
        af.h hVar = this.a;
        af.h.E(hVar, u6Var);
        hVar.G();
    }

    @Override // n5.i
    public void i(n5.g gVar, String str) {
        u6 u6Var = new u6(new b6.a(4, 3));
        af.h hVar = this.a;
        af.h.E(hVar, u6Var);
        t6 t6Var = (t6) hVar.d;
        y5.l.h(t6Var);
        t6Var.a((n5.c) gVar);
        t6 t6Var2 = (t6) hVar.d;
        y5.l.h(t6Var2);
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

    @Override // n5.i
    public void j(n5.g gVar, String str) {
        u6 u6Var = new u6(new b6.a(7, 3));
        af.h hVar = this.a;
        af.h.E(hVar, u6Var);
        t6 t6Var = (t6) hVar.d;
        y5.l.h(t6Var);
        t6Var.a((n5.c) gVar);
        t6 t6Var2 = (t6) hVar.d;
        y5.l.h(t6Var2);
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
}
