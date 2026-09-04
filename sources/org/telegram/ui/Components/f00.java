package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class f00 extends kl0 {
    public final Context c;
    public final /* synthetic */ k00 d;

    public f00(k00 k00Var, Context context) {
        this.d = k00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.h.size();
    }

    @Override // s4.h0
    public final long i(int i10) {
        return this.d.k0.get(i10);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        i00 i00Var = (i00) c1Var.a;
        int id2 = i00Var.b != null ? i00Var.getId() : -1;
        g00 g00Var = (g00) this.d.h.get(i10);
        i00Var.b = g00Var;
        i00Var.e = i10;
        i00Var.setContentDescription(g00Var.b);
        i00Var.requestLayout();
        boolean z10 = i00Var.n;
        g00 g00Var2 = i00Var.b;
        if (z10 != (g00Var2 != null && g00Var2.g)) {
            z5.release(i00Var, i00Var.r);
            z5.release(i00Var, i00Var.O);
            z5.release(i00Var, i00Var.Q);
            z5.release(i00Var, i00Var.S);
            if (i00Var.l0) {
                i00Var.r = z5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.r, i00Var.s);
                i00Var.O = z5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.O, i00Var.P);
                i00Var.Q = z5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.Q, i00Var.R);
                i00Var.S = z5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.S, i00Var.T);
            }
            i00Var.n = i00Var.b.g;
        }
        if (id2 != i00Var.getId()) {
            i00Var.k0 = i00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new vk0(new i00(this.d, this.c));
    }
}
