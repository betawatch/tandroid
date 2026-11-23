package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class ox extends org.telegram.ui.ActionBar.g2 {
    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        org.telegram.ui.Components.du0 du0Var = new org.telegram.ui.Components.du0(context, null);
        this.fragmentView = du0Var;
        return du0Var;
    }
}
