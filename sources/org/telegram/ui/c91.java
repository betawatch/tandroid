package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c91 extends org.telegram.ui.Components.i51 {
    static {
        org.telegram.ui.Components.i51.setup(new c91());
    }

    public static org.telegram.ui.Components.j51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(c91.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        long j3 = j51Var.B;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        d91 d91Var = (d91) view;
        int i12 = j51Var.k;
        CharSequence charSequence = j51Var.l;
        CharSequence charSequence2 = j51Var.m;
        CharSequence charSequence3 = j51Var.n;
        TextView textView = d91Var.e;
        TextView textView2 = d91Var.f;
        d91Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        d91Var.b.b(i10, i11);
        d91Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        d91Var.n = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        d91Var.setValue(charSequence3);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new d91(context, f6Var);
    }
}
