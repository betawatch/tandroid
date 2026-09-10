package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ts0 extends FragmentContextView {
    public final /* synthetic */ iv0 N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(iv0 iv0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, iv0 iv0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, p2Var, iv0Var2, false, f6Var);
        this.N0 = iv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        iv0 iv0Var = this.N0;
        iv0Var.P0.i(iv0Var.Q0, i10 == 0, true);
    }
}
