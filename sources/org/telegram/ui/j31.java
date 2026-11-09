package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j31 extends org.telegram.ui.Components.x31 {
    static {
        org.telegram.ui.Components.x31.h(new j31());
    }

    public static org.telegram.ui.Components.y31 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.y31 K = org.telegram.ui.Components.y31.K(j31.class);
        K.d = i7;
        K.k = i12;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.B = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        long j3 = y31Var.B;
        int i7 = (int) j3;
        int i10 = (int) (j3 >>> 32);
        k31 k31Var = (k31) view;
        int i11 = y31Var.k;
        CharSequence charSequence = y31Var.l;
        CharSequence charSequence2 = y31Var.m;
        CharSequence charSequence3 = y31Var.n;
        TextView textView = k31Var.e;
        TextView textView2 = k31Var.f;
        k31Var.n = (i7 == 0 && i10 == 0) ? false : true;
        k31Var.c.setVisibility(i11 != 0 ? 0 : 8);
        textView.setTranslationX(i11 == 0 ? org.telegram.messenger.g0.L(2.0f) : 0.0f);
        textView2.setTranslationX(i11 == 0 ? org.telegram.messenger.g0.L(2.0f) : 0.0f);
        k31Var.b.b(i7, i10);
        k31Var.d.setImageResource(i11);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        k31Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        k31Var.setValue(charSequence3);
        k31Var.updateColors();
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new k31(context, g6Var);
    }
}
