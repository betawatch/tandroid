package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p31 extends v41 {
    static {
        v41.setup(new p31());
    }

    public static w41 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, p pVar) {
        w41 J = w41.J(p31.class);
        J.d = i10;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = pVar;
        return J;
    }

    public static w41 b(int i10, String str, String str2, String str3, m31 m31Var) {
        return a(i10, str, str2, str3, m31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        q31 q31Var = (q31) view;
        CharSequence charSequence = w41Var.l;
        CharSequence charSequence2 = w41Var.m;
        CharSequence charSequence3 = w41Var.n;
        View.OnClickListener onClickListener = w41Var.D;
        boolean z11 = w41Var.e;
        View.OnClickListener onClickListener2 = w41Var.E;
        Object obj = w41Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = q31Var.r;
        LinearLayout linearLayout2 = q31Var.h;
        LinearLayout linearLayout3 = q31Var.b;
        q31Var.c.setText(charSequence);
        q31Var.d.setText(charSequence2);
        q31Var.e.setText(charSequence3);
        q31Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        q31Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new fi0(7, q31Var, onClickListener3));
        q31Var.e();
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        return TextUtils.equals(w41Var.l, w41Var2.l) && TextUtils.equals(w41Var.m, w41Var2.m) && TextUtils.equals(w41Var.n, w41Var2.n) && w41Var.E == w41Var2.E;
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new q31(context, c6Var);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        return w41Var.d == w41Var2.d;
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean isClickable() {
        return false;
    }
}
