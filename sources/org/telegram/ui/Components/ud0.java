package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ud0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ be0 p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud0(be0 be0Var, Activity activity) {
        super(activity, null);
        this.p1 = be0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        super.setAlpha(f10);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.p1).containerView;
        viewGroup.invalidate();
    }
}
