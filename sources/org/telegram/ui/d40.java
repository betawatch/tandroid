package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d40 extends org.telegram.ui.Components.yh0 {
    public final /* synthetic */ j60 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(j60 j60Var, LaunchActivity launchActivity, f50 f50Var, p50 p50Var, c40 c40Var) {
        super(launchActivity, f50Var, p50Var, c40Var);
        this.s1 = j60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
