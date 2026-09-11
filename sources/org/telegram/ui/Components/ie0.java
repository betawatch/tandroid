package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ie0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ pe0 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie0(pe0 pe0Var, Activity activity) {
        super(activity, null);
        this.t1 = pe0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.t1).containerView;
        viewGroup.invalidate();
    }
}
