package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i30 extends org.telegram.ui.Components.ah0 {
    public final /* synthetic */ o50 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(o50 o50Var, LaunchActivity launchActivity, k40 k40Var, u40 u40Var, h30 h30Var) {
        super(launchActivity, k40Var, u40Var, h30Var);
        this.o1 = o50Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.o1).containerView;
        viewGroup.invalidate();
    }
}
