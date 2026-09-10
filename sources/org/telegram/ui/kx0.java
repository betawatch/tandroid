package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kx0 extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ lx0 d;

    public kx0(lx0 lx0Var, Context context) {
        this.d = lx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return !((nx0) this.d.n.d.get(c1Var.b())).a.current;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        qg.r1 r1Var = (qg.r1) c1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        r1Var.a((nx0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        r1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jx0 jx0Var = new jx0(this, this.c);
        jx0Var.setCirclePaintProvider(new l80(27, this, jx0Var));
        return new org.telegram.ui.Components.fl0(jx0Var);
    }
}
