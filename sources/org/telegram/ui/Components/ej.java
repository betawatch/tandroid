package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ej extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new ej());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        fj fjVar = (fj) view;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        fjVar.b.setText(charSequence);
        fjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new fj(context, e6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isShadow() {
        return true;
    }
}
