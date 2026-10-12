package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class fj extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new fj());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        gj gjVar = (gj) view;
        CharSequence charSequence = l61Var.l;
        CharSequence charSequence2 = l61Var.m;
        gjVar.b.setText(charSequence);
        gjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new gj(context, c6Var);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean isShadow() {
        return true;
    }
}
