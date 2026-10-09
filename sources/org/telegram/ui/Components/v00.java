package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class v00 extends pm0 {
    public final Context c;
    public final /* synthetic */ a10 d;

    public v00(a10 a10Var, Context context) {
        this.d = a10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override // s4.i0
    public final int h() {
        return this.d.h.size();
    }

    @Override // s4.i0
    public final long i(int i10) {
        return this.d.k0.get(i10);
    }

    @Override // s4.i0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        y00 y00Var = (y00) d1Var.a;
        int id2 = y00Var.b != null ? y00Var.getId() : -1;
        w00 w00Var = (w00) this.d.h.get(i10);
        y00Var.b = w00Var;
        y00Var.e = i10;
        y00Var.setContentDescription(w00Var.b);
        y00Var.requestLayout();
        boolean z10 = y00Var.n;
        w00 w00Var2 = y00Var.b;
        if (z10 != (w00Var2 != null && w00Var2.g)) {
            b6.release(y00Var, y00Var.r);
            b6.release(y00Var, y00Var.O);
            b6.release(y00Var, y00Var.Q);
            b6.release(y00Var, y00Var.S);
            if (y00Var.l0) {
                y00Var.r = b6.update(y00Var.b.g ? 26 : 0, y00Var, y00Var.r, y00Var.s);
                y00Var.O = b6.update(y00Var.b.g ? 26 : 0, y00Var, y00Var.O, y00Var.P);
                y00Var.Q = b6.update(y00Var.b.g ? 26 : 0, y00Var, y00Var.Q, y00Var.R);
                y00Var.S = b6.update(y00Var.b.g ? 26 : 0, y00Var, y00Var.S, y00Var.T);
            }
            y00Var.n = y00Var.b.g;
        }
        if (id2 != y00Var.getId()) {
            y00Var.k0 = y00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new am0(new y00(this.d, this.c));
    }
}
