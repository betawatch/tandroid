package com.google.android.gms.internal.cast;

import a8.r7;
import a8.xa;
import android.text.TextUtils;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class l4 implements g6.h {
    public final /* synthetic */ r7 a;

    public /* synthetic */ l4(r7 r7Var) {
        this.a = r7Var;
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void b(g6.f fVar, boolean z10) {
        s6 s6Var = new s6(new xa(4, 4));
        r7 r7Var = this.a;
        r7.O(r7Var, s6Var);
        r6 r6Var = (r6) r7Var.e;
        q6.m.h(r6Var);
        r6Var.a((g6.c) fVar);
    }

    @Override // g6.h
    public void c(g6.f fVar, int i7) {
        xa xaVar = new xa(6, 4);
        xaVar.c = Integer.valueOf(i7);
        s6 s6Var = new s6(xaVar);
        r7 r7Var = this.a;
        r7.O(r7Var, s6Var);
        r6 r6Var = (r6) r7Var.e;
        q6.m.h(r6Var);
        r6Var.a((g6.c) fVar);
    }

    @Override // g6.h
    public void d(g6.f fVar, int i7) {
        xa xaVar = new xa(5, 4);
        xaVar.c = Integer.valueOf(i7);
        s6 s6Var = new s6(xaVar);
        r7 r7Var = this.a;
        r7.O(r7Var, s6Var);
        r7Var.Q();
    }

    @Override // g6.h
    public void g(g6.f fVar, int i7) {
        xa xaVar = new xa(8, 4);
        xaVar.c = Integer.valueOf(i7);
        s6 s6Var = new s6(xaVar);
        r7 r7Var = this.a;
        r7.O(r7Var, s6Var);
        r7Var.Q();
    }

    @Override // g6.h
    public void i(g6.f fVar, String str) {
        s6 s6Var = new s6(new xa(4, 4));
        r7 r7Var = this.a;
        r7.O(r7Var, s6Var);
        r6 r6Var = (r6) r7Var.e;
        q6.m.h(r6Var);
        r6Var.a((g6.c) fVar);
        r6 r6Var2 = (r6) r7Var.e;
        q6.m.h(r6Var2);
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
        xa xaVar = new xa(9, 4);
        xaVar.c = Integer.valueOf(i7);
        r7 r7Var = this.a;
        xaVar.d = Boolean.valueOf(((c) r7Var.c).d == 2);
        r7.O(r7Var, new s6(xaVar));
        r7Var.Q();
    }

    @Override // g6.h
    public void k(g6.f fVar, String str) {
        s6 s6Var = new s6(new xa(7, 4));
        r7 r7Var = this.a;
        r7.O(r7Var, s6Var);
        r6 r6Var = (r6) r7Var.e;
        q6.m.h(r6Var);
        r6Var.a((g6.c) fVar);
        r6 r6Var2 = (r6) r7Var.e;
        q6.m.h(r6Var2);
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
    public void m(g6.f fVar) {
        g6.c cVar = (g6.c) fVar;
        xa xaVar = new xa(2, 4);
        r7 r7Var = this.a;
        xaVar.d = Boolean.valueOf(((c) r7Var.c).d == 2);
        r7.O(r7Var, new s6(xaVar));
        r6 r6Var = (r6) r7Var.e;
        q6.m.h(r6Var);
        r6Var.a(cVar);
        cVar.l = (l4) r7Var.f;
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void n(g6.f fVar) {
    }
}
