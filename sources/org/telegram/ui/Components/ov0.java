package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ov0 extends nv0 {
    public final /* synthetic */ pv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(pv0 pv0Var, Context context, int i10) {
        super(pv0Var.e, context, i10, false);
        this.G = pv0Var;
    }

    @Override // org.telegram.ui.Components.nv0, s4.h0
    public final void l() {
        super.l();
        pv0 pv0Var = this.G;
        qv0 qv0Var = pv0Var.e;
        int i10 = pv0Var.a;
        int[] iArr = qv0.d2;
        ju0 W = qv0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            pv0Var.d.l();
        }
        if (W != null) {
            at0 at0Var = W.w;
            ai.d9 d9Var = this.s;
            at0Var.e(d9Var != null && (d9Var.k() || (qv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
