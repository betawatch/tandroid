package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class e31 extends k41 {
    static {
        k41.h(new e31());
    }

    public static l41 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, s sVar) {
        l41 K = l41.K(e31.class);
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

    public static l41 j(int i7, String str, String str2, String str3, a31 a31Var) {
        return i(i7, str, str2, str3, a31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        f31 f31Var = (f31) view;
        CharSequence charSequence = l41Var.m;
        CharSequence charSequence2 = l41Var.n;
        CharSequence charSequence3 = l41Var.o;
        View.OnClickListener onClickListener = l41Var.E;
        boolean z11 = l41Var.e;
        View.OnClickListener onClickListener2 = l41Var.F;
        Object obj = l41Var.H;
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
        linearLayout.setOnClickListener(new c31(1, f31Var, onClickListener3));
        f31Var.updateColors();
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean c(l41 l41Var, l41 l41Var2) {
        return TextUtils.equals(l41Var.m, l41Var2.m) && TextUtils.equals(l41Var.n, l41Var2.n) && TextUtils.equals(l41Var.o, l41Var2.o) && l41Var.F == l41Var2.F;
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new f31(context, i6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
