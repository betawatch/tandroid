package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        int[] iArr = xv0.d2;
        qu0 W = xv0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            wv0Var.d.l();
        }
        if (W != null) {
            ht0 ht0Var = W.w;
            bi.o8 o8Var = this.s;
            ht0Var.e(o8Var != null && (o8Var.k() || (xv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
