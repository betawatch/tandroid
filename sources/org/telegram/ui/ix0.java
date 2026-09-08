package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ix0 extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ jx0 d;

    public ix0(jx0 jx0Var, Context context) {
        this.d = jx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return !((lx0) this.d.n.d.get(c1Var.b())).a.current;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        sg.t1 t1Var = (sg.t1) c1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        t1Var.a((lx0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        t1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hx0 hx0Var = new hx0(this, this.c);
        hx0Var.setCirclePaintProvider(new qv0(2, this, hx0Var));
        return new org.telegram.ui.Components.vk0(hx0Var);
    }
}
