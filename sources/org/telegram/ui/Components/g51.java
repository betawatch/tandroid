package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g51 extends o61 {
    static {
        o61.setup(new g51());
    }

    public static p61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        p61 J = p61.J(g51.class);
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

    public static p61 b(int i10, String str, String str2, String str3, d51 d51Var) {
        return a(i10, str, str2, str3, d51Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        h51 h51Var = (h51) view;
        CharSequence charSequence = p61Var.l;
        CharSequence charSequence2 = p61Var.m;
        CharSequence charSequence3 = p61Var.n;
        View.OnClickListener onClickListener = p61Var.D;
        boolean z11 = p61Var.e;
        View.OnClickListener onClickListener2 = p61Var.E;
        Object obj = p61Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = h51Var.r;
        LinearLayout linearLayout2 = h51Var.h;
        LinearLayout linearLayout3 = h51Var.b;
        h51Var.c.setText(charSequence);
        h51Var.d.setText(charSequence2);
        h51Var.e.setText(charSequence3);
        h51Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        h51Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new ut(19, h51Var, onClickListener3));
        h51Var.e();
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        return TextUtils.equals(p61Var.l, p61Var2.l) && TextUtils.equals(p61Var.m, p61Var2.m) && TextUtils.equals(p61Var.n, p61Var2.n) && p61Var.E == p61Var2.E;
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h51(context, e6Var);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        return p61Var.d == p61Var2.d;
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean isClickable() {
        return false;
    }
}
