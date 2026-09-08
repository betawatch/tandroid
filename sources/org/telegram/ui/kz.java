package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kz extends org.telegram.ui.Components.g51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new kz());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        lz lzVar = (lz) view;
        lzVar.b.setOnClickListener((View.OnClickListener) h51Var.G);
        lzVar.e.setOnClickListener((View.OnClickListener) h51Var.H);
        lzVar.a(h51Var.e, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new lz(context, f6Var);
    }
}
