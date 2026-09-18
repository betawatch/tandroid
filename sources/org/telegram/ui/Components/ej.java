package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ej extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new ej());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        fj fjVar = (fj) view;
        CharSequence charSequence = j51Var.l;
        CharSequence charSequence2 = j51Var.m;
        fjVar.b.setText(charSequence);
        fjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new fj(context, f6Var);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean isShadow() {
        return true;
    }
}
