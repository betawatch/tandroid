package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
