package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        sg.r1 r1Var = (sg.r1) b1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        r1Var.a((rw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        r1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        nw0 nw0Var = new nw0(this, this.c);
        nw0Var.setCirclePaintProvider(new gn0(7, this, nw0Var));
        return new org.telegram.ui.Components.sl0(nw0Var);
    }
}
