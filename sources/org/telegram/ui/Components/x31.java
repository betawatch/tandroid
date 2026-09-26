package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class x31 extends s4.j {
    public final /* synthetic */ i41 F;

    public x31(i41 i41Var) {
        this.F = i41Var;
    }

    @Override // s4.j
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }
}
