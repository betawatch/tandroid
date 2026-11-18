package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class et0 extends dt0 {
    public final /* synthetic */ ft0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(ft0 ft0Var, Context context, int i7) {
        super(ft0Var.e, context, i7, false);
        this.H = ft0Var;
    }

    @Override // org.telegram.ui.Components.dt0, v4.i0
    public final void f() {
        super.f();
        ft0 ft0Var = this.H;
        gt0 gt0Var = ft0Var.e;
        int i7 = ft0Var.a;
        int[] iArr = gt0.t2;
        bs0 g02 = gt0Var.g0(i7);
        if (g02 != null && g02.n.getVisibility() == 0) {
            ft0Var.d.f();
        }
        if (g02 != null) {
            xq0 xq0Var = g02.w;
            fi.h6 h6Var = this.s;
            xq0Var.e(h6Var != null && (h6Var.k() || (gt0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
