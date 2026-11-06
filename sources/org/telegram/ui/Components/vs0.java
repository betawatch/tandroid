package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class vs0 extends us0 {
    public final /* synthetic */ ws0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(ws0 ws0Var, Context context, int i7) {
        super(ws0Var.e, context, i7, false);
        this.G = ws0Var;
    }

    @Override // org.telegram.ui.Components.us0, v4.g0
    public final void f() {
        super.f();
        ws0 ws0Var = this.G;
        xs0 xs0Var = ws0Var.e;
        int i7 = ws0Var.a;
        int[] iArr = xs0.s2;
        sr0 g02 = xs0Var.g0(i7);
        if (g02 != null && g02.n.getVisibility() == 0) {
            ws0Var.d.f();
        }
        if (g02 != null) {
            nq0 nq0Var = g02.w;
            di.q6 q6Var = this.s;
            nq0Var.e(q6Var != null && (q6Var.k() || (xs0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
