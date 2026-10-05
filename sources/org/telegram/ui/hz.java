package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.mw0 mw0Var = new org.telegram.ui.Components.mw0(context, null);
        this.fragmentView = mw0Var;
        return mw0Var;
    }
}
