package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class mx extends org.telegram.ui.ActionBar.f2 {
    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        org.telegram.ui.Components.st0 st0Var = new org.telegram.ui.Components.st0(context, null);
        this.fragmentView = st0Var;
        return st0Var;
    }
}
