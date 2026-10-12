package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class oz extends org.telegram.ui.Components.k61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new oz());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        pz pzVar = (pz) view;
        pzVar.b.setOnClickListener((View.OnClickListener) l61Var.G);
        pzVar.e.setOnClickListener((View.OnClickListener) l61Var.H);
        pzVar.a(l61Var.e, false);
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new pz(context, c6Var);
    }
}
