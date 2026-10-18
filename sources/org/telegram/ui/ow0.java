package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ow0 extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ pw0 d;

    public ow0(pw0 pw0Var, Context context) {
        this.d = pw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return !((rw0) this.d.n.d.get(b1Var.b())).a.current;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        sg.q1 q1Var = (sg.q1) b1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        q1Var.a((rw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        q1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        nw0 nw0Var = new nw0(this, this.c);
        nw0Var.setCirclePaintProvider(new gn0(7, this, nw0Var));
        return new org.telegram.ui.Components.sl0(nw0Var);
    }
}
