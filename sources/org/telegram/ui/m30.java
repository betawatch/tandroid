package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class m30 extends org.telegram.ui.Components.oi0 {
    public final /* synthetic */ u50 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(u50 u50Var, LaunchActivity launchActivity, p40 p40Var, z40 z40Var, l30 l30Var) {
        super(launchActivity, p40Var, z40Var, l30Var);
        this.s1 = u50Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
