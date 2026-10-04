package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class l30 extends s4.j {
    public final /* synthetic */ h60 F;

    public l30(h60 h60Var) {
        this.F = h60Var;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        h60 h60Var = this.F;
        h60Var.Q.invalidate();
        h60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.invalidate();
        h60.J0(h60Var);
    }
}
