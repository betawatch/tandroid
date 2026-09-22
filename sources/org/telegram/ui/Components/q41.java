package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q41 extends x51 {
    static {
        x51.setup(new q41());
    }

    public static y51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        y51 J = y51.J(q41.class);
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

    public static y51 b(int i10, String str, String str2, String str3, n41 n41Var) {
        return a(i10, str, str2, str3, n41Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        r41 r41Var = (r41) view;
        CharSequence charSequence = y51Var.l;
        CharSequence charSequence2 = y51Var.m;
        CharSequence charSequence3 = y51Var.n;
        View.OnClickListener onClickListener = y51Var.D;
        boolean z11 = y51Var.e;
        View.OnClickListener onClickListener2 = y51Var.E;
        Object obj = y51Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = r41Var.r;
        LinearLayout linearLayout2 = r41Var.h;
        LinearLayout linearLayout3 = r41Var.b;
        r41Var.c.setText(charSequence);
        r41Var.d.setText(charSequence2);
        r41Var.e.setText(charSequence3);
        r41Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        r41Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new dt(19, r41Var, onClickListener3));
        r41Var.e();
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        return TextUtils.equals(y51Var.l, y51Var2.l) && TextUtils.equals(y51Var.m, y51Var2.m) && TextUtils.equals(y51Var.n, y51Var2.n) && y51Var.E == y51Var2.E;
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r41(context, f6Var);
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        return y51Var.d == y51Var2.d;
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean isClickable() {
        return false;
    }
}
