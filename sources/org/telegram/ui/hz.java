package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.ov0 ov0Var = new org.telegram.ui.Components.ov0(context, null);
        this.fragmentView = ov0Var;
        return ov0Var;
    }
}
