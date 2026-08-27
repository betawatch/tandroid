package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ew0 extends org.telegram.ui.Components.yk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ fw0 d;

    public ew0(fw0 fw0Var, Context context) {
        this.d = fw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return !((hw0) this.d.n.d.get(o1Var.b())).a.current;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        ag.e3 e3Var = (ag.e3) o1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        e3Var.a((hw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        e3Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        dw0 dw0Var = new dw0(this, this.c);
        dw0Var.setCirclePaintProvider(new nl0(11, this, dw0Var));
        return new org.telegram.ui.Components.lk0(dw0Var);
    }
}
