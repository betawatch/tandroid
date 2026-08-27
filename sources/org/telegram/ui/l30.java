package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l30 extends org.telegram.ui.Components.ch0 {
    public final /* synthetic */ s50 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(s50 s50Var, LaunchActivity launchActivity, o40 o40Var, y40 y40Var, k30 k30Var) {
        super(launchActivity, o40Var, y40Var, k30Var);
        this.o1 = s50Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.o1).containerView;
        viewGroup.invalidate();
    }
}
