package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class z31 extends s4.j {
    public final /* synthetic */ k41 F;

    public z31(k41 k41Var) {
        this.F = k41Var;
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
