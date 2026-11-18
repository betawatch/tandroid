package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class ox extends org.telegram.ui.ActionBar.h2 {
    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        org.telegram.ui.Components.au0 au0Var = new org.telegram.ui.Components.au0(context, null);
        this.fragmentView = au0Var;
        return au0Var;
    }
}
