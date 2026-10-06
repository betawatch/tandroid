package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.mw0 mw0Var = new org.telegram.ui.Components.mw0(context, null);
        this.fragmentView = mw0Var;
        return mw0Var;
    }
}
