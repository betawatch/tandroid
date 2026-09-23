package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class g00 extends ll0 {
    public final Context c;
    public final /* synthetic */ l00 d;

    public g00(l00 l00Var, Context context) {
        this.d = l00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
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
        j00 j00Var = (j00) c1Var.a;
        int id2 = j00Var.b != null ? j00Var.getId() : -1;
        h00 h00Var = (h00) this.d.h.get(i10);
        j00Var.b = h00Var;
        j00Var.e = i10;
        j00Var.setContentDescription(h00Var.b);
        j00Var.requestLayout();
        boolean z10 = j00Var.n;
        h00 h00Var2 = j00Var.b;
        if (z10 != (h00Var2 != null && h00Var2.g)) {
            z5.release(j00Var, j00Var.r);
            z5.release(j00Var, j00Var.O);
            z5.release(j00Var, j00Var.Q);
            z5.release(j00Var, j00Var.S);
            if (j00Var.l0) {
                j00Var.r = z5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.r, j00Var.s);
                j00Var.O = z5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.O, j00Var.P);
                j00Var.Q = z5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.Q, j00Var.R);
                j00Var.S = z5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.S, j00Var.T);
            }
            j00Var.n = j00Var.b.g;
        }
        if (id2 != j00Var.getId()) {
            j00Var.k0 = j00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new wk0(new j00(this.d, this.c));
    }
}
