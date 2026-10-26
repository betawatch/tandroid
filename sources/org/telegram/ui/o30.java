package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o30 extends org.telegram.ui.Components.ni0 {
    public final /* synthetic */ v50 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30(v50 v50Var, LaunchActivity launchActivity, r40 r40Var, b50 b50Var, n30 n30Var) {
        super(launchActivity, r40Var, b50Var, n30Var);
        this.s1 = v50Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
