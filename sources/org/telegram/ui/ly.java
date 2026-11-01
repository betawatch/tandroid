package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class ly extends org.telegram.ui.ActionBar.k2 {
    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        org.telegram.ui.Components.vu0 vu0Var = new org.telegram.ui.Components.vu0(context, null);
        this.fragmentView = vu0Var;
        return vu0Var;
    }
}
