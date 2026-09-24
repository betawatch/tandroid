package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class se0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ze0 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se0(ze0 ze0Var, Activity activity) {
        super(activity, null);
        this.t1 = ze0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.t1).containerView;
        viewGroup.invalidate();
    }
}
