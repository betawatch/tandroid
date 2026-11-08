package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class jx extends org.telegram.ui.ActionBar.f2 {
    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        org.telegram.ui.Components.rt0 rt0Var = new org.telegram.ui.Components.rt0(context, null);
        this.fragmentView = rt0Var;
        return rt0Var;
    }
}
