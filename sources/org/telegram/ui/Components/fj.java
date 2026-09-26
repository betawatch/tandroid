package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class fj extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new fj());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        gj gjVar = (gj) view;
        CharSequence charSequence = v51Var.l;
        CharSequence charSequence2 = v51Var.m;
        gjVar.b.setText(charSequence);
        gjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new gj(context, d6Var);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isShadow() {
        return true;
    }
}
