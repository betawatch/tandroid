package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ps0 extends yv0 {
    public final /* synthetic */ bw0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(bw0 bw0Var, Context context) {
        super(bw0Var, context, 0, true);
        this.G = bw0Var;
    }

    @Override // org.telegram.ui.Components.yv0, s4.i0
    public final void l() {
        super.l();
        bw0 bw0Var = this.G;
        uu0 W = bw0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            bw0Var.f0.l();
        }
        if (W != null) {
            lt0 lt0Var = W.w;
            ai.e9 e9Var = this.s;
            lt0Var.e(e9Var != null && (e9Var.k() || (bw0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
