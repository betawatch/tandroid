package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m31 extends org.telegram.ui.Components.k41 {
    static {
        org.telegram.ui.Components.k41.h(new m31());
    }

    public static org.telegram.ui.Components.l41 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.l41 K = org.telegram.ui.Components.l41.K(m31.class);
        K.m = str;
        K.n = charSequence;
        K.o = str2;
        K.E = onClickListener;
        K.p = charSequence2;
        K.F = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        n31 n31Var = (n31) view;
        CharSequence charSequence = l41Var.m;
        CharSequence charSequence2 = l41Var.n;
        CharSequence charSequence3 = l41Var.o;
        View.OnClickListener onClickListener = l41Var.E;
        CharSequence charSequence4 = l41Var.p;
        View.OnClickListener onClickListener2 = l41Var.F;
        hi.d dVar = n31Var.e;
        org.telegram.ui.Components.k80 k80Var = n31Var.b;
        k80Var.setText(org.telegram.messenger.j6.m(charSequence, k80Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.k80 k80Var2 = n31Var.c;
        k80Var2.setText(org.telegram.messenger.j6.m(charSequence2, k80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        hi.d dVar2 = n31Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new n31(context, i6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
