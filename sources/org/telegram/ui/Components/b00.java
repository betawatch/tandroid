package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b00 extends il0 {
    public final Context c;
    public final /* synthetic */ f00 d;

    public b00(f00 f00Var, Context context) {
        this.d = f00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.p0
    public final long i(int i10) {
        return this.d.g0.get(i10);
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        d00 d00Var = (d00) n1Var.a;
        int id2 = d00Var.b != null ? d00Var.getId() : -1;
        c00 c00Var = (c00) this.d.h.get(i10);
        d00Var.b = c00Var;
        d00Var.e = i10;
        d00Var.setContentDescription(c00Var.b);
        d00Var.requestLayout();
        boolean z10 = d00Var.n;
        c00 c00Var2 = d00Var.b;
        if (z10 != (c00Var2 != null && c00Var2.g)) {
            y5.release(d00Var, d00Var.r);
            y5.release(d00Var, d00Var.K);
            y5.release(d00Var, d00Var.M);
            y5.release(d00Var, d00Var.O);
            if (d00Var.h0) {
                d00Var.r = y5.update(d00Var.b.g ? 26 : 0, d00Var, d00Var.r, d00Var.s);
                d00Var.K = y5.update(d00Var.b.g ? 26 : 0, d00Var, d00Var.K, d00Var.L);
                d00Var.M = y5.update(d00Var.b.g ? 26 : 0, d00Var, d00Var.M, d00Var.N);
                d00Var.O = y5.update(d00Var.b.g ? 26 : 0, d00Var, d00Var.O, d00Var.P);
            }
            d00Var.n = d00Var.b.g;
        }
        if (id2 != d00Var.getId()) {
            d00Var.g0 = d00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new vk0(new d00(this.d, this.c));
    }
}
