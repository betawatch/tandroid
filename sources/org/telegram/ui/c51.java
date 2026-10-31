package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c51 extends org.telegram.ui.Components.z41 {
    static {
        org.telegram.ui.Components.z41.h(new c51());
    }

    public static org.telegram.ui.Components.a51 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(c51.class);
        K.l = str;
        K.m = charSequence;
        K.n = str2;
        K.D = onClickListener;
        K.o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        d51 d51Var = (d51) view;
        CharSequence charSequence = a51Var.l;
        CharSequence charSequence2 = a51Var.m;
        CharSequence charSequence3 = a51Var.n;
        View.OnClickListener onClickListener = a51Var.D;
        CharSequence charSequence4 = a51Var.o;
        View.OnClickListener onClickListener2 = a51Var.E;
        vh.d dVar = d51Var.e;
        org.telegram.ui.Components.p80 p80Var = d51Var.b;
        p80Var.setText(org.telegram.messenger.k6.m(charSequence, p80Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.p80 p80Var2 = d51Var.c;
        p80Var2.setText(org.telegram.messenger.k6.m(charSequence2, p80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        vh.d dVar2 = d51Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new d51(context, p6Var);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean f() {
        return false;
    }
}
