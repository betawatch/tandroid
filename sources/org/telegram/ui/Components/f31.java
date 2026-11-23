package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f31 extends m41 {
    static {
        m41.h(new f31());
    }

    public static n41 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, s sVar) {
        n41 K = n41.K(f31.class);
        K.d = i7;
        K.m = charSequence;
        K.n = charSequence2;
        K.o = charSequence3;
        K.E = onClickListener;
        K.e = z10;
        K.F = onClickListener2;
        K.H = sVar;
        return K;
    }

    public static n41 j(int i7, String str, String str2, String str3, c31 c31Var) {
        return i(i7, str, str2, str3, c31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        g31 g31Var = (g31) view;
        CharSequence charSequence = n41Var.m;
        CharSequence charSequence2 = n41Var.n;
        CharSequence charSequence3 = n41Var.o;
        View.OnClickListener onClickListener = n41Var.E;
        boolean z11 = n41Var.e;
        View.OnClickListener onClickListener2 = n41Var.F;
        Object obj = n41Var.H;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = g31Var.r;
        LinearLayout linearLayout2 = g31Var.h;
        LinearLayout linearLayout3 = g31Var.b;
        g31Var.c.setText(charSequence);
        g31Var.d.setText(charSequence2);
        g31Var.e.setText(charSequence3);
        g31Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        g31Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new l8(29, g31Var, onClickListener3));
        g31Var.updateColors();
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean c(n41 n41Var, n41 n41Var2) {
        return TextUtils.equals(n41Var.m, n41Var2.m) && TextUtils.equals(n41Var.n, n41Var2.n) && TextUtils.equals(n41Var.o, n41Var2.o) && n41Var.F == n41Var2.F;
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new g31(context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return false;
    }
}
