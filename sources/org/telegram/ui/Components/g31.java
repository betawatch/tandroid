package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class g31 extends n41 {
    static {
        n41.h(new g31());
    }

    public static o41 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, t tVar) {
        o41 K = o41.K(g31.class);
        K.d = i7;
        K.m = charSequence;
        K.n = charSequence2;
        K.o = charSequence3;
        K.E = onClickListener;
        K.e = z10;
        K.F = onClickListener2;
        K.H = tVar;
        return K;
    }

    public static o41 j(int i7, String str, String str2, String str3, d31 d31Var) {
        return i(i7, str, str2, str3, d31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        h31 h31Var = (h31) view;
        CharSequence charSequence = o41Var.m;
        CharSequence charSequence2 = o41Var.n;
        CharSequence charSequence3 = o41Var.o;
        View.OnClickListener onClickListener = o41Var.E;
        boolean z11 = o41Var.e;
        View.OnClickListener onClickListener2 = o41Var.F;
        Object obj = o41Var.H;
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
        linearLayout.setOnClickListener(new m8(29, h31Var, onClickListener3));
        h31Var.updateColors();
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c(o41 o41Var, o41 o41Var2) {
        return TextUtils.equals(o41Var.m, o41Var2.m) && TextUtils.equals(o41Var.n, o41Var2.n) && TextUtils.equals(o41Var.o, o41Var2.o) && o41Var.F == o41Var2.F;
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new h31(context, h6Var);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        return o41Var.d == o41Var2.d;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return false;
    }
}
