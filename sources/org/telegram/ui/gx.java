package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class gx extends org.telegram.ui.ActionBar.d2 {
    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        org.telegram.ui.Components.qt0 qt0Var = new org.telegram.ui.Components.qt0(context, null);
        this.fragmentView = qt0Var;
        return qt0Var;
    }
}
