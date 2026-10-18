package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class g30 extends s4.k {
    public final /* synthetic */ s50 F;

    public g30(s50 s50Var) {
        this.F = s50Var;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        s50 s50Var = this.F;
        s50Var.Q.invalidate();
        s50Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.invalidate();
        s50.K0(s50Var);
    }
}
