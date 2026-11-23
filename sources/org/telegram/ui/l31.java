package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l31 extends org.telegram.ui.Components.m41 {
    static {
        org.telegram.ui.Components.m41.h(new l31());
    }

    public static org.telegram.ui.Components.n41 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(l31.class);
        K.m = str;
        K.n = charSequence;
        K.o = str2;
        K.E = onClickListener;
        K.p = charSequence2;
        K.F = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        m31 m31Var = (m31) view;
        CharSequence charSequence = n41Var.m;
        CharSequence charSequence2 = n41Var.n;
        CharSequence charSequence3 = n41Var.o;
        View.OnClickListener onClickListener = n41Var.E;
        CharSequence charSequence4 = n41Var.p;
        View.OnClickListener onClickListener2 = n41Var.F;
        hi.e eVar = m31Var.e;
        org.telegram.ui.Components.j80 j80Var = m31Var.b;
        j80Var.setText(org.telegram.messenger.j6.m(charSequence, j80Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.j80 j80Var2 = m31Var.c;
        j80Var2.setText(org.telegram.messenger.j6.m(charSequence2, j80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        hi.e eVar2 = m31Var.d;
        eVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        eVar2.setText(charSequence3);
        eVar2.setOnClickListener(onClickListener);
        eVar.setText(charSequence4);
        eVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new m31(context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return false;
    }
}
