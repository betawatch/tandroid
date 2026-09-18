package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class kx0 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ lx0 d;

    public kx0(lx0 lx0Var, Context context) {
        this.d = lx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return !((nx0) this.d.n.d.get(c1Var.b())).a.current;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        rg.p1 p1Var = (rg.p1) c1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        p1Var.a((nx0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        p1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jx0 jx0Var = new jx0(this, this.c);
        jx0Var.setCirclePaintProvider(new tv0(1, this, jx0Var));
        return new org.telegram.ui.Components.wk0(jx0Var);
    }
}
