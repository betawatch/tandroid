package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m51 extends t61 {
    static {
        t61.setup(new m51());
    }

    public static u61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        u61 K = u61.K(m51.class);
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

    public static u61 b(int i10, String str, String str2, String str3, i51 i51Var) {
        return a(i10, str, str2, str3, i51Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        n51 n51Var = (n51) view;
        CharSequence charSequence = u61Var.l;
        CharSequence charSequence2 = u61Var.m;
        CharSequence charSequence3 = u61Var.n;
        View.OnClickListener onClickListener = u61Var.D;
        boolean z11 = u61Var.e;
        View.OnClickListener onClickListener2 = u61Var.E;
        Object obj = u61Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = n51Var.r;
        LinearLayout linearLayout2 = n51Var.h;
        LinearLayout linearLayout3 = n51Var.b;
        n51Var.c.setText(charSequence);
        n51Var.d.setText(charSequence2);
        n51Var.e.setText(charSequence3);
        n51Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        n51Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new l51(0, n51Var, onClickListener3));
        n51Var.updateColors();
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        return TextUtils.equals(u61Var.l, u61Var2.l) && TextUtils.equals(u61Var.m, u61Var2.m) && TextUtils.equals(u61Var.n, u61Var2.n) && u61Var.E == u61Var2.E;
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new n51(context, u6Var);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        return u61Var.d == u61Var2.d;
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean isClickable() {
        return false;
    }
}
