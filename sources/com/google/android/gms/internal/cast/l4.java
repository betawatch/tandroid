package com.google.android.gms.internal.cast;

import a8.me;
import a8.ng;
import android.text.TextUtils;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l4 implements e6.h {
    public final /* synthetic */ me a;

    public /* synthetic */ l4(me meVar) {
        this.a = meVar;
    }

    @Override // e6.h
    public void a(e6.f fVar, String str) {
        t6 t6Var = new t6(new ng(4, 4));
        me meVar = this.a;
        me.D(meVar, t6Var);
        s6 s6Var = (s6) meVar.d;
        o6.l.h(s6Var);
        s6Var.a((e6.c) fVar);
        s6 s6Var2 = (s6) meVar.d;
        o6.l.h(s6Var2);
        String str2 = s6Var2.k;
        if (str2 == null) {
            s6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            s6Var2.b(4);
        }
    }

    @Override // e6.h
    public void b(e6.f fVar, int i10) {
        ng ngVar = new ng(5, 4);
        ngVar.c = Integer.valueOf(i10);
        t6 t6Var = new t6(ngVar);
        me meVar = this.a;
        me.D(meVar, t6Var);
        meVar.G();
    }

    @Override // e6.h
    public void d(e6.f fVar, int i10) {
        ng ngVar = new ng(8, 4);
        ngVar.c = Integer.valueOf(i10);
        t6 t6Var = new t6(ngVar);
        me meVar = this.a;
        me.D(meVar, t6Var);
        meVar.G();
    }

    @Override // e6.h
    public void e(e6.f fVar, int i10) {
        ng ngVar = new ng(6, 4);
        ngVar.c = Integer.valueOf(i10);
        t6 t6Var = new t6(ngVar);
        me meVar = this.a;
        me.D(meVar, t6Var);
        s6 s6Var = (s6) meVar.d;
        o6.l.h(s6Var);
        s6Var.a((e6.c) fVar);
    }

    @Override // e6.h
    public void g(e6.f fVar, String str) {
        t6 t6Var = new t6(new ng(7, 4));
        me meVar = this.a;
        me.D(meVar, t6Var);
        s6 s6Var = (s6) meVar.d;
        o6.l.h(s6Var);
        s6Var.a((e6.c) fVar);
        s6 s6Var2 = (s6) meVar.d;
        o6.l.h(s6Var2);
        String str2 = s6Var2.k;
        if (str2 == null) {
            s6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            s6Var2.b(4);
        }
    }

    @Override // e6.h
    public void l(e6.f fVar) {
        e6.c cVar = (e6.c) fVar;
        ng ngVar = new ng(2, 4);
        me meVar = this.a;
        ngVar.d = Boolean.valueOf(((c) meVar.b).d == 2);
        me.D(meVar, new t6(ngVar));
        s6 s6Var = (s6) meVar.d;
        o6.l.h(s6Var);
        s6Var.a(cVar);
        cVar.l = (l4) meVar.e;
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void r(e6.f fVar) {
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void v(e6.f fVar, boolean z10) {
        t6 t6Var = new t6(new ng(4, 4));
        me meVar = this.a;
        me.D(meVar, t6Var);
        s6 s6Var = (s6) meVar.d;
        o6.l.h(s6Var);
        s6Var.a((e6.c) fVar);
    }

    @Override // e6.h
    public void x(e6.f fVar, int i10) {
        ng ngVar = new ng(9, 4);
        ngVar.c = Integer.valueOf(i10);
        me meVar = this.a;
        ngVar.d = Boolean.valueOf(((c) meVar.b).d == 2);
        me.D(meVar, new t6(ngVar));
        meVar.G();
    }
}
