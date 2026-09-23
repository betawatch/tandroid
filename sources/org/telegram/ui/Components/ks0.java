package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ks0 extends FragmentContextView {
    public final /* synthetic */ yu0 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, yu0 yu0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, yu0Var2, false, d6Var);
        this.P0 = yu0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        yu0 yu0Var = this.P0;
        yu0Var.P0.i(yu0Var.Q0, i10 == 0, true);
    }
}
