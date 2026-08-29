package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class de0 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ ke0 p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de0(ke0 ke0Var, Activity activity) {
        super(activity, null);
        this.p1 = ke0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f9) {
        ViewGroup viewGroup;
        super.setAlpha(f9);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.p1).containerView;
        viewGroup.invalidate();
    }
}
