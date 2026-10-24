package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class h30 extends s4.k {
    public final /* synthetic */ u50 F;

    public h30(u50 u50Var) {
        this.F = u50Var;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        u50 u50Var = this.F;
        u50Var.Q.invalidate();
        u50Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.invalidate();
        u50.J0(u50Var);
    }
}
