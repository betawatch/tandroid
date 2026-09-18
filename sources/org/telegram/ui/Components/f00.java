package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f00 extends ll0 {
    public final Context c;
    public final /* synthetic */ k00 d;

    public f00(k00 k00Var, Context context) {
        this.d = k00Var;
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
            x5.release(i00Var, i00Var.r);
            x5.release(i00Var, i00Var.O);
            x5.release(i00Var, i00Var.Q);
            x5.release(i00Var, i00Var.S);
            if (i00Var.l0) {
                i00Var.r = x5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.r, i00Var.s);
                i00Var.O = x5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.O, i00Var.P);
                i00Var.Q = x5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.Q, i00Var.R);
                i00Var.S = x5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.S, i00Var.T);
            }
            i00Var.n = i00Var.b.g;
        }
        if (id2 != i00Var.getId()) {
            i00Var.k0 = i00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new wk0(new i00(this.d, this.c));
    }
}
