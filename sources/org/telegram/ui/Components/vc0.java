package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
