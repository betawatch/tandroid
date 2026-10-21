package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class mw0 extends org.telegram.ui.Components.im0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ nw0 d;

    public mw0(nw0 nw0Var, Context context) {
        this.d = nw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        return !((pw0) this.d.n.d.get(b1Var.b())).a.current;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        sg.r1 r1Var = (sg.r1) b1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        r1Var.a((pw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        r1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        lw0 lw0Var = new lw0(this, this.c);
        lw0Var.setCirclePaintProvider(new en0(7, this, lw0Var));
        return new org.telegram.ui.Components.tl0(lw0Var);
    }
}
