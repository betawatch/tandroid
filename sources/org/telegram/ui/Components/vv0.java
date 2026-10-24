package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vv0 extends uv0 {
    public final /* synthetic */ wv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv0(wv0 wv0Var, Context context, int i10) {
        super(wv0Var.e, context, i10, false);
        this.G = wv0Var;
    }

    @Override // org.telegram.ui.Components.uv0, s4.g0
    public final void l() {
        super.l();
        wv0 wv0Var = this.G;
        xv0 xv0Var = wv0Var.e;
        int i10 = wv0Var.a;
        int[] iArr = xv0.g2;
        qu0 X = xv0Var.X(i10);
        if (X != null && X.r.getVisibility() == 0) {
            wv0Var.d.l();
        }
        if (X != null) {
            ht0 ht0Var = X.w;
            ci.z6 z6Var = this.s;
            ht0Var.e(z6Var != null && (z6Var.k() || (xv0Var.k0() && this.s.g() > 0)), true);
        }
    }
}
