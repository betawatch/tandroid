package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class kr0 extends uu0 {
    public final /* synthetic */ xu0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr0(xu0 xu0Var, Context context) {
        super(xu0Var, context, 0, true);
        this.G = xu0Var;
    }

    @Override // org.telegram.ui.Components.uu0, s4.h0
    public final void l() {
        super.l();
        xu0 xu0Var = this.G;
        qt0 W = xu0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            xu0Var.f0.l();
        }
        if (W != null) {
            hs0 hs0Var = W.w;
            bi.l8 l8Var = this.s;
            hs0Var.e(l8Var != null && (l8Var.k() || (xu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
