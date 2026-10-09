package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ij extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new ij());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        jj jjVar = (jj) view;
        CharSequence charSequence = p61Var.l;
        CharSequence charSequence2 = p61Var.m;
        jjVar.b.setText(charSequence);
        jjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new jj(context, e6Var);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean isShadow() {
        return true;
    }
}
