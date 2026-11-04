package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a31 extends org.telegram.ui.Components.q31 {
    static {
        org.telegram.ui.Components.q31.h(new a31());
    }

    public static org.telegram.ui.Components.r31 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(a31.class);
        K.l = str;
        K.m = charSequence;
        K.n = str2;
        K.D = onClickListener;
        K.o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        b31 b31Var = (b31) view;
        CharSequence charSequence = r31Var.l;
        CharSequence charSequence2 = r31Var.m;
        CharSequence charSequence3 = r31Var.n;
        View.OnClickListener onClickListener = r31Var.D;
        CharSequence charSequence4 = r31Var.o;
        View.OnClickListener onClickListener2 = r31Var.E;
        gi.d dVar = b31Var.e;
        org.telegram.ui.Components.s70 s70Var = b31Var.b;
        s70Var.setText(org.telegram.messenger.i6.m(charSequence, s70Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.s70 s70Var2 = b31Var.c;
        s70Var2.setText(org.telegram.messenger.i6.m(charSequence2, s70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        gi.d dVar2 = b31Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new b31(context, e6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
