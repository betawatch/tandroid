package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fj extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new fj());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        gj gjVar = (gj) view;
        CharSequence charSequence = h51Var.l;
        CharSequence charSequence2 = h51Var.m;
        gjVar.b.setText(charSequence);
        gjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new gj(context, d6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isShadow() {
        return true;
    }
}
