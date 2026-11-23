package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ar0 extends FragmentContextView {
    public final /* synthetic */ it0 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(it0 it0Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, it0 it0Var2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, g2Var, it0Var2, false, i6Var);
        this.Y0 = it0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        it0 it0Var = this.Y0;
        it0Var.S0.j(it0Var.T0, i7 == 0, true);
    }
}
