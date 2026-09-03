package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ft0 extends vu0 {
    public final /* synthetic */ yu0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(yu0 yu0Var, Context context) {
        super(yu0Var, context, 0, false);
        this.D = yu0Var;
    }

    @Override // org.telegram.ui.Components.vu0, f2.p0
    public final void l() {
        super.l();
        yu0 yu0Var = this.D;
        qt0 W = yu0Var.W(8);
        if (W != null && W.r.getVisibility() == 0) {
            yu0Var.a0.l();
        }
        if (W != null) {
            hs0 hs0Var = W.w;
            oh.l6 l6Var = this.s;
            hs0Var.e(l6Var != null && (l6Var.k() || (yu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
