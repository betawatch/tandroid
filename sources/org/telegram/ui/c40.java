package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class c40 extends org.telegram.ui.Components.zh0 {
    public final /* synthetic */ i60 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(i60 i60Var, LaunchActivity launchActivity, e50 e50Var, o50 o50Var, b40 b40Var) {
        super(launchActivity, e50Var, o50Var, b40Var);
        this.s1 = i60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
