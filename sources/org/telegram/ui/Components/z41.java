package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class z41 extends g61 {
    static {
        g61.setup(new z41());
    }

    public static h61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        h61 K = h61.K(z41.class);
        K.d = i10;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.D = onClickListener;
        K.e = z10;
        K.E = onClickListener2;
        K.G = nVar;
        return K;
    }

    public static h61 b(int i10, String str, String str2, String str3, w41 w41Var) {
        return a(i10, str, str2, str3, w41Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        a51 a51Var = (a51) view;
        CharSequence charSequence = h61Var.l;
        CharSequence charSequence2 = h61Var.m;
        CharSequence charSequence3 = h61Var.n;
        View.OnClickListener onClickListener = h61Var.D;
        boolean z11 = h61Var.e;
        View.OnClickListener onClickListener2 = h61Var.E;
        Object obj = h61Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = a51Var.r;
        LinearLayout linearLayout2 = a51Var.h;
        LinearLayout linearLayout3 = a51Var.b;
        a51Var.c.setText(charSequence);
        a51Var.d.setText(charSequence2);
        a51Var.e.setText(charSequence3);
        a51Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        a51Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new gt(19, a51Var, onClickListener3));
        a51Var.e();
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        return TextUtils.equals(h61Var.l, h61Var2.l) && TextUtils.equals(h61Var.m, h61Var2.m) && TextUtils.equals(h61Var.n, h61Var2.n) && h61Var.E == h61Var2.E;
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new a51(context, d6Var);
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
