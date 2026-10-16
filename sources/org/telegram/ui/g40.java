package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class g40 extends org.telegram.ui.Components.pi0 {
    public final /* synthetic */ n60 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(n60 n60Var, LaunchActivity launchActivity, j50 j50Var, t50 t50Var, f40 f40Var) {
        super(launchActivity, j50Var, t50Var, f40Var);
        this.s1 = n60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
