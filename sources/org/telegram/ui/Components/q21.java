package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q21 extends x31 {
    static {
        x31.h(new q21());
    }

    public static y31 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z9, View.OnClickListener onClickListener2, p pVar) {
        y31 K = y31.K(q21.class);
        K.d = i7;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.D = onClickListener;
        K.e = z9;
        K.E = onClickListener2;
        K.G = pVar;
        return K;
    }

    public static y31 j(int i7, String str, String str2, String str3, n21 n21Var) {
        return i(i7, str, str2, str3, n21Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        r21 r21Var = (r21) view;
        CharSequence charSequence = y31Var.l;
        CharSequence charSequence2 = y31Var.m;
        CharSequence charSequence3 = y31Var.n;
        View.OnClickListener onClickListener = y31Var.D;
        boolean z10 = y31Var.e;
        View.OnClickListener onClickListener2 = y31Var.E;
        Object obj = y31Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = r21Var.r;
        LinearLayout linearLayout2 = r21Var.h;
        LinearLayout linearLayout3 = r21Var.b;
        r21Var.c.setText(charSequence);
        r21Var.d.setText(charSequence2);
        r21Var.e.setText(charSequence3);
        r21Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        r21Var.n.a(z10, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new lk(27, r21Var, onClickListener3));
        r21Var.updateColors();
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean c(y31 y31Var, y31 y31Var2) {
        return TextUtils.equals(y31Var.l, y31Var2.l) && TextUtils.equals(y31Var.m, y31Var2.m) && TextUtils.equals(y31Var.n, y31Var2.n) && y31Var.E == y31Var2.E;
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new r21(context, g6Var);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean e(y31 y31Var, y31 y31Var2) {
        return y31Var.d == y31Var2.d;
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean f() {
        return false;
    }
}
