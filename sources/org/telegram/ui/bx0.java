package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bx0 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ cx0 d;

    public bx0(cx0 cx0Var, Context context) {
        this.d = cx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return !((ex0) this.d.n.d.get(c1Var.b())).a.current;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        rg.p1 p1Var = (rg.p1) c1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        p1Var.a((ex0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        p1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ax0 ax0Var = new ax0(this, this.c);
        ax0Var.setCirclePaintProvider(new kv0(2, this, ax0Var));
        return new org.telegram.ui.Components.wk0(ax0Var);
    }
}
