package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k31 extends org.telegram.ui.Components.w31 {
    static {
        org.telegram.ui.Components.w31.h(new k31());
    }

    public static org.telegram.ui.Components.x31 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(k31.class);
        K.d = i7;
        K.k = i12;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.B = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        long j3 = x31Var.B;
        int i7 = (int) j3;
        int i10 = (int) (j3 >>> 32);
        l31 l31Var = (l31) view;
        int i11 = x31Var.k;
        CharSequence charSequence = x31Var.l;
        CharSequence charSequence2 = x31Var.m;
        CharSequence charSequence3 = x31Var.n;
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

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new l31(context, h6Var);
    }
}
