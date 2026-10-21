package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class cf0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ jf0 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(jf0 jf0Var, Activity activity) {
        super(activity, null);
        this.u1 = jf0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.u1).containerView;
        viewGroup.invalidate();
    }
}
