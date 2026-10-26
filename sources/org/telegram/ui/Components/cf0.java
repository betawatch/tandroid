package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cf0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ jf0 x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(jf0 jf0Var, Activity activity) {
        super(activity, null);
        this.x1 = jf0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.x1).containerView;
        viewGroup.invalidate();
    }
}
