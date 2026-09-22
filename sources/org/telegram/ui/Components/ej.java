package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ej extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new ej());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        fj fjVar = (fj) view;
        CharSequence charSequence = y51Var.l;
        CharSequence charSequence2 = y51Var.m;
        fjVar.b.setText(charSequence);
        fjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new fj(context, f6Var);
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean isShadow() {
        return true;
    }
}
