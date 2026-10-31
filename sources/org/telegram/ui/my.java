package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class my extends org.telegram.ui.ActionBar.k2 {
    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        org.telegram.ui.Components.uu0 uu0Var = new org.telegram.ui.Components.uu0(context, null);
        this.fragmentView = uu0Var;
        return uu0Var;
    }
}
