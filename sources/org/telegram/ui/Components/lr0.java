package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class lr0 extends vu0 {
    public final /* synthetic */ yu0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr0(yu0 yu0Var, Context context) {
        super(yu0Var, context, 0, true);
        this.G = yu0Var;
    }

    @Override // org.telegram.ui.Components.vu0, s4.h0
    public final void l() {
        super.l();
        yu0 yu0Var = this.G;
        rt0 W = yu0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            yu0Var.f0.l();
        }
        if (W != null) {
            is0 is0Var = W.w;
            ai.d9 d9Var = this.s;
            is0Var.e(d9Var != null && (d9Var.k() || (yu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
