package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ds0 extends nv0 {
    public final /* synthetic */ qv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(qv0 qv0Var, Context context) {
        super(qv0Var, context, 0, true);
        this.G = qv0Var;
    }

    @Override // org.telegram.ui.Components.nv0, s4.h0
    public final void l() {
        super.l();
        qv0 qv0Var = this.G;
        ju0 W = qv0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            qv0Var.f0.l();
        }
        if (W != null) {
            at0 at0Var = W.w;
            ai.d9 d9Var = this.s;
            at0Var.e(d9Var != null && (d9Var.k() || (qv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
