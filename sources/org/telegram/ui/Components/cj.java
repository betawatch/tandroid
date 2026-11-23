package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class cj extends n41 {
    static {
        n41.h(new cj());
    }

    public static o41 i(CharSequence charSequence, String str) {
        o41 K = o41.K(cj.class);
        K.m = str;
        K.n = charSequence;
        return K;
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        dj djVar = (dj) view;
        CharSequence charSequence = o41Var.m;
        CharSequence charSequence2 = o41Var.n;
        djVar.b.setText(charSequence);
        djVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new dj(context, h6Var);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return false;
    }
}
