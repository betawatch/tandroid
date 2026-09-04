package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
