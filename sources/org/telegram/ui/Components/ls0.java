package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ls0 extends uv0 {
    public final /* synthetic */ xv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(xv0 xv0Var, Context context) {
        super(xv0Var, context, 0, true);
        this.G = xv0Var;
    }

    @Override // org.telegram.ui.Components.uv0, s4.g0
    public final void l() {
        super.l();
        xv0 xv0Var = this.G;
        qu0 W = xv0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            xv0Var.f0.l();
        }
        if (W != null) {
            ht0 ht0Var = W.w;
            bi.o8 o8Var = this.s;
            ht0Var.e(o8Var != null && (o8Var.k() || (xv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
