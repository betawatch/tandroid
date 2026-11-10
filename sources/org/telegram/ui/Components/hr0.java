package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hr0 extends vs0 {
    public final /* synthetic */ ys0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr0(ys0 ys0Var, Context context) {
        super(ys0Var, context, 0, false);
        this.G = ys0Var;
    }

    @Override // org.telegram.ui.Components.vs0, v4.g0
    public final void f() {
        super.f();
        ys0 ys0Var = this.G;
        tr0 g02 = ys0Var.g0(8);
        if (g02 != null && g02.n.getVisibility() == 0) {
            ys0Var.f0.f();
        }
        if (g02 != null) {
            oq0 oq0Var = g02.w;
            di.r6 r6Var = this.s;
            oq0Var.e(r6Var != null && (r6Var.k() || (ys0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
