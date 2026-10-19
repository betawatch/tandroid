package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class x41 extends f61 {
    static {
        f61.setup(new x41());
    }

    public static g61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        g61 J = g61.J(x41.class);
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

    public static g61 b(int i10, String str, String str2, String str3, u41 u41Var) {
        return a(i10, str, str2, str3, u41Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        y41 y41Var = (y41) view;
        CharSequence charSequence = g61Var.l;
        CharSequence charSequence2 = g61Var.m;
        CharSequence charSequence3 = g61Var.n;
        View.OnClickListener onClickListener = g61Var.D;
        boolean z11 = g61Var.e;
        View.OnClickListener onClickListener2 = g61Var.E;
        Object obj = g61Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = y41Var.r;
        LinearLayout linearLayout2 = y41Var.h;
        LinearLayout linearLayout3 = y41Var.b;
        y41Var.c.setText(charSequence);
        y41Var.d.setText(charSequence2);
        y41Var.e.setText(charSequence3);
        y41Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        y41Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new ca(29, y41Var, onClickListener3));
        y41Var.d();
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return TextUtils.equals(g61Var.l, g61Var2.l) && TextUtils.equals(g61Var.m, g61Var2.m) && TextUtils.equals(g61Var.n, g61Var2.n) && g61Var.E == g61Var2.E;
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y41(context, d6Var);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        return g61Var.d == g61Var2.d;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean isClickable() {
        return false;
    }
}
