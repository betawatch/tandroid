package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class vu0 extends uu0 {
    public final /* synthetic */ wu0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu0(wu0 wu0Var, Context context, int i10) {
        super(wu0Var.e, context, i10, false);
        this.G = wu0Var;
    }

    @Override // org.telegram.ui.Components.uu0, s4.h0
    public final void l() {
        super.l();
        wu0 wu0Var = this.G;
        xu0 xu0Var = wu0Var.e;
        int i10 = wu0Var.a;
        int[] iArr = xu0.d2;
        qt0 W = xu0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            wu0Var.d.l();
        }
        if (W != null) {
            hs0 hs0Var = W.w;
            bi.l8 l8Var = this.s;
            hs0Var.e(l8Var != null && (l8Var.k() || (xu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
