package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ct0 extends ru0 {
    public final /* synthetic */ xu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct0(xu0 xu0Var, Context context) {
        super(xu0Var, context);
        this.h = xu0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        xu0 xu0Var = this.h;
        qt0 W = xu0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        xu0Var.I.l();
    }
}
