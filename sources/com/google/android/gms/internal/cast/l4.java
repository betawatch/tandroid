package com.google.android.gms.internal.cast;

import a8.r7;
import a8.xa;
import android.text.TextUtils;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class l4 implements g6.h {
    public final /* synthetic */ r7 a;

    public /* synthetic */ l4(r7 r7Var) {
        this.a = r7Var;
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void a(g6.f fVar, boolean z10) {
        s6 s6Var = new s6(new xa(4, 4));
        r7 r7Var = this.a;
        r7.O(r7Var, s6Var);
        r6 r6Var = (r6) r7Var.e;
        q6.m.h(r6Var);
        r6Var.a((g6.c) fVar);
    }

    @Override // g6.h
    public void b(g6.f fVar, int i7) {
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
    public void e(g6.f fVar, int i7) {
        xa xaVar = new xa(5, 4);
        xaVar.c = Integer.valueOf(i7);
        s6 s6Var = new s6(xaVar);
        r7 r7Var = this.a;
        r7.O(r7Var, s6Var);
        r7Var.Q();
    }

    @Override // g6.h
    public void f(g6.f fVar, int i7) {
        xa xaVar = new xa(8, 4);
        xaVar.c = Integer.valueOf(i7);
        s6 s6Var = new s6(xaVar);
        r7 r7Var = this.a;
        r7.O(r7Var, s6Var);
        r7Var.Q();
    }

    @Override // g6.h
    public void h(g6.f fVar, String str) {
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
    public void k(g6.f fVar, int i7) {
        xa xaVar = new xa(9, 4);
        xaVar.c = Integer.valueOf(i7);
        r7 r7Var = this.a;
        xaVar.d = Boolean.valueOf(((c) r7Var.c).d == 2);
        r7.O(r7Var, new s6(xaVar));
        r7Var.Q();
    }

    @Override // g6.h
    public void l(g6.f fVar, String str) {
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
