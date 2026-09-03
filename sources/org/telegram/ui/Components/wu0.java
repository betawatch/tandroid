package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wu0 extends vu0 {
    public final /* synthetic */ xu0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu0(xu0 xu0Var, Context context, int i10) {
        super(xu0Var.e, context, i10, false);
        this.D = xu0Var;
    }

    @Override // org.telegram.ui.Components.vu0, f2.o0
    public final void l() {
        super.l();
        xu0 xu0Var = this.D;
        yu0 yu0Var = xu0Var.e;
        int i10 = xu0Var.a;
        int[] iArr = yu0.a2;
        qt0 W = yu0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            xu0Var.d.l();
        }
        if (W != null) {
            hs0 hs0Var = W.w;
            nh.l6 l6Var = this.s;
            hs0Var.e(l6Var != null && (l6Var.k() || (yu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
