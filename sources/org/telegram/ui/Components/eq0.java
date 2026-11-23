package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class eq0 extends gt0 {
    public final /* synthetic */ jt0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq0(jt0 jt0Var, Context context) {
        super(jt0Var, context, 0, true);
        this.H = jt0Var;
    }

    @Override // org.telegram.ui.Components.gt0, v4.i0
    public final void f() {
        super.f();
        jt0 jt0Var = this.H;
        ds0 g02 = jt0Var.g0(9);
        if (g02 != null && g02.n.getVisibility() == 0) {
            jt0Var.i0.f();
        }
        if (g02 != null) {
            zq0 zq0Var = g02.w;
            fi.h6 h6Var = this.s;
            zq0Var.e(h6Var != null && (h6Var.k() || (jt0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
