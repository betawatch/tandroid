package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l30 extends s4.l {
    public final /* synthetic */ x50 F;

    public l30(x50 x50Var) {
        this.F = x50Var;
    }

    @Override // s4.l
    public final void P(s4.e1 e1Var) {
        ViewGroup viewGroup;
        x50 x50Var = this.F;
        x50Var.Q.invalidate();
        x50Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.invalidate();
        x50.J0(x50Var);
    }
}
