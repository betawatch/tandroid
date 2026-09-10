package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ur0 extends fv0 {
    public final /* synthetic */ iv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(iv0 iv0Var, Context context) {
        super(iv0Var, context, 0, true);
        this.G = iv0Var;
    }

    @Override // org.telegram.ui.Components.fv0, s4.h0
    public final void l() {
        super.l();
        iv0 iv0Var = this.G;
        au0 W = iv0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            iv0Var.f0.l();
        }
        if (W != null) {
            rs0 rs0Var = W.w;
            zh.a5 a5Var = this.s;
            rs0Var.e(a5Var != null && (a5Var.k() || (iv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
