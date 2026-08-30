package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class le0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ se0 q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le0(se0 se0Var, Activity activity) {
        super(activity, null);
        this.q1 = se0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        super.setAlpha(f10);
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.q1).containerView;
        viewGroup.invalidate();
    }
}
