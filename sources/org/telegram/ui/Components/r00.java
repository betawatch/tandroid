package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class r00 extends lm0 {
    public final Context c;
    public final /* synthetic */ w00 d;

    public r00(w00 w00Var, Context context) {
        this.d = w00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.h.size();
    }

    @Override // s4.g0
    public final long i(int i10) {
        return this.d.k0.get(i10);
    }

    @Override // s4.g0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        u00 u00Var = (u00) b1Var.a;
        int id2 = u00Var.b != null ? u00Var.getId() : -1;
        s00 s00Var = (s00) this.d.h.get(i10);
        u00Var.b = s00Var;
        u00Var.e = i10;
        u00Var.setContentDescription(s00Var.b);
        u00Var.requestLayout();
        boolean z10 = u00Var.n;
        s00 s00Var2 = u00Var.b;
        if (z10 != (s00Var2 != null && s00Var2.g)) {
            b6.release(u00Var, u00Var.r);
            b6.release(u00Var, u00Var.O);
            b6.release(u00Var, u00Var.Q);
            b6.release(u00Var, u00Var.S);
            if (u00Var.l0) {
                u00Var.r = b6.update(u00Var.b.g ? 26 : 0, u00Var, u00Var.r, u00Var.s);
                u00Var.O = b6.update(u00Var.b.g ? 26 : 0, u00Var, u00Var.O, u00Var.P);
                u00Var.Q = b6.update(u00Var.b.g ? 26 : 0, u00Var, u00Var.Q, u00Var.R);
                u00Var.S = b6.update(u00Var.b.g ? 26 : 0, u00Var, u00Var.S, u00Var.T);
            }
            u00Var.n = u00Var.b.g;
        }
        if (id2 != u00Var.getId()) {
            u00Var.k0 = u00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new wl0(new u00(this.d, this.c));
    }
}
