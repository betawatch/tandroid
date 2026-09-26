package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class g30 extends s4.j {
    public final /* synthetic */ d60 F;

    public g30(d60 d60Var) {
        this.F = d60Var;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        d60 d60Var = this.F;
        d60Var.Q.invalidate();
        d60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.invalidate();
        d60.J0(d60Var);
    }
}
