package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hj extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new hj());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ij ijVar = (ij) view;
        CharSequence charSequence = v51Var.l;
        CharSequence charSequence2 = v51Var.m;
        ijVar.b.setText(charSequence);
        ijVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ij(context, f6Var);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isShadow() {
        return true;
    }
}
