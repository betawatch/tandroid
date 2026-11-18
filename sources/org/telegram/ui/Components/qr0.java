package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qr0 extends dt0 {
    public final /* synthetic */ gt0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(gt0 gt0Var, Context context) {
        super(gt0Var, context, 0, false);
        this.H = gt0Var;
    }

    @Override // org.telegram.ui.Components.dt0, v4.i0
    public final void f() {
        super.f();
        gt0 gt0Var = this.H;
        bs0 g02 = gt0Var.g0(8);
        if (g02 != null && g02.n.getVisibility() == 0) {
            gt0Var.g0.f();
        }
        if (g02 != null) {
            xq0 xq0Var = g02.w;
            fi.h6 h6Var = this.s;
            xq0Var.e(h6Var != null && (h6Var.k() || (gt0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
