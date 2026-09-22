package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class xs0 extends FragmentContextView {
    public final /* synthetic */ lv0 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(lv0 lv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, lv0 lv0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n2Var, lv0Var2, false, f6Var);
        this.P0 = lv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        lv0 lv0Var = this.P0;
        lv0Var.P0.i(lv0Var.Q0, i10 == 0, true);
    }
}
