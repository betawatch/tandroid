package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.mw0 mw0Var = new org.telegram.ui.Components.mw0(context, null);
        this.fragmentView = mw0Var;
        return mw0Var;
    }
}
