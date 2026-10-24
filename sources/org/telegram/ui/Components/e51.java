package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class e51 extends l61 {
    static {
        l61.setup(new e51());
    }

    public static m61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        m61 J = m61.J(e51.class);
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

    public static m61 b(int i10, String str, String str2, String str3, a51 a51Var) {
        return a(i10, str, str2, str3, a51Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        f51 f51Var = (f51) view;
        CharSequence charSequence = m61Var.l;
        CharSequence charSequence2 = m61Var.m;
        CharSequence charSequence3 = m61Var.n;
        View.OnClickListener onClickListener = m61Var.D;
        boolean z11 = m61Var.e;
        View.OnClickListener onClickListener2 = m61Var.E;
        Object obj = m61Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = f51Var.r;
        LinearLayout linearLayout2 = f51Var.h;
        LinearLayout linearLayout3 = f51Var.b;
        f51Var.c.setText(charSequence);
        f51Var.d.setText(charSequence2);
        f51Var.e.setText(charSequence3);
        f51Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        f51Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new d51(0, f51Var, onClickListener3));
        f51Var.updateColors();
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        return TextUtils.equals(m61Var.l, m61Var2.l) && TextUtils.equals(m61Var.m, m61Var2.m) && TextUtils.equals(m61Var.n, m61Var2.n) && m61Var.E == m61Var2.E;
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new f51(context, g6Var);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        return m61Var.d == m61Var2.d;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }
}
