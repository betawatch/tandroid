package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
