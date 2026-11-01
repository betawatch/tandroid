package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class bu0 extends org.telegram.ui.Components.tk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ cu0 d;

    public bu0(cu0 cu0Var, Context context) {
        this.d = cu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return !((eu0) this.d.n.d.get(c1Var.b())).a.current;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        kg.a2 a2Var = (kg.a2) c1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        a2Var.a((eu0) premiumPreviewFragment.d.get(i10), i10 != b() - 1);
        a2Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        au0 au0Var = new au0(this, this.c);
        au0Var.setCirclePaintProvider(new cp0(6, this, au0Var));
        return new org.telegram.ui.Components.dk0(au0Var);
    }
}
