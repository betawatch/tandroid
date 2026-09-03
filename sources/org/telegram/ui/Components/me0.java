package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class me0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ te0 q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me0(te0 te0Var, Activity activity) {
        super(activity, null);
        this.q1 = te0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        super.setAlpha(f10);
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.q1).containerView;
        viewGroup.invalidate();
    }
}
