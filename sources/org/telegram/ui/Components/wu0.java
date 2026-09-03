package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wu0 extends vu0 {
    public final /* synthetic */ xu0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu0(xu0 xu0Var, Context context, int i10) {
        super(xu0Var.e, context, i10, false);
        this.D = xu0Var;
    }

    @Override // org.telegram.ui.Components.vu0, f2.p0
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
            oh.l6 l6Var = this.s;
            hs0Var.e(l6Var != null && (l6Var.k() || (yu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
