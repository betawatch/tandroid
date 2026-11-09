package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ir0 extends ws0 {
    public final /* synthetic */ zs0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir0(zs0 zs0Var, Context context) {
        super(zs0Var, context, 0, false);
        this.G = zs0Var;
    }

    @Override // org.telegram.ui.Components.ws0, v4.g0
    public final void f() {
        super.f();
        zs0 zs0Var = this.G;
        ur0 g02 = zs0Var.g0(8);
        if (g02 != null && g02.n.getVisibility() == 0) {
            zs0Var.f0.f();
        }
        if (g02 != null) {
            pq0 pq0Var = g02.w;
            di.r6 r6Var = this.s;
            pq0Var.e(r6Var != null && (r6Var.k() || (zs0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
