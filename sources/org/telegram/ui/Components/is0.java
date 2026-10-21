package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class is0 extends rv0 {
    public final /* synthetic */ uv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(uv0 uv0Var, Context context) {
        super(uv0Var, context, 0, true);
        this.G = uv0Var;
    }

    @Override // org.telegram.ui.Components.rv0, s4.g0
    public final void l() {
        super.l();
        uv0 uv0Var = this.G;
        nu0 W = uv0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            uv0Var.f0.l();
        }
        if (W != null) {
            et0 et0Var = W.w;
            ci.a7 a7Var = this.s;
            et0Var.e(a7Var != null && (a7Var.k() || (uv0Var.j0() && this.s.g() > 0)), true);
        }
    }
}
