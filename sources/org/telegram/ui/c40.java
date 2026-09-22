package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c40 extends org.telegram.ui.Components.oh0 {
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
