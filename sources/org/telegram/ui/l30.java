package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l30 extends org.telegram.ui.Components.kh0 {
    public final /* synthetic */ r50 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(r50 r50Var, LaunchActivity launchActivity, n40 n40Var, x40 x40Var, k30 k30Var) {
        super(launchActivity, n40Var, x40Var, k30Var);
        this.o1 = r50Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.o1).containerView;
        viewGroup.invalidate();
    }
}
