package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class wr0 extends gv0 {
    public final /* synthetic */ jv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr0(jv0 jv0Var, Context context) {
        super(jv0Var, context, 0, true);
        this.G = jv0Var;
    }

    @Override // org.telegram.ui.Components.gv0, s4.h0
    public final void l() {
        super.l();
        jv0 jv0Var = this.G;
        cu0 W = jv0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            jv0Var.f0.l();
        }
        if (W != null) {
            ts0 ts0Var = W.w;
            ai.d9 d9Var = this.s;
            ts0Var.e(d9Var != null && (d9Var.k() || (jv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
