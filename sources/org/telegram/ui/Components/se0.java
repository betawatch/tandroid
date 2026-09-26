package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class se0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ze0 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se0(ze0 ze0Var, Activity activity) {
        super(activity, null);
        this.t1 = ze0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.t1).containerView;
        viewGroup.invalidate();
    }
}
