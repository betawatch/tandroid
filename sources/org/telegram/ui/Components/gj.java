package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
