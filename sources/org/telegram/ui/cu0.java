package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cu0 extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ du0 d;

    public cu0(du0 du0Var, Context context) {
        this.d = du0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return !((fu0) this.d.n.d.get(c1Var.b())).a.current;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        kg.a2 a2Var = (kg.a2) c1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        a2Var.a((fu0) premiumPreviewFragment.d.get(i10), i10 != b() - 1);
        a2Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        bu0 bu0Var = new bu0(this, this.c);
        bu0Var.setCirclePaintProvider(new ep0(6, this, bu0Var));
        return new org.telegram.ui.Components.ck0(bu0Var);
    }
}
