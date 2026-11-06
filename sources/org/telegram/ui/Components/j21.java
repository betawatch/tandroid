package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j21 extends q31 {
    static {
        q31.h(new j21());
    }

    public static r31 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z9, View.OnClickListener onClickListener2, p pVar) {
        r31 K = r31.K(j21.class);
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

    public static r31 j(int i7, String str, String str2, String str3, g21 g21Var) {
        return i(i7, str, str2, str3, g21Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        k21 k21Var = (k21) view;
        CharSequence charSequence = r31Var.l;
        CharSequence charSequence2 = r31Var.m;
        CharSequence charSequence3 = r31Var.n;
        View.OnClickListener onClickListener = r31Var.D;
        boolean z10 = r31Var.e;
        View.OnClickListener onClickListener2 = r31Var.E;
        Object obj = r31Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = k21Var.r;
        LinearLayout linearLayout2 = k21Var.h;
        LinearLayout linearLayout3 = k21Var.b;
        k21Var.c.setText(charSequence);
        k21Var.d.setText(charSequence2);
        k21Var.e.setText(charSequence3);
        k21Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        k21Var.n.a(z10, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new lk(27, k21Var, onClickListener3));
        k21Var.updateColors();
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return TextUtils.equals(r31Var.l, r31Var2.l) && TextUtils.equals(r31Var.m, r31Var2.m) && TextUtils.equals(r31Var.n, r31Var2.n) && r31Var.E == r31Var2.E;
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new k21(context, f6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return r31Var.d == r31Var2.d;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
