package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class kz extends org.telegram.ui.Components.x51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.x51.setup(new kz());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        lz lzVar = (lz) view;
        lzVar.b.setOnClickListener((View.OnClickListener) y51Var.G);
        lzVar.e.setOnClickListener((View.OnClickListener) y51Var.H);
        lzVar.a(y51Var.e, false);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new lz(context, f6Var);
    }
}
