package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class cx0 extends org.telegram.ui.Components.yl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ dx0 d;

    public cx0(dx0 dx0Var, Context context) {
        this.d = dx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return !((fx0) this.d.n.d.get(c1Var.b())).a.current;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        rg.r1 r1Var = (rg.r1) c1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        r1Var.a((fx0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        r1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        bx0 bx0Var = new bx0(this, this.c);
        bx0Var.setCirclePaintProvider(new fs0(4, this, bx0Var));
        return new org.telegram.ui.Components.il0(bx0Var);
    }
}
