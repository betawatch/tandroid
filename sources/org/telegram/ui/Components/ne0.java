package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ne0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ue0 q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne0(ue0 ue0Var, Activity activity) {
        super(activity, null);
        this.q1 = ue0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        super.setAlpha(f10);
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.q1).containerView;
        viewGroup.invalidate();
    }
}
