package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g30 extends f2.l {
    public final /* synthetic */ c60 F;

    public g30(c60 c60Var) {
        this.F = c60Var;
    }

    @Override // f2.l
    public final void P(f2.l1 l1Var) {
        ViewGroup viewGroup;
        c60 c60Var = this.F;
        c60Var.N.invalidate();
        c60Var.X1.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.invalidate();
        c60.J0(c60Var);
    }
}
