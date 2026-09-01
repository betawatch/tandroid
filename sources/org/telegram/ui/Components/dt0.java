package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class dt0 extends tu0 {
    public final /* synthetic */ zu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(zu0 zu0Var, Context context) {
        super(zu0Var, context);
        this.h = zu0Var;
    }

    @Override // f2.p0
    public final void l() {
        super.l();
        zu0 zu0Var = this.h;
        rt0 W = zu0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        zu0Var.F.l();
    }
}
