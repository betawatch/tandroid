package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o extends f2.l {
    public final /* synthetic */ g0 F;

    public o(g0 g0Var) {
        this.F = g0Var;
    }

    @Override // f2.l
    public final void P(f2.n1 n1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
