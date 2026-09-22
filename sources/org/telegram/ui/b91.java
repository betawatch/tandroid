package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class b91 extends org.telegram.ui.Components.h51 {
    static {
        org.telegram.ui.Components.h51.setup(new b91());
    }

    public static org.telegram.ui.Components.i51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(b91.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        long j3 = i51Var.B;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        c91 c91Var = (c91) view;
        int i12 = i51Var.k;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        CharSequence charSequence3 = i51Var.n;
        TextView textView = c91Var.e;
        TextView textView2 = c91Var.f;
        c91Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        c91Var.b.b(i10, i11);
        c91Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        c91Var.n = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        c91Var.setValue(charSequence3);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new c91(context, e6Var);
    }
}
