package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ox0 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ px0 d;

    public ox0(px0 px0Var, Context context) {
        this.d = px0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return !((rx0) this.d.n.d.get(b1Var.b())).a.current;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        sg.r1 r1Var = (sg.r1) b1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        r1Var.a((rx0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        r1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        nx0 nx0Var = new nx0(this, this.c);
        nx0Var.setCirclePaintProvider(new cs0(6, this, nx0Var));
        return new org.telegram.ui.Components.wl0(nx0Var);
    }
}
