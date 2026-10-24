package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class o00 extends lm0 {
    public final Context c;
    public final /* synthetic */ s00 d;

    public o00(s00 s00Var, Context context) {
        this.d = s00Var;
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
        q00 q00Var = (q00) b1Var.a;
        int id2 = q00Var.b != null ? q00Var.getId() : -1;
        p00 p00Var = (p00) this.d.h.get(i10);
        q00Var.b = p00Var;
        q00Var.e = i10;
        q00Var.setContentDescription(p00Var.b);
        q00Var.requestLayout();
        boolean z10 = q00Var.n;
        p00 p00Var2 = q00Var.b;
        if (z10 != (p00Var2 != null && p00Var2.g)) {
            a6.release(q00Var, q00Var.r);
            a6.release(q00Var, q00Var.O);
            a6.release(q00Var, q00Var.Q);
            a6.release(q00Var, q00Var.S);
            if (q00Var.l0) {
                q00Var.r = a6.update(q00Var.b.g ? 26 : 0, q00Var, q00Var.r, q00Var.s);
                q00Var.O = a6.update(q00Var.b.g ? 26 : 0, q00Var, q00Var.O, q00Var.P);
                q00Var.Q = a6.update(q00Var.b.g ? 26 : 0, q00Var, q00Var.Q, q00Var.R);
                q00Var.S = a6.update(q00Var.b.g ? 26 : 0, q00Var, q00Var.S, q00Var.T);
            }
            q00Var.n = q00Var.b.g;
        }
        if (id2 != q00Var.getId()) {
            q00Var.k0 = q00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new wl0(new q00(this.d, this.c));
    }
}
