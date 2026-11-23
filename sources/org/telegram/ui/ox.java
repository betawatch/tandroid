package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class ox extends org.telegram.ui.ActionBar.g2 {
    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        org.telegram.ui.Components.du0 du0Var = new org.telegram.ui.Components.du0(context, null);
        this.fragmentView = du0Var;
        return du0Var;
    }
}
