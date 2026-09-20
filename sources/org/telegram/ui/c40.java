package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class c40 extends org.telegram.ui.Components.yh0 {
    public final /* synthetic */ i60 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(i60 i60Var, LaunchActivity launchActivity, e50 e50Var, o50 o50Var, b40 b40Var) {
        super(launchActivity, e50Var, o50Var, b40Var);
        this.s1 = i60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
