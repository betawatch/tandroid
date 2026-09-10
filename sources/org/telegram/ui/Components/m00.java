package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m00 extends ul0 {
    public final Context c;
    public final /* synthetic */ r00 d;

    public m00(r00 r00Var, Context context) {
        this.d = r00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
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
        p00 p00Var = (p00) c1Var.a;
        int id2 = p00Var.b != null ? p00Var.getId() : -1;
        n00 n00Var = (n00) this.d.h.get(i10);
        p00Var.b = n00Var;
        p00Var.e = i10;
        p00Var.setContentDescription(n00Var.b);
        p00Var.requestLayout();
        boolean z10 = p00Var.n;
        n00 n00Var2 = p00Var.b;
        if (z10 != (n00Var2 != null && n00Var2.g)) {
            y5.release(p00Var, p00Var.r);
            y5.release(p00Var, p00Var.O);
            y5.release(p00Var, p00Var.Q);
            y5.release(p00Var, p00Var.S);
            if (p00Var.l0) {
                p00Var.r = y5.update(p00Var.b.g ? 26 : 0, p00Var, p00Var.r, p00Var.s);
                p00Var.O = y5.update(p00Var.b.g ? 26 : 0, p00Var, p00Var.O, p00Var.P);
                p00Var.Q = y5.update(p00Var.b.g ? 26 : 0, p00Var, p00Var.Q, p00Var.R);
                p00Var.S = y5.update(p00Var.b.g ? 26 : 0, p00Var, p00Var.S, p00Var.T);
            }
            p00Var.n = p00Var.b.g;
        }
        if (id2 != p00Var.getId()) {
            p00Var.k0 = p00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new fl0(new p00(this.d, this.c));
    }
}
