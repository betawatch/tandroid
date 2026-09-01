package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vi extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new vi());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        wi wiVar = (wi) view;
        CharSequence charSequence = j51Var.l;
        CharSequence charSequence2 = j51Var.m;
        wiVar.b.setText(charSequence);
        wiVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new wi(context, g6Var);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean isShadow() {
        return true;
    }
}
