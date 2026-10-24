package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
