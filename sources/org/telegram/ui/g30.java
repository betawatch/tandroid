package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g30 extends f2.l {
    public final /* synthetic */ s50 F;

    public g30(s50 s50Var) {
        this.F = s50Var;
    }

    @Override // f2.l
    public final void P(f2.o1 o1Var) {
        ViewGroup viewGroup;
        s50 s50Var = this.F;
        s50Var.M.invalidate();
        s50Var.W1.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) s50Var).containerView;
        viewGroup.invalidate();
        s50.J0(s50Var);
    }
}
