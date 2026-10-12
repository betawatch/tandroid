package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c51 extends k61 {
    static {
        k61.setup(new c51());
    }

    public static l61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        l61 J = l61.J(c51.class);
        J.d = i10;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static l61 b(int i10, String str, String str2, String str3, z41 z41Var) {
        return a(i10, str, str2, str3, z41Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        d51 d51Var = (d51) view;
        CharSequence charSequence = l61Var.l;
        CharSequence charSequence2 = l61Var.m;
        CharSequence charSequence3 = l61Var.n;
        View.OnClickListener onClickListener = l61Var.D;
        boolean z11 = l61Var.e;
        View.OnClickListener onClickListener2 = l61Var.E;
        Object obj = l61Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = d51Var.r;
        LinearLayout linearLayout2 = d51Var.h;
        LinearLayout linearLayout3 = d51Var.b;
        d51Var.c.setText(charSequence);
        d51Var.d.setText(charSequence2);
        d51Var.e.setText(charSequence3);
        d51Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        d51Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new rt(19, d51Var, onClickListener3));
        d51Var.d();
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        return TextUtils.equals(l61Var.l, l61Var2.l) && TextUtils.equals(l61Var.m, l61Var2.m) && TextUtils.equals(l61Var.n, l61Var2.n) && l61Var.E == l61Var2.E;
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new d51(context, c6Var);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        return l61Var.d == l61Var2.d;
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean isClickable() {
        return false;
    }
}
