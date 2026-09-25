package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class gz extends org.telegram.ui.Components.u51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new gz());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        hz hzVar = (hz) view;
        hzVar.b.setOnClickListener((View.OnClickListener) v51Var.G);
        hzVar.e.setOnClickListener((View.OnClickListener) v51Var.H);
        hzVar.a(v51Var.e, false);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, org.telegram.ui.Components.wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hz(context, d6Var);
    }
}
