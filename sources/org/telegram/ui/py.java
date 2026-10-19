package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class py extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(context, null);
        this.fragmentView = kw0Var;
        return kw0Var;
    }
}
