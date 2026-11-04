package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class js0 extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ks0 d;

    public js0(ks0 ks0Var, Context context) {
        this.d = ks0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return !((ms0) this.d.n.d.get(d1Var.b())).a.current;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        vg.n1 n1Var = (vg.n1) d1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        n1Var.a((ms0) premiumPreviewFragment.d.get(i3), i3 != b() - 1);
        n1Var.c(premiumPreviewFragment.e == i3, false);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        is0 is0Var = new is0(this, this.c);
        is0Var.setCirclePaintProvider(new rb0(15, this, is0Var));
        return new org.telegram.ui.Components.bj0(is0Var);
    }
}
