package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a40 extends org.telegram.ui.Components.ti0 {
    public final /* synthetic */ g60 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(g60 g60Var, LaunchActivity launchActivity, c50 c50Var, m50 m50Var, z30 z30Var) {
        super(launchActivity, c50Var, m50Var, z30Var);
        this.s1 = g60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
