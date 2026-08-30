package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class cz extends org.telegram.ui.ActionBar.p2 {
    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        org.telegram.ui.Components.qv0 qv0Var = new org.telegram.ui.Components.qv0(context, null);
        this.fragmentView = qv0Var;
        return qv0Var;
    }
}
