package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ew0 extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ fw0 d;

    public ew0(fw0 fw0Var, Context context) {
        this.d = fw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return !((hw0) this.d.n.d.get(q1Var.b())).a.current;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        zf.p1 p1Var = (zf.p1) q1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        p1Var.a((hw0) premiumPreviewFragment.d.get(i9), i9 != h() - 1);
        p1Var.c(premiumPreviewFragment.e == i9, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        dw0 dw0Var = new dw0(this, this.c);
        dw0Var.setCirclePaintProvider(new nl0(11, this, dw0Var));
        return new org.telegram.ui.Components.ik0(dw0Var);
    }
}
