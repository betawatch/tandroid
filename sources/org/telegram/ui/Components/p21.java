package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class p21 extends w31 {
    static {
        w31.h(new p21());
    }

    public static x31 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z9, View.OnClickListener onClickListener2, p pVar) {
        x31 K = x31.K(p21.class);
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

    public static x31 j(int i7, String str, String str2, String str3, m21 m21Var) {
        return i(i7, str, str2, str3, m21Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        q21 q21Var = (q21) view;
        CharSequence charSequence = x31Var.l;
        CharSequence charSequence2 = x31Var.m;
        CharSequence charSequence3 = x31Var.n;
        View.OnClickListener onClickListener = x31Var.D;
        boolean z10 = x31Var.e;
        View.OnClickListener onClickListener2 = x31Var.E;
        Object obj = x31Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = q21Var.r;
        LinearLayout linearLayout2 = q21Var.h;
        LinearLayout linearLayout3 = q21Var.b;
        q21Var.c.setText(charSequence);
        q21Var.d.setText(charSequence2);
        q21Var.e.setText(charSequence3);
        q21Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        q21Var.n.a(z10, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new lk(27, q21Var, onClickListener3));
        q21Var.updateColors();
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean c(x31 x31Var, x31 x31Var2) {
        return TextUtils.equals(x31Var.l, x31Var2.l) && TextUtils.equals(x31Var.m, x31Var2.m) && TextUtils.equals(x31Var.n, x31Var2.n) && x31Var.E == x31Var2.E;
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q21(context, f6Var);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return x31Var.d == x31Var2.d;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
