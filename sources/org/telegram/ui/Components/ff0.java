package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
