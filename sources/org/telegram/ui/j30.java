package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class j30 extends s4.j {
    public final /* synthetic */ g60 F;

    public j30(g60 g60Var) {
        this.F = g60Var;
    }

    @Override // s4.j
    public final void P(s4.d1 d1Var) {
        ViewGroup viewGroup;
        g60 g60Var = this.F;
        g60Var.Q.invalidate();
        g60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.invalidate();
        g60.K0(g60Var);
    }
}
