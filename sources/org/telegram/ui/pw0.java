package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pw0 extends org.telegram.ui.Components.sl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ qw0 d;

    public pw0(qw0 qw0Var, Context context) {
        this.d = qw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return !((sw0) this.d.n.d.get(m1Var.b())).a.current;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        fg.j2 j2Var = (fg.j2) m1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        j2Var.a((sw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        j2Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ow0 ow0Var = new ow0(this, this.c);
        ow0Var.setCirclePaintProvider(new vl0(10, this, ow0Var));
        return new org.telegram.ui.Components.fl0(ow0Var);
    }
}
