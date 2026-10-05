package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ue0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ bf0 v1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(bf0 bf0Var, Activity activity) {
        super(activity, null);
        this.v1 = bf0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.v1).containerView;
        viewGroup.invalidate();
    }
}
