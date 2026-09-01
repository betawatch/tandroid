package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h00 extends sl0 {
    public final Context c;
    public final /* synthetic */ l00 d;

    public h00(l00 l00Var, Context context) {
        this.d = l00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.p0
    public final long i(int i10) {
        return this.d.h0.get(i10);
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        j00 j00Var = (j00) m1Var.a;
        int id2 = j00Var.b != null ? j00Var.getId() : -1;
        i00 i00Var = (i00) this.d.h.get(i10);
        j00Var.b = i00Var;
        j00Var.e = i10;
        j00Var.setContentDescription(i00Var.b);
        j00Var.requestLayout();
        boolean z4 = j00Var.n;
        i00 i00Var2 = j00Var.b;
        if (z4 != (i00Var2 != null && i00Var2.g)) {
            u5.release(j00Var, j00Var.r);
            u5.release(j00Var, j00Var.L);
            u5.release(j00Var, j00Var.N);
            u5.release(j00Var, j00Var.P);
            if (j00Var.i0) {
                j00Var.r = u5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.r, j00Var.s);
                j00Var.L = u5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.L, j00Var.M);
                j00Var.N = u5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.N, j00Var.O);
                j00Var.P = u5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.P, j00Var.Q);
            }
            j00Var.n = j00Var.b.g;
        }
        if (id2 != j00Var.getId()) {
            j00Var.h0 = j00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new fl0(new j00(this.d, this.c));
    }
}
