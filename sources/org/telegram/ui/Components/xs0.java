package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xs0 extends ws0 {
    public final /* synthetic */ ys0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(ys0 ys0Var, Context context, int i7) {
        super(ys0Var.e, context, i7, false);
        this.G = ys0Var;
    }

    @Override // org.telegram.ui.Components.ws0, v4.g0
    public final void f() {
        super.f();
        ys0 ys0Var = this.G;
        zs0 zs0Var = ys0Var.e;
        int i7 = ys0Var.a;
        int[] iArr = zs0.s2;
        ur0 g02 = zs0Var.g0(i7);
        if (g02 != null && g02.n.getVisibility() == 0) {
            ys0Var.d.f();
        }
        if (g02 != null) {
            pq0 pq0Var = g02.w;
            di.r6 r6Var = this.s;
            pq0Var.e(r6Var != null && (r6Var.k() || (zs0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
