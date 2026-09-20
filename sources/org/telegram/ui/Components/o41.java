package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class o41 extends v51 {
    static {
        v51.setup(new o41());
    }

    public static w51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        w51 J = w51.J(o41.class);
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

    public static w51 b(int i10, String str, String str2, String str3, l41 l41Var) {
        return a(i10, str, str2, str3, l41Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        p41 p41Var = (p41) view;
        CharSequence charSequence = w51Var.l;
        CharSequence charSequence2 = w51Var.m;
        CharSequence charSequence3 = w51Var.n;
        View.OnClickListener onClickListener = w51Var.D;
        boolean z11 = w51Var.e;
        View.OnClickListener onClickListener2 = w51Var.E;
        Object obj = w51Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = p41Var.r;
        LinearLayout linearLayout2 = p41Var.h;
        LinearLayout linearLayout3 = p41Var.b;
        p41Var.c.setText(charSequence);
        p41Var.d.setText(charSequence2);
        p41Var.e.setText(charSequence3);
        p41Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        p41Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new dt(19, p41Var, onClickListener3));
        p41Var.e();
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        return TextUtils.equals(w51Var.l, w51Var2.l) && TextUtils.equals(w51Var.m, w51Var2.m) && TextUtils.equals(w51Var.n, w51Var2.n) && w51Var.E == w51Var2.E;
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new p41(context, f6Var);
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        return w51Var.d == w51Var2.d;
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean isClickable() {
        return false;
    }
}
