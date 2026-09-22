package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kz extends org.telegram.ui.Components.h51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new kz());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        lz lzVar = (lz) view;
        lzVar.b.setOnClickListener((View.OnClickListener) i51Var.G);
        lzVar.e.setOnClickListener((View.OnClickListener) i51Var.H);
        lzVar.a(i51Var.e, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new lz(context, e6Var);
    }
}
