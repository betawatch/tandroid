package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class k31 extends org.telegram.ui.Components.n41 {
    static {
        org.telegram.ui.Components.n41.h(new k31());
    }

    public static org.telegram.ui.Components.o41 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.o41 K = org.telegram.ui.Components.o41.K(k31.class);
        K.d = i7;
        K.k = i12;
        K.m = charSequence;
        K.n = charSequence2;
        K.o = charSequence3;
        K.C = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        long j3 = o41Var.C;
        int i7 = (int) j3;
        int i10 = (int) (j3 >>> 32);
        l31 l31Var = (l31) view;
        int i11 = o41Var.k;
        CharSequence charSequence = o41Var.m;
        CharSequence charSequence2 = o41Var.n;
        CharSequence charSequence3 = o41Var.o;
        TextView textView = l31Var.e;
        TextView textView2 = l31Var.f;
        l31Var.n = (i7 == 0 && i10 == 0) ? false : true;
        l31Var.c.setVisibility(i11 != 0 ? 0 : 8);
        textView.setTranslationX(i11 == 0 ? org.telegram.messenger.g0.L(2.0f) : 0.0f);
        textView2.setTranslationX(i11 == 0 ? org.telegram.messenger.g0.L(2.0f) : 0.0f);
        l31Var.b.b(i7, i10);
        l31Var.d.setImageResource(i11);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        l31Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        l31Var.setValue(charSequence3);
        l31Var.updateColors();
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new l31(context, h6Var);
    }
}
