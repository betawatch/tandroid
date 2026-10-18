package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class bf0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ if0 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(if0 if0Var, Activity activity) {
        super(activity, null);
        this.u1 = if0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.u1).containerView;
        viewGroup.invalidate();
    }
}
