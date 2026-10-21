package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class y41 extends g61 {
    static {
        g61.setup(new y41());
    }

    public static h61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        h61 J = h61.J(y41.class);
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

    public static h61 b(int i10, String str, String str2, String str3, v41 v41Var) {
        return a(i10, str, str2, str3, v41Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        z41 z41Var = (z41) view;
        CharSequence charSequence = h61Var.l;
        CharSequence charSequence2 = h61Var.m;
        CharSequence charSequence3 = h61Var.n;
        View.OnClickListener onClickListener = h61Var.D;
        boolean z11 = h61Var.e;
        View.OnClickListener onClickListener2 = h61Var.E;
        Object obj = h61Var.G;
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
        linearLayout.setOnClickListener(new ca(29, z41Var, onClickListener3));
        z41Var.d();
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        return TextUtils.equals(h61Var.l, h61Var2.l) && TextUtils.equals(h61Var.m, h61Var2.m) && TextUtils.equals(h61Var.n, h61Var2.n) && h61Var.E == h61Var2.E;
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new z41(context, d6Var);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        return h61Var.d == h61Var2.d;
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return false;
    }
}
