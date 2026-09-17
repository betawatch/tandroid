package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class ft0 extends uu0 {
    public final /* synthetic */ xu0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(xu0 xu0Var, Context context) {
        super(xu0Var, context, 0, false);
        this.G = xu0Var;
    }

    @Override // org.telegram.ui.Components.uu0, s4.h0
    public final void l() {
        super.l();
        xu0 xu0Var = this.G;
        qt0 W = xu0Var.W(8);
        if (W != null && W.r.getVisibility() == 0) {
            xu0Var.d0.l();
        }
        if (W != null) {
            hs0 hs0Var = W.w;
            bi.l8 l8Var = this.s;
            hs0Var.e(l8Var != null && (l8Var.k() || (xu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
