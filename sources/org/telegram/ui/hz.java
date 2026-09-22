package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.pv0 pv0Var = new org.telegram.ui.Components.pv0(context, null);
        this.fragmentView = pv0Var;
        return pv0Var;
    }
}
