package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class nx extends org.telegram.ui.ActionBar.g2 {
    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        org.telegram.ui.Components.cu0 cu0Var = new org.telegram.ui.Components.cu0(context, null);
        this.fragmentView = cu0Var;
        return cu0Var;
    }
}
