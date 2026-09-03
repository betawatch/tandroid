package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class ez extends org.telegram.ui.ActionBar.p2 {
    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        org.telegram.ui.Components.qv0 qv0Var = new org.telegram.ui.Components.qv0(context, null);
        this.fragmentView = qv0Var;
        return qv0Var;
    }
}
