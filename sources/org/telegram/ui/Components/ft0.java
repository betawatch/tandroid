package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ft0 extends vu0 {
    public final /* synthetic */ yu0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(yu0 yu0Var, Context context) {
        super(yu0Var, context, 0, false);
        this.D = yu0Var;
    }

    @Override // org.telegram.ui.Components.vu0, f2.o0
    public final void l() {
        super.l();
        yu0 yu0Var = this.D;
        qt0 W = yu0Var.W(8);
        if (W != null && W.r.getVisibility() == 0) {
            yu0Var.a0.l();
        }
        if (W != null) {
            hs0 hs0Var = W.w;
            nh.l6 l6Var = this.s;
            hs0Var.e(l6Var != null && (l6Var.k() || (yu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
