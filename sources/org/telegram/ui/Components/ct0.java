package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
