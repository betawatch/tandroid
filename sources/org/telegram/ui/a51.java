package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a51 extends org.telegram.ui.Components.a51 {
    static {
        org.telegram.ui.Components.a51.h(new a51());
    }

    public static org.telegram.ui.Components.b51 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.b51 K = org.telegram.ui.Components.b51.K(a51.class);
        K.l = str;
        K.m = charSequence;
        K.n = str2;
        K.D = onClickListener;
        K.o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        b51 b51Var2 = (b51) view;
        CharSequence charSequence = b51Var.l;
        CharSequence charSequence2 = b51Var.m;
        CharSequence charSequence3 = b51Var.n;
        View.OnClickListener onClickListener = b51Var.D;
        CharSequence charSequence4 = b51Var.o;
        View.OnClickListener onClickListener2 = b51Var.E;
        vh.d dVar = b51Var2.e;
        org.telegram.ui.Components.p80 p80Var = b51Var2.b;
        p80Var.setText(org.telegram.messenger.k6.m(charSequence, p80Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.p80 p80Var2 = b51Var2.c;
        p80Var2.setText(org.telegram.messenger.k6.m(charSequence2, p80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        vh.d dVar2 = b51Var2.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new b51(context, p6Var);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean f() {
        return false;
    }
}
