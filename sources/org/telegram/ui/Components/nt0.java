package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nt0 extends FragmentContextView {
    public final /* synthetic */ bw0 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, bw0 bw0Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, n2Var, bw0Var2, false, e6Var);
        this.R0 = bw0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        bw0 bw0Var = this.R0;
        bw0Var.P0.i(bw0Var.Q0, i10 == 0, true);
    }
}
