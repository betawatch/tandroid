package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class dz extends org.telegram.ui.ActionBar.m2 {
    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        org.telegram.ui.Components.aw0 aw0Var = new org.telegram.ui.Components.aw0(context, null);
        this.fragmentView = aw0Var;
        return aw0Var;
    }
}
