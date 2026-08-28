package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ti extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new ti());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ui uiVar = (ui) view;
        CharSequence charSequence = l41Var.l;
        CharSequence charSequence2 = l41Var.m;
        uiVar.b.setText(charSequence);
        uiVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new ui(context, b6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean isShadow() {
        return true;
    }
}
