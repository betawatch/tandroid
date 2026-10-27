package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class df0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ kf0 x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(kf0 kf0Var, Activity activity) {
        super(activity, null);
        this.x1 = kf0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.x1).containerView;
        viewGroup.invalidate();
    }
}
