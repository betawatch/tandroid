package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class te0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ af0 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te0(af0 af0Var, Activity activity) {
        super(activity, null);
        this.u1 = af0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.u1).containerView;
        viewGroup.invalidate();
    }
}
