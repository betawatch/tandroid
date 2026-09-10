package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gv0 extends fv0 {
    public final /* synthetic */ hv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv0(hv0 hv0Var, Context context, int i10) {
        super(hv0Var.e, context, i10, false);
        this.G = hv0Var;
    }

    @Override // org.telegram.ui.Components.fv0, s4.h0
    public final void l() {
        super.l();
        hv0 hv0Var = this.G;
        iv0 iv0Var = hv0Var.e;
        int i10 = hv0Var.a;
        int[] iArr = iv0.d2;
        au0 W = iv0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            hv0Var.d.l();
        }
        if (W != null) {
            rs0 rs0Var = W.w;
            zh.a5 a5Var = this.s;
            rs0Var.e(a5Var != null && (a5Var.k() || (iv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
