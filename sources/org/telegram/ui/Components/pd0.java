package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pd0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ wd0 p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd0(wd0 wd0Var, Activity activity) {
        super(activity, null);
        this.p1 = wd0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        super.setAlpha(f10);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.p1).containerView;
        viewGroup.invalidate();
    }
}
