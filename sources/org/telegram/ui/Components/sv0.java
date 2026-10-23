package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class sv0 extends rv0 {
    public final /* synthetic */ tv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(tv0 tv0Var, Context context, int i10) {
        super(tv0Var.e, context, i10, false);
        this.G = tv0Var;
    }

    @Override // org.telegram.ui.Components.rv0, s4.g0
    public final void l() {
        super.l();
        tv0 tv0Var = this.G;
        uv0 uv0Var = tv0Var.e;
        int i10 = tv0Var.a;
        int[] iArr = uv0.d2;
        nu0 W = uv0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            tv0Var.d.l();
        }
        if (W != null) {
            et0 et0Var = W.w;
            ci.a7 a7Var = this.s;
            et0Var.e(a7Var != null && (a7Var.k() || (uv0Var.j0() && this.s.g() > 0)), true);
        }
    }
}
