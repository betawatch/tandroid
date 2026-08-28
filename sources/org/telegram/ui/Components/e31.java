package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e31 extends k41 {
    static {
        k41.setup(new e31());
    }

    public static l41 a(int i9, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        l41 J = l41.J(e31.class);
        J.d = i9;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static l41 b(int i9, String str, String str2, String str3, b31 b31Var) {
        return a(i9, str, str2, str3, b31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        f31 f31Var = (f31) view;
        CharSequence charSequence = l41Var.l;
        CharSequence charSequence2 = l41Var.m;
        CharSequence charSequence3 = l41Var.n;
        View.OnClickListener onClickListener = l41Var.D;
        boolean z11 = l41Var.e;
        View.OnClickListener onClickListener2 = l41Var.E;
        Object obj = l41Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = f31Var.r;
        LinearLayout linearLayout2 = f31Var.h;
        LinearLayout linearLayout3 = f31Var.b;
        f31Var.c.setText(charSequence);
        f31Var.d.setText(charSequence2);
        f31Var.e.setText(charSequence3);
        f31Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        f31Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new vh0(6, f31Var, onClickListener3));
        f31Var.d();
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        return TextUtils.equals(l41Var.l, l41Var2.l) && TextUtils.equals(l41Var.m, l41Var2.m) && TextUtils.equals(l41Var.n, l41Var2.n) && l41Var.E == l41Var2.E;
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new f31(context, b6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean isClickable() {
        return false;
    }
}
