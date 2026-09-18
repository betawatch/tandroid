package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class p41 extends w51 {
    static {
        w51.setup(new p41());
    }

    public static x51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        x51 J = x51.J(p41.class);
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

    public static x51 b(int i10, String str, String str2, String str3, m41 m41Var) {
        return a(i10, str, str2, str3, m41Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        q41 q41Var = (q41) view;
        CharSequence charSequence = x51Var.l;
        CharSequence charSequence2 = x51Var.m;
        CharSequence charSequence3 = x51Var.n;
        View.OnClickListener onClickListener = x51Var.D;
        boolean z11 = x51Var.e;
        View.OnClickListener onClickListener2 = x51Var.E;
        Object obj = x51Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = q41Var.r;
        LinearLayout linearLayout2 = q41Var.h;
        LinearLayout linearLayout3 = q41Var.b;
        q41Var.c.setText(charSequence);
        q41Var.d.setText(charSequence2);
        q41Var.e.setText(charSequence3);
        q41Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        q41Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new dt(19, q41Var, onClickListener3));
        q41Var.e();
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        return TextUtils.equals(x51Var.l, x51Var2.l) && TextUtils.equals(x51Var.m, x51Var2.m) && TextUtils.equals(x51Var.n, x51Var2.n) && x51Var.E == x51Var2.E;
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new q41(context, e6Var);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        return x51Var.d == x51Var2.d;
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean isClickable() {
        return false;
    }
}
