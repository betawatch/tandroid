package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i91 extends org.telegram.ui.Components.k61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new i91());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        ((j91) view).set(l61Var.z);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean contentsEquals(org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.l61 l61Var2) {
        return l61Var.z == l61Var2.z;
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new j91(context, c6Var);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean equals(org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.l61 l61Var2) {
        return l61Var.d == l61Var2.d;
    }
}
