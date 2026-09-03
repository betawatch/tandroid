package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class dz extends org.telegram.ui.ActionBar.p2 {
    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        org.telegram.ui.Components.pv0 pv0Var = new org.telegram.ui.Components.pv0(context, null);
        this.fragmentView = pv0Var;
        return pv0Var;
    }
}
