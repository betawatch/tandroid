package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bj extends m41 {
    static {
        m41.h(new bj());
    }

    public static n41 i(CharSequence charSequence, String str) {
        n41 K = n41.K(bj.class);
        K.m = str;
        K.n = charSequence;
        return K;
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        cj cjVar = (cj) view;
        CharSequence charSequence = n41Var.m;
        CharSequence charSequence2 = n41Var.n;
        cjVar.b.setText(charSequence);
        cjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new cj(context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return false;
    }
}
