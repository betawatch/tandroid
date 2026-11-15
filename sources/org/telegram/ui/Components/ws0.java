package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ws0 extends vs0 {
    public final /* synthetic */ xs0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(xs0 xs0Var, Context context, int i7) {
        super(xs0Var.e, context, i7, false);
        this.H = xs0Var;
    }

    @Override // org.telegram.ui.Components.vs0, v4.h0
    public final void f() {
        super.f();
        xs0 xs0Var = this.H;
        ys0 ys0Var = xs0Var.e;
        int i7 = xs0Var.a;
        int[] iArr = ys0.t2;
        tr0 g02 = ys0Var.g0(i7);
        if (g02 != null && g02.n.getVisibility() == 0) {
            xs0Var.d.f();
        }
        if (g02 != null) {
            pq0 pq0Var = g02.w;
            fi.k6 k6Var = this.s;
            pq0Var.e(k6Var != null && (k6Var.k() || (ys0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
