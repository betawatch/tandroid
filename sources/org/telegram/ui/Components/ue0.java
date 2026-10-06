package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
