package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l51 extends s61 {
    static {
        s61.setup(new l51());
    }

    public static t61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        t61 K = t61.K(l51.class);
        K.d = i10;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.D = onClickListener;
        K.e = z10;
        K.E = onClickListener2;
        K.G = nVar;
        return K;
    }

    public static t61 b(int i10, String str, String str2, String str3, h51 h51Var) {
        return a(i10, str, str2, str3, h51Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        m51 m51Var = (m51) view;
        CharSequence charSequence = t61Var.l;
        CharSequence charSequence2 = t61Var.m;
        CharSequence charSequence3 = t61Var.n;
        View.OnClickListener onClickListener = t61Var.D;
        boolean z11 = t61Var.e;
        View.OnClickListener onClickListener2 = t61Var.E;
        Object obj = t61Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = m51Var.r;
        LinearLayout linearLayout2 = m51Var.h;
        LinearLayout linearLayout3 = m51Var.b;
        m51Var.c.setText(charSequence);
        m51Var.d.setText(charSequence2);
        m51Var.e.setText(charSequence3);
        m51Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        m51Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new k51(0, m51Var, onClickListener3));
        m51Var.updateColors();
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        return TextUtils.equals(t61Var.l, t61Var2.l) && TextUtils.equals(t61Var.m, t61Var2.m) && TextUtils.equals(t61Var.n, t61Var2.n) && t61Var.E == t61Var2.E;
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new m51(context, u6Var);
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        return t61Var.d == t61Var2.d;
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean isClickable() {
        return false;
    }
}
