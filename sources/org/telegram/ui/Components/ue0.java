package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ue0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ bf0 w1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(bf0 bf0Var, Activity activity) {
        super(activity, null);
        this.w1 = bf0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.w1).containerView;
        viewGroup.invalidate();
    }
}
