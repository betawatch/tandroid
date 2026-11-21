package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ht0 extends gt0 {
    public final /* synthetic */ it0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(it0 it0Var, Context context, int i7) {
        super(it0Var.e, context, i7, false);
        this.H = it0Var;
    }

    @Override // org.telegram.ui.Components.gt0, v4.i0
    public final void f() {
        super.f();
        it0 it0Var = this.H;
        jt0 jt0Var = it0Var.e;
        int i7 = it0Var.a;
        int[] iArr = jt0.t2;
        ds0 g02 = jt0Var.g0(i7);
        if (g02 != null && g02.n.getVisibility() == 0) {
            it0Var.d.f();
        }
        if (g02 != null) {
            zq0 zq0Var = g02.w;
            fi.h6 h6Var = this.s;
            zq0Var.e(h6Var != null && (h6Var.k() || (jt0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
