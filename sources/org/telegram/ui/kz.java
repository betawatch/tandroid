package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class kz extends org.telegram.ui.Components.v51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new kz());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        lz lzVar = (lz) view;
        lzVar.b.setOnClickListener((View.OnClickListener) w51Var.G);
        lzVar.e.setOnClickListener((View.OnClickListener) w51Var.H);
        lzVar.a(w51Var.e, false);
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new lz(context, f6Var);
    }
}
