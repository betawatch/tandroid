package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class aj extends k41 {
    static {
        k41.h(new aj());
    }

    public static l41 i(CharSequence charSequence, String str) {
        l41 K = l41.K(aj.class);
        K.m = str;
        K.n = charSequence;
        return K;
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        bj bjVar = (bj) view;
        CharSequence charSequence = l41Var.m;
        CharSequence charSequence2 = l41Var.n;
        bjVar.b.setText(charSequence);
        bjVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new bj(context, i6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
