package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k21 extends q31 {
    static {
        q31.h(new k21());
    }

    public static r31 i(int i3, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, o oVar) {
        r31 K = r31.K(k21.class);
        K.d = i3;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.D = onClickListener;
        K.e = z10;
        K.E = onClickListener2;
        K.G = oVar;
        return K;
    }

    public static r31 j(int i3, String str, String str2, String str3, h21 h21Var) {
        return i(i3, str, str2, str3, h21Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        l21 l21Var = (l21) view;
        CharSequence charSequence = r31Var.l;
        CharSequence charSequence2 = r31Var.m;
        CharSequence charSequence3 = r31Var.n;
        View.OnClickListener onClickListener = r31Var.D;
        boolean z11 = r31Var.e;
        View.OnClickListener onClickListener2 = r31Var.E;
        Object obj = r31Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = l21Var.r;
        LinearLayout linearLayout2 = l21Var.h;
        LinearLayout linearLayout3 = l21Var.b;
        l21Var.c.setText(charSequence);
        l21Var.d.setText(charSequence2);
        l21Var.e.setText(charSequence3);
        l21Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        l21Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new ux0(3, (Object) l21Var, (Object) onClickListener3));
        l21Var.updateColors();
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return TextUtils.equals(r31Var.l, r31Var2.l) && TextUtils.equals(r31Var.m, r31Var2.m) && TextUtils.equals(r31Var.n, r31Var2.n) && r31Var.E == r31Var2.E;
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new l21(context, e6Var);
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
