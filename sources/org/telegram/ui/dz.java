package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public abstract class dz extends org.telegram.ui.ActionBar.m2 {
    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        org.telegram.ui.Components.aw0 aw0Var = new org.telegram.ui.Components.aw0(context, null);
        this.fragmentView = aw0Var;
        return aw0Var;
    }
}
