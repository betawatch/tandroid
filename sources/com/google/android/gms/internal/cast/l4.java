package com.google.android.gms.internal.cast;

import a8.r7;
import a8.wa;
import android.text.TextUtils;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class l4 implements g6.h {
    public final /* synthetic */ r7 a;

    public /* synthetic */ l4(r7 r7Var) {
        this.a = r7Var;
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void b(g6.f fVar, boolean z9) {
        s6 s6Var = new s6(new wa(4, 4));
        r7 r7Var = this.a;
        r7.K(r7Var, s6Var);
        r6 r6Var = (r6) r7Var.e;
        q6.m.g(r6Var);
        r6Var.a((g6.c) fVar);
    }

    @Override // g6.h
    public void c(g6.f fVar, int i7) {
        wa waVar = new wa(6, 4);
        waVar.c = Integer.valueOf(i7);
        s6 s6Var = new s6(waVar);
        r7 r7Var = this.a;
        r7.K(r7Var, s6Var);
        r6 r6Var = (r6) r7Var.e;
        q6.m.g(r6Var);
        r6Var.a((g6.c) fVar);
    }

    @Override // g6.h
    public void e(g6.f fVar, int i7) {
        wa waVar = new wa(5, 4);
        waVar.c = Integer.valueOf(i7);
        s6 s6Var = new s6(waVar);
        r7 r7Var = this.a;
        r7.K(r7Var, s6Var);
        r7Var.O();
    }

    @Override // g6.h
    public void f(g6.f fVar, int i7) {
        wa waVar = new wa(8, 4);
        waVar.c = Integer.valueOf(i7);
        s6 s6Var = new s6(waVar);
        r7 r7Var = this.a;
        r7.K(r7Var, s6Var);
        r7Var.O();
    }

    @Override // g6.h
    public void i(g6.f fVar, String str) {
        s6 s6Var = new s6(new wa(4, 4));
        r7 r7Var = this.a;
        r7.K(r7Var, s6Var);
        r6 r6Var = (r6) r7Var.e;
        q6.m.g(r6Var);
        r6Var.a((g6.c) fVar);
        r6 r6Var2 = (r6) r7Var.e;
        q6.m.g(r6Var2);
        String str2 = r6Var2.k;
        if (str2 == null) {
            r6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            r6Var2.b(4);
        }
    }

    @Override // g6.h
    public void j(g6.f fVar, int i7) {
        wa waVar = new wa(9, 4);
        waVar.c = Integer.valueOf(i7);
        r7 r7Var = this.a;
        waVar.d = Boolean.valueOf(((c) r7Var.c).d == 2);
        r7.K(r7Var, new s6(waVar));
        r7Var.O();
    }

    @Override // g6.h
    public void p(g6.f fVar, String str) {
        s6 s6Var = new s6(new wa(7, 4));
        r7 r7Var = this.a;
        r7.K(r7Var, s6Var);
        r6 r6Var = (r6) r7Var.e;
        q6.m.g(r6Var);
        r6Var.a((g6.c) fVar);
        r6 r6Var2 = (r6) r7Var.e;
        q6.m.g(r6Var2);
        String str2 = r6Var2.k;
        if (str2 == null) {
            r6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            r6Var2.b(4);
        }
    }

    @Override // g6.h
    public void s(g6.f fVar) {
        g6.c cVar = (g6.c) fVar;
        wa waVar = new wa(2, 4);
        r7 r7Var = this.a;
        waVar.d = Boolean.valueOf(((c) r7Var.c).d == 2);
        r7.K(r7Var, new s6(waVar));
        r6 r6Var = (r6) r7Var.e;
        q6.m.g(r6Var);
        r6Var.a(cVar);
        cVar.l = (l4) r7Var.f;
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void t(g6.f fVar) {
    }
}
