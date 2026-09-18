package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class re0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ye0 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re0(ye0 ye0Var, Activity activity) {
        super(activity, null);
        this.u1 = ye0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.u1).containerView;
        viewGroup.invalidate();
    }
}
