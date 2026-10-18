package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class dj extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new dj());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        ej ejVar = (ej) view;
        CharSequence charSequence = f61Var.l;
        CharSequence charSequence2 = f61Var.m;
        ejVar.b.setText(charSequence);
        ejVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ej(context, d6Var);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean isShadow() {
        return true;
    }
}
