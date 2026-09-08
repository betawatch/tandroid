package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ej extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new ej());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        fj fjVar = (fj) view;
        CharSequence charSequence = h51Var.l;
        CharSequence charSequence2 = h51Var.m;
        fjVar.b.setText(charSequence);
        fjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new fj(context, f6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isShadow() {
        return true;
    }
}
