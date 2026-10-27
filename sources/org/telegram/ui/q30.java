package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q30 extends org.telegram.ui.Components.oi0 {
    public final /* synthetic */ x50 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(x50 x50Var, LaunchActivity launchActivity, t40 t40Var, d50 d50Var, p30 p30Var) {
        super(launchActivity, t40Var, d50Var, p30Var);
        this.s1 = x50Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
