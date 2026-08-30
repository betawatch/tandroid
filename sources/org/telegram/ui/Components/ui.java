package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ui extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new ui());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        vi viVar = (vi) view;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        viVar.b.setText(charSequence);
        viVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new vi(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isShadow() {
        return true;
    }
}
