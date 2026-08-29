package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dw0 extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ew0 d;

    public dw0(ew0 ew0Var, Context context) {
        this.d = ew0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return !((gw0) this.d.n.d.get(n1Var.b())).a.current;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        cg.l2 l2Var = (cg.l2) n1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        l2Var.a((gw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        l2Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        cw0 cw0Var = new cw0(this, this.c);
        cw0Var.setCirclePaintProvider(new kl0(11, this, cw0Var));
        return new org.telegram.ui.Components.vk0(cw0Var);
    }
}
