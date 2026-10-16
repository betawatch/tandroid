package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class if0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ pf0 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if0(pf0 pf0Var, Activity activity) {
        super(activity, null);
        this.u1 = pf0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.u1).containerView;
        viewGroup.invalidate();
    }
}
