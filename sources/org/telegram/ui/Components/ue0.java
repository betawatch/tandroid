package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
