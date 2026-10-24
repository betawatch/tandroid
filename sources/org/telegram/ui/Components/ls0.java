package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ls0 extends uv0 {
    public final /* synthetic */ xv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(xv0 xv0Var, Context context) {
        super(xv0Var, context, 0, true);
        this.G = xv0Var;
    }

    @Override // org.telegram.ui.Components.uv0, s4.g0
    public final void l() {
        super.l();
        xv0 xv0Var = this.G;
        qu0 X = xv0Var.X(9);
        if (X != null && X.r.getVisibility() == 0) {
            xv0Var.f0.l();
        }
        if (X != null) {
            ht0 ht0Var = X.w;
            ci.z6 z6Var = this.s;
            ht0Var.e(z6Var != null && (z6Var.k() || (xv0Var.k0() && this.s.g() > 0)), true);
        }
    }
}
