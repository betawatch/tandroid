package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nw0 extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ow0 d;

    public nw0(ow0 ow0Var, Context context) {
        this.d = ow0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return !((qw0) this.d.n.d.get(l1Var.b())).a.current;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        eg.k2 k2Var = (eg.k2) l1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        k2Var.a((qw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        k2Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        mw0 mw0Var = new mw0(this, this.c);
        mw0Var.setCirclePaintProvider(new tl0(10, this, mw0Var));
        return new org.telegram.ui.Components.el0(mw0Var);
    }
}
