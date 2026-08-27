package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g31 extends m41 {
    static {
        m41.setup(new g31());
    }

    public static n41 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        n41 J = n41.J(g31.class);
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

    public static n41 b(int i10, String str, String str2, String str3, d31 d31Var) {
        return a(i10, str, str2, str3, d31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        h31 h31Var = (h31) view;
        CharSequence charSequence = n41Var.l;
        CharSequence charSequence2 = n41Var.m;
        CharSequence charSequence3 = n41Var.n;
        View.OnClickListener onClickListener = n41Var.D;
        boolean z11 = n41Var.e;
        View.OnClickListener onClickListener2 = n41Var.E;
        Object obj = n41Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = h31Var.r;
        LinearLayout linearLayout2 = h31Var.h;
        LinearLayout linearLayout3 = h31Var.b;
        h31Var.c.setText(charSequence);
        h31Var.d.setText(charSequence2);
        h31Var.e.setText(charSequence3);
        h31Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        h31Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new xh0(7, h31Var, onClickListener3));
        h31Var.d();
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return TextUtils.equals(n41Var.l, n41Var2.l) && TextUtils.equals(n41Var.m, n41Var2.m) && TextUtils.equals(n41Var.n, n41Var2.n) && n41Var.E == n41Var2.E;
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new h31(context, c6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean isClickable() {
        return false;
    }
}
