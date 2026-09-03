package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vi extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new vi());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        wi wiVar = (wi) view;
        CharSequence charSequence = h51Var.l;
        CharSequence charSequence2 = h51Var.m;
        wiVar.b.setText(charSequence);
        wiVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new wi(context, g6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isShadow() {
        return true;
    }
}
