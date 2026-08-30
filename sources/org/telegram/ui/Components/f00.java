package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f00 extends rl0 {
    public final Context c;
    public final /* synthetic */ j00 d;

    public f00(j00 j00Var, Context context) {
        this.d = j00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.o0
    public final long i(int i10) {
        return this.d.h0.get(i10);
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        h00 h00Var = (h00) l1Var.a;
        int id2 = h00Var.b != null ? h00Var.getId() : -1;
        g00 g00Var = (g00) this.d.h.get(i10);
        h00Var.b = g00Var;
        h00Var.e = i10;
        h00Var.setContentDescription(g00Var.b);
        h00Var.requestLayout();
        boolean z4 = h00Var.n;
        g00 g00Var2 = h00Var.b;
        if (z4 != (g00Var2 != null && g00Var2.g)) {
            u5.release(h00Var, h00Var.r);
            u5.release(h00Var, h00Var.L);
            u5.release(h00Var, h00Var.N);
            u5.release(h00Var, h00Var.P);
            if (h00Var.i0) {
                h00Var.r = u5.update(h00Var.b.g ? 26 : 0, h00Var, h00Var.r, h00Var.s);
                h00Var.L = u5.update(h00Var.b.g ? 26 : 0, h00Var, h00Var.L, h00Var.M);
                h00Var.N = u5.update(h00Var.b.g ? 26 : 0, h00Var, h00Var.N, h00Var.O);
                h00Var.P = u5.update(h00Var.b.g ? 26 : 0, h00Var, h00Var.P, h00Var.Q);
            }
            h00Var.n = h00Var.b.g;
        }
        if (id2 != h00Var.getId()) {
            h00Var.h0 = h00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new el0(new h00(this.d, this.c));
    }
}
