package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class l30 extends s4.j {
    public final /* synthetic */ i60 F;

    public l30(i60 i60Var) {
        this.F = i60Var;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        i60 i60Var = this.F;
        i60Var.Q.invalidate();
        i60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.invalidate();
        i60.J0(i60Var);
    }
}
