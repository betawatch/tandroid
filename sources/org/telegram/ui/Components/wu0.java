package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wu0 extends vu0 {
    public final /* synthetic */ xu0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu0(xu0 xu0Var, Context context, int i10) {
        super(xu0Var.e, context, i10, false);
        this.G = xu0Var;
    }

    @Override // org.telegram.ui.Components.vu0, s4.h0
    public final void l() {
        super.l();
        xu0 xu0Var = this.G;
        yu0 yu0Var = xu0Var.e;
        int i10 = xu0Var.a;
        int[] iArr = yu0.d2;
        rt0 W = yu0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            xu0Var.d.l();
        }
        if (W != null) {
            is0 is0Var = W.w;
            ai.d9 d9Var = this.s;
            is0Var.e(d9Var != null && (d9Var.k() || (yu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
