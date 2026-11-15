package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u21 extends a41 {
    static {
        a41.h(new u21());
    }

    public static b41 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        b41 K = b41.K(u21.class);
        K.d = i7;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.D = onClickListener;
        K.e = z10;
        K.E = onClickListener2;
        K.G = nVar;
        return K;
    }

    public static b41 j(int i7, String str, String str2, String str3, r21 r21Var) {
        return i(i7, str, str2, str3, r21Var, false, null, null);
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        v21 v21Var = (v21) view;
        CharSequence charSequence = b41Var.l;
        CharSequence charSequence2 = b41Var.m;
        CharSequence charSequence3 = b41Var.n;
        View.OnClickListener onClickListener = b41Var.D;
        boolean z11 = b41Var.e;
        View.OnClickListener onClickListener2 = b41Var.E;
        Object obj = b41Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = v21Var.r;
        LinearLayout linearLayout2 = v21Var.h;
        LinearLayout linearLayout3 = v21Var.b;
        v21Var.c.setText(charSequence);
        v21Var.d.setText(charSequence2);
        v21Var.e.setText(charSequence3);
        v21Var.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        v21Var.n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new vv0(5, v21Var, onClickListener3));
        v21Var.updateColors();
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean c(b41 b41Var, b41 b41Var2) {
        return TextUtils.equals(b41Var.l, b41Var2.l) && TextUtils.equals(b41Var.m, b41Var2.m) && TextUtils.equals(b41Var.n, b41Var2.n) && b41Var.E == b41Var2.E;
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new v21(context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(b41 b41Var, b41 b41Var2) {
        return b41Var.d == b41Var2.d;
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return false;
    }
}
