package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class i00 extends yl0 {
    public final Context c;
    public final /* synthetic */ n00 d;

    public i00(n00 n00Var, Context context) {
        this.d = n00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yl0
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
        l00 l00Var = (l00) c1Var.a;
        int id2 = l00Var.b != null ? l00Var.getId() : -1;
        j00 j00Var = (j00) this.d.h.get(i10);
        l00Var.b = j00Var;
        l00Var.e = i10;
        l00Var.setContentDescription(j00Var.b);
        l00Var.requestLayout();
        boolean z10 = l00Var.n;
        j00 j00Var2 = l00Var.b;
        if (z10 != (j00Var2 != null && j00Var2.g)) {
            z5.release(l00Var, l00Var.r);
            z5.release(l00Var, l00Var.O);
            z5.release(l00Var, l00Var.Q);
            z5.release(l00Var, l00Var.S);
            if (l00Var.l0) {
                l00Var.r = z5.update(l00Var.b.g ? 26 : 0, l00Var, l00Var.r, l00Var.s);
                l00Var.O = z5.update(l00Var.b.g ? 26 : 0, l00Var, l00Var.O, l00Var.P);
                l00Var.Q = z5.update(l00Var.b.g ? 26 : 0, l00Var, l00Var.Q, l00Var.R);
                l00Var.S = z5.update(l00Var.b.g ? 26 : 0, l00Var, l00Var.S, l00Var.T);
            }
            l00Var.n = l00Var.b.g;
        }
        if (id2 != l00Var.getId()) {
            l00Var.k0 = l00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new il0(new l00(this.d, this.c));
    }
}
