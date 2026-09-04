package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class z31 extends g51 {
    static {
        g51.setup(new z31());
    }

    public static h51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, o oVar) {
        h51 J = h51.J(z31.class);
        J.d = i10;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = oVar;
        return J;
    }

    public static h51 b(int i10, String str, String str2, String str3, w31 w31Var) {
        return a(i10, str, str2, str3, w31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        a41 a41Var = (a41) view;
        CharSequence charSequence = h51Var.l;
        CharSequence charSequence2 = h51Var.m;
        CharSequence charSequence3 = h51Var.n;
        View.OnClickListener onClickListener = h51Var.D;
        boolean z11 = h51Var.e;
        View.OnClickListener onClickListener2 = h51Var.E;
        Object obj = h51Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = a41Var.r;
        LinearLayout linearLayout2 = a41Var.h;
        LinearLayout linearLayout3 = a41Var.b;
        a41Var.c.setText(charSequence);
        a41Var.d.setText(charSequence2);
        a41Var.e.setText(charSequence3);
        a41Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        a41Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new ct(19, a41Var, onClickListener3));
        a41Var.d();
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return TextUtils.equals(h51Var.l, h51Var2.l) && TextUtils.equals(h51Var.m, h51Var2.m) && TextUtils.equals(h51Var.n, h51Var2.n) && h51Var.E == h51Var2.E;
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new a41(context, f6Var);
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
