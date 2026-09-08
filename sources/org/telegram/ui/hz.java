package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.ov0 ov0Var = new org.telegram.ui.Components.ov0(context, null);
        this.fragmentView = ov0Var;
        return ov0Var;
    }
}
