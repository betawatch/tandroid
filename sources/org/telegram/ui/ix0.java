package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ix0 extends org.telegram.ui.Components.pm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ jx0 d;

    public ix0(jx0 jx0Var, Context context) {
        this.d = jx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return !((lx0) this.d.n.d.get(d1Var.b())).a.current;
    }

    @Override // s4.i0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        rg.q1 q1Var = (rg.q1) d1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        q1Var.a((lx0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        q1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        hx0 hx0Var = new hx0(this, this.c);
        hx0Var.setCirclePaintProvider(new ls0(3, this, hx0Var));
        return new org.telegram.ui.Components.am0(hx0Var);
    }
}
