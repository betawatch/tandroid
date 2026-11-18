package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class ox extends org.telegram.ui.ActionBar.h2 {
    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        org.telegram.ui.Components.au0 au0Var = new org.telegram.ui.Components.au0(context, null);
        this.fragmentView = au0Var;
        return au0Var;
    }
}
