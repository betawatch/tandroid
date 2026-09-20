package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ix0 extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ jx0 d;

    public ix0(jx0 jx0Var, Context context) {
        this.d = jx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return !((lx0) this.d.n.d.get(c1Var.b())).a.current;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        rg.p1 p1Var = (rg.p1) c1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        p1Var.a((lx0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        p1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hx0 hx0Var = new hx0(this, this.c);
        hx0Var.setCirclePaintProvider(new rv0(2, this, hx0Var));
        return new org.telegram.ui.Components.fl0(hx0Var);
    }
}
