package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.ov0 ov0Var = new org.telegram.ui.Components.ov0(context, null);
        this.fragmentView = ov0Var;
        return ov0Var;
    }
}
