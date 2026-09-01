package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b41 extends i51 {
    static {
        i51.setup(new b41());
    }

    public static j51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z4, View.OnClickListener onClickListener2, o oVar) {
        j51 J = j51.J(b41.class);
        J.d = i10;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.D = onClickListener;
        J.e = z4;
        J.E = onClickListener2;
        J.G = oVar;
        return J;
    }

    public static j51 b(int i10, String str, String str2, String str3, y31 y31Var) {
        return a(i10, str, str2, str3, y31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        c41 c41Var = (c41) view;
        CharSequence charSequence = j51Var.l;
        CharSequence charSequence2 = j51Var.m;
        CharSequence charSequence3 = j51Var.n;
        View.OnClickListener onClickListener = j51Var.D;
        boolean z10 = j51Var.e;
        View.OnClickListener onClickListener2 = j51Var.E;
        Object obj = j51Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = c41Var.r;
        LinearLayout linearLayout2 = c41Var.h;
        LinearLayout linearLayout3 = c41Var.b;
        c41Var.c.setText(charSequence);
        c41Var.d.setText(charSequence2);
        c41Var.e.setText(charSequence3);
        c41Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        c41Var.n.a(z10, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new sx0(4, c41Var, onClickListener3));
        c41Var.e();
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        return TextUtils.equals(j51Var.l, j51Var2.l) && TextUtils.equals(j51Var.m, j51Var2.m) && TextUtils.equals(j51Var.n, j51Var2.n) && j51Var.E == j51Var2.E;
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new c41(context, g6Var);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        return j51Var.d == j51Var2.d;
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean isClickable() {
        return false;
    }
}
