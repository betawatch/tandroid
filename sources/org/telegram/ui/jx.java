package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class jx extends org.telegram.ui.ActionBar.f2 {
    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        org.telegram.ui.Components.rt0 rt0Var = new org.telegram.ui.Components.rt0(context, null);
        this.fragmentView = rt0Var;
        return rt0Var;
    }
}
