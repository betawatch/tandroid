package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class hj extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new hj());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ij ijVar = (ij) view;
        CharSequence charSequence = g61Var.l;
        CharSequence charSequence2 = g61Var.m;
        ijVar.b.setText(charSequence);
        ijVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ij(context, d6Var);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean isShadow() {
        return true;
    }
}
