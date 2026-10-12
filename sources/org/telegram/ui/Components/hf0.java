package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hf0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ of0 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(of0 of0Var, Activity activity) {
        super(activity, null);
        this.u1 = of0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.u1).containerView;
        viewGroup.invalidate();
    }
}
