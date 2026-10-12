package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class k91 extends org.telegram.ui.Components.k61 {
    static {
        org.telegram.ui.Components.k61.setup(new k91());
    }

    public static org.telegram.ui.Components.l61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.l61 J = org.telegram.ui.Components.l61.J(k91.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        long j10 = l61Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        l91 l91Var = (l91) view;
        int i12 = l61Var.k;
        CharSequence charSequence = l61Var.l;
        CharSequence charSequence2 = l61Var.m;
        CharSequence charSequence3 = l61Var.n;
        TextView textView = l91Var.e;
        TextView textView2 = l91Var.f;
        l91Var.n = (i10 == 0 && i11 == 0) ? false : true;
        l91Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        l91Var.b.b(i10, i11);
        l91Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        l91Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        l91Var.setValue(charSequence3);
        l91Var.d();
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new l91(context, c6Var);
    }
}
