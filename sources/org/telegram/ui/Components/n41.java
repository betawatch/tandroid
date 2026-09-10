package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n41 extends u51 {
    static {
        u51.setup(new n41());
    }

    public static v51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, o oVar) {
        v51 J = v51.J(n41.class);
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

    public static v51 b(int i10, String str, String str2, String str3, k41 k41Var) {
        return a(i10, str, str2, str3, k41Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        o41 o41Var = (o41) view;
        CharSequence charSequence = v51Var.l;
        CharSequence charSequence2 = v51Var.m;
        CharSequence charSequence3 = v51Var.n;
        View.OnClickListener onClickListener = v51Var.D;
        boolean z11 = v51Var.e;
        View.OnClickListener onClickListener2 = v51Var.E;
        Object obj = v51Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = o41Var.r;
        LinearLayout linearLayout2 = o41Var.h;
        LinearLayout linearLayout3 = o41Var.b;
        o41Var.c.setText(charSequence);
        o41Var.d.setText(charSequence2);
        o41Var.e.setText(charSequence3);
        o41Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        o41Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new u10(16, o41Var, onClickListener3));
        o41Var.e();
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        return TextUtils.equals(v51Var.l, v51Var2.l) && TextUtils.equals(v51Var.m, v51Var2.m) && TextUtils.equals(v51Var.n, v51Var2.n) && v51Var.E == v51Var2.E;
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new o41(context, f6Var);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        return v51Var.d == v51Var2.d;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
