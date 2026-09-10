package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class re0 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ ye0 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re0(ye0 ye0Var, Activity activity) {
        super(activity, null);
        this.t1 = ye0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.t1).containerView;
        viewGroup.invalidate();
    }
}
