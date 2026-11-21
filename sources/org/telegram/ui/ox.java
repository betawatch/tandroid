package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class ox extends org.telegram.ui.ActionBar.g2 {
    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        org.telegram.ui.Components.du0 du0Var = new org.telegram.ui.Components.du0(context, null);
        this.fragmentView = du0Var;
        return du0Var;
    }
}
