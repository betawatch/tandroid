package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dj extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new dj());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        ej ejVar = (ej) view;
        CharSequence charSequence = m61Var.l;
        CharSequence charSequence2 = m61Var.m;
        ejVar.b.setText(charSequence);
        ejVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new ej(context, g6Var);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isShadow() {
        return true;
    }
}
