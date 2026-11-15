package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vc0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ bd0 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc0(bd0 bd0Var, Activity activity) {
        super(activity, null);
        this.G1 = bd0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.b.invalidate();
    }
}
