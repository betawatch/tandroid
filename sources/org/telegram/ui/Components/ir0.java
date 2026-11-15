package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ir0 extends vs0 {
    public final /* synthetic */ ys0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir0(ys0 ys0Var, Context context) {
        super(ys0Var, context, 0, false);
        this.H = ys0Var;
    }

    @Override // org.telegram.ui.Components.vs0, v4.h0
    public final void f() {
        super.f();
        ys0 ys0Var = this.H;
        tr0 g02 = ys0Var.g0(8);
        if (g02 != null && g02.n.getVisibility() == 0) {
            ys0Var.g0.f();
        }
        if (g02 != null) {
            pq0 pq0Var = g02.w;
            fi.k6 k6Var = this.s;
            pq0Var.e(k6Var != null && (k6Var.k() || (ys0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
