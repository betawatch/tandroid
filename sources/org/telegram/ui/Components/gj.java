package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class gj extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new gj());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        hj hjVar = (hj) view;
        CharSequence charSequence = x51Var.l;
        CharSequence charSequence2 = x51Var.m;
        hjVar.b.setText(charSequence);
        hjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hj(context, d6Var);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean isShadow() {
        return true;
    }
}
