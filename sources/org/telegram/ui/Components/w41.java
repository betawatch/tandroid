package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class w41 extends e61 {
    static {
        e61.setup(new w41());
    }

    public static f61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        f61 J = f61.J(w41.class);
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

    public static f61 b(int i10, String str, String str2, String str3, t41 t41Var) {
        return a(i10, str, str2, str3, t41Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        x41 x41Var = (x41) view;
        CharSequence charSequence = f61Var.l;
        CharSequence charSequence2 = f61Var.m;
        CharSequence charSequence3 = f61Var.n;
        View.OnClickListener onClickListener = f61Var.D;
        boolean z11 = f61Var.e;
        View.OnClickListener onClickListener2 = f61Var.E;
        Object obj = f61Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = x41Var.r;
        LinearLayout linearLayout2 = x41Var.h;
        LinearLayout linearLayout3 = x41Var.b;
        x41Var.c.setText(charSequence);
        x41Var.d.setText(charSequence2);
        x41Var.e.setText(charSequence3);
        x41Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        x41Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new ca(29, x41Var, onClickListener3));
        x41Var.d();
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        return TextUtils.equals(f61Var.l, f61Var2.l) && TextUtils.equals(f61Var.m, f61Var2.m) && TextUtils.equals(f61Var.n, f61Var2.n) && f61Var.E == f61Var2.E;
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new x41(context, d6Var);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        return f61Var.d == f61Var2.d;
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean isClickable() {
        return false;
    }
}
