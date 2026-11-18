package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class nr0 extends at0 {
    public final /* synthetic */ gt0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(gt0 gt0Var, Context context) {
        super(gt0Var, context);
        this.h = gt0Var;
    }

    @Override // v4.i0
    public final void f() {
        super.f();
        gt0 gt0Var = this.h;
        bs0 g02 = gt0Var.g0(0);
        if (g02 == null || g02.n.getVisibility() != 0) {
            return;
        }
        gt0Var.L.f();
    }
}
