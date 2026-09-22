package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
