package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jf0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ qf0 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(qf0 qf0Var, Activity activity) {
        super(activity, null);
        this.u1 = qf0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.u1).containerView;
        viewGroup.invalidate();
    }
}
