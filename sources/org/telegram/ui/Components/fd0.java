package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class fd0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ld0 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(ld0 ld0Var, Activity activity) {
        super(activity, null);
        this.G1 = ld0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.b.invalidate();
    }
}
