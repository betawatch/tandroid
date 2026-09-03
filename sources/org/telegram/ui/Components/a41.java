package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a41 extends g51 {
    static {
        g51.setup(new a41());
    }

    public static h51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z4, View.OnClickListener onClickListener2, o oVar) {
        h51 J = h51.J(a41.class);
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

    public static h51 b(int i10, String str, String str2, String str3, x31 x31Var) {
        return a(i10, str, str2, str3, x31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        b41 b41Var = (b41) view;
        CharSequence charSequence = h51Var.l;
        CharSequence charSequence2 = h51Var.m;
        CharSequence charSequence3 = h51Var.n;
        View.OnClickListener onClickListener = h51Var.D;
        boolean z10 = h51Var.e;
        View.OnClickListener onClickListener2 = h51Var.E;
        Object obj = h51Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = b41Var.r;
        LinearLayout linearLayout2 = b41Var.h;
        LinearLayout linearLayout3 = b41Var.b;
        b41Var.c.setText(charSequence);
        b41Var.d.setText(charSequence2);
        b41Var.e.setText(charSequence3);
        b41Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        b41Var.n.a(z10, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new rx0(4, b41Var, onClickListener3));
        b41Var.e();
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return TextUtils.equals(h51Var.l, h51Var2.l) && TextUtils.equals(h51Var.m, h51Var2.m) && TextUtils.equals(h51Var.n, h51Var2.n) && h51Var.E == h51Var2.E;
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new b41(context, g6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.d == h51Var2.d;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
