package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ks0 extends FragmentContextView {
    public final /* synthetic */ zu0 K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, zu0 zu0Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, p2Var, zu0Var2, false, g6Var);
        this.K0 = zu0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        zu0 zu0Var = this.K0;
        zu0Var.M0.i(zu0Var.N0, i10 == 0, true);
    }
}
