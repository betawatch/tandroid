package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dj extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new dj());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ej ejVar = (ej) view;
        CharSequence charSequence = u61Var.l;
        CharSequence charSequence2 = u61Var.m;
        ejVar.b.setText(charSequence);
        ejVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new ej(context, u6Var);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean isClickable() {
        return false;
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean isShadow() {
        return true;
    }
}
