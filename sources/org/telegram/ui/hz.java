package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.cw0 cw0Var = new org.telegram.ui.Components.cw0(context, null);
        this.fragmentView = cw0Var;
        return cw0Var;
    }
}
