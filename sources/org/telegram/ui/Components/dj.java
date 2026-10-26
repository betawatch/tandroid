package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dj extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new dj());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ej ejVar = (ej) view;
        CharSequence charSequence = t61Var.l;
        CharSequence charSequence2 = t61Var.m;
        ejVar.b.setText(charSequence);
        ejVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new ej(context, u6Var);
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean isClickable() {
        return false;
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean isShadow() {
        return true;
    }
}
