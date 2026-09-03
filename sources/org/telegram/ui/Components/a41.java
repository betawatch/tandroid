package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a41 extends h51 {
    static {
        h51.setup(new a41());
    }

    public static i51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z4, View.OnClickListener onClickListener2, o oVar) {
        i51 J = i51.J(a41.class);
        J.d = i10;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.D = onClickListener;
        J.e = z4;
        J.E = onClickListener2;
        J.G = oVar;
        return J;
    }

    public static i51 b(int i10, String str, String str2, String str3, x31 x31Var) {
        return a(i10, str, str2, str3, x31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        b41 b41Var = (b41) view;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        CharSequence charSequence3 = i51Var.n;
        View.OnClickListener onClickListener = i51Var.D;
        boolean z10 = i51Var.e;
        View.OnClickListener onClickListener2 = i51Var.E;
        Object obj = i51Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = b41Var.r;
        LinearLayout linearLayout2 = b41Var.h;
        LinearLayout linearLayout3 = b41Var.b;
        b41Var.c.setText(charSequence);
        b41Var.d.setText(charSequence2);
        b41Var.e.setText(charSequence3);
        b41Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        b41Var.n.a(z10, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new rx0(4, b41Var, onClickListener3));
        b41Var.e();
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return TextUtils.equals(i51Var.l, i51Var2.l) && TextUtils.equals(i51Var.m, i51Var2.m) && TextUtils.equals(i51Var.n, i51Var2.n) && i51Var.E == i51Var2.E;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new b41(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
