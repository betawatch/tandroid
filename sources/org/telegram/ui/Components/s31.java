package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s31 extends a51 {
    static {
        a51.h(new s31());
    }

    public static b51 i(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, o oVar) {
        b51 K = b51.K(s31.class);
        K.d = i10;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.D = onClickListener;
        K.e = z10;
        K.E = onClickListener2;
        K.G = oVar;
        return K;
    }

    public static b51 j(int i10, String str, String str2, String str3, p31 p31Var) {
        return i(i10, str, str2, str3, p31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        t31 t31Var = (t31) view;
        CharSequence charSequence = b51Var.l;
        CharSequence charSequence2 = b51Var.m;
        CharSequence charSequence3 = b51Var.n;
        View.OnClickListener onClickListener = b51Var.D;
        boolean z11 = b51Var.e;
        View.OnClickListener onClickListener2 = b51Var.E;
        Object obj = b51Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = t31Var.r;
        LinearLayout linearLayout2 = t31Var.h;
        LinearLayout linearLayout3 = t31Var.b;
        t31Var.c.setText(charSequence);
        t31Var.d.setText(charSequence2);
        t31Var.e.setText(charSequence3);
        t31Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        t31Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new sr(20, t31Var, onClickListener3));
        t31Var.updateColors();
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean c(b51 b51Var, b51 b51Var2) {
        return TextUtils.equals(b51Var.l, b51Var2.l) && TextUtils.equals(b51Var.m, b51Var2.m) && TextUtils.equals(b51Var.n, b51Var2.n) && b51Var.E == b51Var2.E;
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new t31(context, p6Var);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean e(b51 b51Var, b51 b51Var2) {
        return b51Var.d == b51Var2.d;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean f() {
        return false;
    }
}
