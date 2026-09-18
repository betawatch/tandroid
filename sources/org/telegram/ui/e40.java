package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e40 extends org.telegram.ui.Components.ph0 {
    public final /* synthetic */ k60 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e40(k60 k60Var, LaunchActivity launchActivity, g50 g50Var, q50 q50Var, d40 d40Var) {
        super(launchActivity, g50Var, q50Var, d40Var);
        this.s1 = k60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
