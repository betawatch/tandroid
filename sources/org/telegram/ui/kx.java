package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class kx extends org.telegram.ui.ActionBar.e2 {
    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        org.telegram.ui.Components.st0 st0Var = new org.telegram.ui.Components.st0(context, null);
        this.fragmentView = st0Var;
        return st0Var;
    }
}
