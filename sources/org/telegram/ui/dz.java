package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public abstract class dz extends org.telegram.ui.ActionBar.m2 {
    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        org.telegram.ui.Components.cw0 cw0Var = new org.telegram.ui.Components.cw0(context, null);
        this.fragmentView = cw0Var;
        return cw0Var;
    }
}
