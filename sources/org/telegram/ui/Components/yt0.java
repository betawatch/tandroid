package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class yt0 extends nv0 {
    public final /* synthetic */ qv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt0(qv0 qv0Var, Context context) {
        super(qv0Var, context, 0, false);
        this.G = qv0Var;
    }

    @Override // org.telegram.ui.Components.nv0, s4.h0
    public final void l() {
        super.l();
        qv0 qv0Var = this.G;
        ju0 W = qv0Var.W(8);
        if (W != null && W.r.getVisibility() == 0) {
            qv0Var.d0.l();
        }
        if (W != null) {
            at0 at0Var = W.w;
            ai.d9 d9Var = this.s;
            at0Var.e(d9Var != null && (d9Var.k() || (qv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
