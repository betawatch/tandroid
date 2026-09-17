package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
