package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class us0 extends ts0 {
    public final /* synthetic */ vs0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(vs0 vs0Var, Context context, int i3) {
        super(vs0Var.e, context, i3, false);
        this.H = vs0Var;
    }

    @Override // org.telegram.ui.Components.ts0, u4.h0
    public final void f() {
        super.f();
        vs0 vs0Var = this.H;
        ws0 ws0Var = vs0Var.e;
        int i3 = vs0Var.a;
        int[] iArr = ws0.t2;
        rr0 g02 = ws0Var.g0(i3);
        if (g02 != null && g02.n.getVisibility() == 0) {
            vs0Var.d.f();
        }
        if (g02 != null) {
            nq0 nq0Var = g02.w;
            ei.r6 r6Var = this.s;
            nq0Var.e(r6Var != null && (r6Var.k() || (ws0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
