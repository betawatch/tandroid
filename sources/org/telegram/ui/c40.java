package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c40 extends org.telegram.ui.Components.oh0 {
    public final /* synthetic */ j60 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(j60 j60Var, LaunchActivity launchActivity, f50 f50Var, p50 p50Var, b40 b40Var) {
        super(launchActivity, f50Var, p50Var, b40Var);
        this.s1 = j60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
