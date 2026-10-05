package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class kz extends org.telegram.ui.Components.g61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new kz());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        lz lzVar = (lz) view;
        lzVar.b.setOnClickListener((View.OnClickListener) h61Var.G);
        lzVar.e.setOnClickListener((View.OnClickListener) h61Var.H);
        lzVar.a(h61Var.e, false);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new lz(context, d6Var);
    }
}
