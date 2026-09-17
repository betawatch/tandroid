package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class js0 extends FragmentContextView {
    public final /* synthetic */ xu0 N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(xu0 xu0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, xu0 xu0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n2Var, xu0Var2, false, f6Var);
        this.N0 = xu0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        xu0 xu0Var = this.N0;
        xu0Var.P0.i(xu0Var.Q0, i10 == 0, true);
    }
}
