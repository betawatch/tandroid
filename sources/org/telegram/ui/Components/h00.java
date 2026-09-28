package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class h00 extends xl0 {
    public final Context c;
    public final /* synthetic */ m00 d;

    public h00(m00 m00Var, Context context) {
        this.d = m00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.xl0
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
        k00 k00Var = (k00) c1Var.a;
        int id2 = k00Var.b != null ? k00Var.getId() : -1;
        i00 i00Var = (i00) this.d.h.get(i10);
        k00Var.b = i00Var;
        k00Var.e = i10;
        k00Var.setContentDescription(i00Var.b);
        k00Var.requestLayout();
        boolean z10 = k00Var.n;
        i00 i00Var2 = k00Var.b;
        if (z10 != (i00Var2 != null && i00Var2.g)) {
            z5.release(k00Var, k00Var.r);
            z5.release(k00Var, k00Var.O);
            z5.release(k00Var, k00Var.Q);
            z5.release(k00Var, k00Var.S);
            if (k00Var.l0) {
                k00Var.r = z5.update(k00Var.b.g ? 26 : 0, k00Var, k00Var.r, k00Var.s);
                k00Var.O = z5.update(k00Var.b.g ? 26 : 0, k00Var, k00Var.O, k00Var.P);
                k00Var.Q = z5.update(k00Var.b.g ? 26 : 0, k00Var, k00Var.Q, k00Var.R);
                k00Var.S = z5.update(k00Var.b.g ? 26 : 0, k00Var, k00Var.S, k00Var.T);
            }
            k00Var.n = k00Var.b.g;
        }
        if (id2 != k00Var.getId()) {
            k00Var.k0 = k00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new il0(new k00(this.d, this.c));
    }
}
