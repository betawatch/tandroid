package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class hj extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new hj());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        ij ijVar = (ij) view;
        CharSequence charSequence = h61Var.l;
        CharSequence charSequence2 = h61Var.m;
        ijVar.b.setText(charSequence);
        ijVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ij(context, d6Var);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isShadow() {
        return true;
    }
}
