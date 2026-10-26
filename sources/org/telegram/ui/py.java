package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class py extends org.telegram.ui.ActionBar.r2 {
    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        org.telegram.ui.Components.vw0 vw0Var = new org.telegram.ui.Components.vw0(context, null);
        this.fragmentView = vw0Var;
        return vw0Var;
    }
}
