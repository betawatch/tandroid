package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ej extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new ej());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        fj fjVar = (fj) view;
        CharSequence charSequence = x51Var.l;
        CharSequence charSequence2 = x51Var.m;
        fjVar.b.setText(charSequence);
        fjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new fj(context, e6Var);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean isShadow() {
        return true;
    }
}
