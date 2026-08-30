package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class js0 extends FragmentContextView {
    public final /* synthetic */ yu0 K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, yu0 yu0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, p2Var, yu0Var2, false, f6Var);
        this.K0 = yu0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        yu0 yu0Var = this.K0;
        yu0Var.M0.i(yu0Var.N0, i10 == 0, true);
    }
}
