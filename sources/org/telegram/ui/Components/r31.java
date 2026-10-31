package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r31 extends z41 {
    static {
        z41.h(new r31());
    }

    public static a51 i(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, o oVar) {
        a51 K = a51.K(r31.class);
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

    public static a51 j(int i10, String str, String str2, String str3, o31 o31Var) {
        return i(i10, str, str2, str3, o31Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        s31 s31Var = (s31) view;
        CharSequence charSequence = a51Var.l;
        CharSequence charSequence2 = a51Var.m;
        CharSequence charSequence3 = a51Var.n;
        View.OnClickListener onClickListener = a51Var.D;
        boolean z11 = a51Var.e;
        View.OnClickListener onClickListener2 = a51Var.E;
        Object obj = a51Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = s31Var.r;
        LinearLayout linearLayout2 = s31Var.h;
        LinearLayout linearLayout3 = s31Var.b;
        s31Var.c.setText(charSequence);
        s31Var.d.setText(charSequence2);
        s31Var.e.setText(charSequence3);
        s31Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        s31Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new sr(20, s31Var, onClickListener3));
        s31Var.updateColors();
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean c(a51 a51Var, a51 a51Var2) {
        return TextUtils.equals(a51Var.l, a51Var2.l) && TextUtils.equals(a51Var.m, a51Var2.m) && TextUtils.equals(a51Var.n, a51Var2.n) && a51Var.E == a51Var2.E;
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new s31(context, p6Var);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(a51 a51Var, a51 a51Var2) {
        return a51Var.d == a51Var2.d;
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean f() {
        return false;
    }
}
