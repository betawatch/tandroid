package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import b8.ke;
import b8.kg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m4 implements f6.h {
    public final /* synthetic */ ke a;

    public /* synthetic */ m4(ke keVar) {
        this.a = keVar;
    }

    @Override // f6.h
    public void a(f6.f fVar, int i3) {
        kg kgVar = new kg(9, 4);
        kgVar.c = Integer.valueOf(i3);
        ke keVar = this.a;
        kgVar.d = Boolean.valueOf(((c) keVar.c).d == 2);
        ke.P(keVar, new t6(kgVar));
        keVar.R();
    }

    @Override // f6.h
    public void d(f6.f fVar, int i3) {
        kg kgVar = new kg(6, 4);
        kgVar.c = Integer.valueOf(i3);
        t6 t6Var = new t6(kgVar);
        ke keVar = this.a;
        ke.P(keVar, t6Var);
        s6 s6Var = (s6) keVar.e;
        p6.m.g(s6Var);
        s6Var.a((f6.c) fVar);
    }

    @Override // f6.h
    public void f(f6.f fVar, String str) {
        t6 t6Var = new t6(new kg(4, 4));
        ke keVar = this.a;
        ke.P(keVar, t6Var);
        s6 s6Var = (s6) keVar.e;
        p6.m.g(s6Var);
        s6Var.a((f6.c) fVar);
        s6 s6Var2 = (s6) keVar.e;
        p6.m.g(s6Var2);
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

    @Override // f6.h
    public void g(f6.f fVar) {
        f6.c cVar = (f6.c) fVar;
        kg kgVar = new kg(2, 4);
        ke keVar = this.a;
        kgVar.d = Boolean.valueOf(((c) keVar.c).d == 2);
        ke.P(keVar, new t6(kgVar));
        s6 s6Var = (s6) keVar.e;
        p6.m.g(s6Var);
        s6Var.a(cVar);
        cVar.l = (m4) keVar.f;
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void h(f6.f fVar) {
    }

    @Override // f6.h
    public void j(f6.f fVar, String str) {
        t6 t6Var = new t6(new kg(7, 4));
        ke keVar = this.a;
        ke.P(keVar, t6Var);
        s6 s6Var = (s6) keVar.e;
        p6.m.g(s6Var);
        s6Var.a((f6.c) fVar);
        s6 s6Var2 = (s6) keVar.e;
        p6.m.g(s6Var2);
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

    @Override // f6.h
    public /* bridge */ /* synthetic */ void l(f6.f fVar, boolean z10) {
        t6 t6Var = new t6(new kg(4, 4));
        ke keVar = this.a;
        ke.P(keVar, t6Var);
        s6 s6Var = (s6) keVar.e;
        p6.m.g(s6Var);
        s6Var.a((f6.c) fVar);
    }

    @Override // f6.h
    public void m(f6.f fVar, int i3) {
        kg kgVar = new kg(8, 4);
        kgVar.c = Integer.valueOf(i3);
        t6 t6Var = new t6(kgVar);
        ke keVar = this.a;
        ke.P(keVar, t6Var);
        keVar.R();
    }

    @Override // f6.h
    public void n(f6.f fVar, int i3) {
        kg kgVar = new kg(5, 4);
        kgVar.c = Integer.valueOf(i3);
        t6 t6Var = new t6(kgVar);
        ke keVar = this.a;
        ke.P(keVar, t6Var);
        keVar.R();
    }
}
