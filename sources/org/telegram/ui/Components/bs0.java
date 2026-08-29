package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bs0 extends FragmentContextView {
    public final /* synthetic */ qu0 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs0(qu0 qu0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, qu0 qu0Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, o2Var, qu0Var2, false, c6Var);
        this.J0 = qu0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        qu0 qu0Var = this.J0;
        qu0Var.L0.i(qu0Var.M0, i10 == 0, true);
    }
}
