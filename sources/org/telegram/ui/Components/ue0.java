package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ue0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ bf0 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(bf0 bf0Var, Activity activity) {
        super(activity, null);
        this.t1 = bf0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.t1).containerView;
        viewGroup.invalidate();
    }
}
