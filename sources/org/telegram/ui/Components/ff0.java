package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ff0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ mf0 v1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff0(mf0 mf0Var, Activity activity) {
        super(activity, null);
        this.v1 = mf0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.v1).containerView;
        viewGroup.invalidate();
    }
}
