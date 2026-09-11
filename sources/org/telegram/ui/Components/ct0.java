package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
