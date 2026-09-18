package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.bw0 bw0Var = new org.telegram.ui.Components.bw0(context, null);
        this.fragmentView = bw0Var;
        return bw0Var;
    }
}
