package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class l30 extends org.telegram.ui.Components.ki0 {
    public final /* synthetic */ s50 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(s50 s50Var, LaunchActivity launchActivity, o40 o40Var, y40 y40Var, k30 k30Var) {
        super(launchActivity, o40Var, y40Var, k30Var);
        this.s1 = s50Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
