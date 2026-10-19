package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class j30 extends org.telegram.ui.Components.ki0 {
    public final /* synthetic */ q50 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(q50 q50Var, LaunchActivity launchActivity, m40 m40Var, w40 w40Var, i30 i30Var) {
        super(launchActivity, m40Var, w40Var, i30Var);
        this.s1 = q50Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
