package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class gz extends org.telegram.ui.Components.w51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.w51.setup(new gz());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        hz hzVar = (hz) view;
        hzVar.b.setOnClickListener((View.OnClickListener) x51Var.G);
        hzVar.e.setOnClickListener((View.OnClickListener) x51Var.H);
        hzVar.a(x51Var.e, false);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hz(context, d6Var);
    }
}
