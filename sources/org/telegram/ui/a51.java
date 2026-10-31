package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a51 extends org.telegram.ui.Components.z41 {
    static {
        org.telegram.ui.Components.z41.h(new a51());
    }

    public static org.telegram.ui.Components.a51 i(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(a51.class);
        K.d = i10;
        K.k = i13;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.B = (i11 & 4294967295L) | (i12 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        long j10 = a51Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        b51 b51Var = (b51) view;
        int i12 = a51Var.k;
        CharSequence charSequence = a51Var.l;
        CharSequence charSequence2 = a51Var.m;
        CharSequence charSequence3 = a51Var.n;
        TextView textView = b51Var.e;
        TextView textView2 = b51Var.f;
        b51Var.n = (i10 == 0 && i11 == 0) ? false : true;
        b51Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? org.telegram.messenger.i0.L(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? org.telegram.messenger.i0.L(2.0f) : 0.0f);
        b51Var.b.b(i10, i11);
        b51Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        b51Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        b51Var.setValue(charSequence3);
        b51Var.updateColors();
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new b51(context, p6Var);
    }
}
