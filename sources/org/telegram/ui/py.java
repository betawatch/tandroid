package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public abstract class py extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.lw0 lw0Var = new org.telegram.ui.Components.lw0(context, null);
        this.fragmentView = lw0Var;
        return lw0Var;
    }
}
