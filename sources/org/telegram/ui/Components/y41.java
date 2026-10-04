package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class y41 extends f61 {
    static {
        f61.setup(new y41());
    }

    public static g61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        g61 J = g61.J(y41.class);
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

    public static g61 b(int i10, String str, String str2, String str3, v41 v41Var) {
        return a(i10, str, str2, str3, v41Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        z41 z41Var = (z41) view;
        CharSequence charSequence = g61Var.l;
        CharSequence charSequence2 = g61Var.m;
        CharSequence charSequence3 = g61Var.n;
        View.OnClickListener onClickListener = g61Var.D;
        boolean z11 = g61Var.e;
        View.OnClickListener onClickListener2 = g61Var.E;
        Object obj = g61Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = z41Var.r;
        LinearLayout linearLayout2 = z41Var.h;
        LinearLayout linearLayout3 = z41Var.b;
        z41Var.c.setText(charSequence);
        z41Var.d.setText(charSequence2);
        z41Var.e.setText(charSequence3);
        z41Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        z41Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new gt(19, z41Var, onClickListener3));
        z41Var.e();
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return TextUtils.equals(g61Var.l, g61Var2.l) && TextUtils.equals(g61Var.m, g61Var2.m) && TextUtils.equals(g61Var.n, g61Var2.n) && g61Var.E == g61Var2.E;
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new z41(context, d6Var);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        return g61Var.d == g61Var2.d;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean isClickable() {
        return false;
    }
}
