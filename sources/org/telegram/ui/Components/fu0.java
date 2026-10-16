package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        qu0 W = xv0Var.W(8);
        if (W != null && W.r.getVisibility() == 0) {
            xv0Var.d0.l();
        }
        if (W != null) {
            ht0 ht0Var = W.w;
            bi.o8 o8Var = this.s;
            ht0Var.e(o8Var != null && (o8Var.k() || (xv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
