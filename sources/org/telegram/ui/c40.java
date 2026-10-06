package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class c40 extends org.telegram.ui.Components.bi0 {
    public final /* synthetic */ h60 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(h60 h60Var, LaunchActivity launchActivity, e50 e50Var, o50 o50Var, b40 b40Var) {
        super(launchActivity, e50Var, o50Var, b40Var);
        this.s1 = h60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
