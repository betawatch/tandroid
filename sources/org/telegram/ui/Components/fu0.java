package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class fu0 extends uv0 {
    public final /* synthetic */ xv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu0(xv0 xv0Var, Context context) {
        super(xv0Var, context, 0, false);
        this.G = xv0Var;
    }

    @Override // org.telegram.ui.Components.uv0, s4.g0
    public final void l() {
        super.l();
        xv0 xv0Var = this.G;
        qu0 X = xv0Var.X(8);
        if (X != null && X.r.getVisibility() == 0) {
            xv0Var.d0.l();
        }
        if (X != null) {
            ht0 ht0Var = X.w;
            ci.z6 z6Var = this.s;
            ht0Var.e(z6Var != null && (z6Var.k() || (xv0Var.k0() && this.s.g() > 0)), true);
        }
    }
}
