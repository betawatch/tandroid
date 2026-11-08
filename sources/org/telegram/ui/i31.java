package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i31 extends org.telegram.ui.Components.w31 {
    static {
        org.telegram.ui.Components.w31.h(new i31());
    }

    public static org.telegram.ui.Components.x31 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(i31.class);
        K.d = i7;
        K.k = i12;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.B = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        long j3 = x31Var.B;
        int i7 = (int) j3;
        int i10 = (int) (j3 >>> 32);
        j31 j31Var = (j31) view;
        int i11 = x31Var.k;
        CharSequence charSequence = x31Var.l;
        CharSequence charSequence2 = x31Var.m;
        CharSequence charSequence3 = x31Var.n;
        TextView textView = j31Var.e;
        TextView textView2 = j31Var.f;
        j31Var.n = (i7 == 0 && i10 == 0) ? false : true;
        j31Var.c.setVisibility(i11 != 0 ? 0 : 8);
        textView.setTranslationX(i11 == 0 ? org.telegram.messenger.g0.L(2.0f) : 0.0f);
        textView2.setTranslationX(i11 == 0 ? org.telegram.messenger.g0.L(2.0f) : 0.0f);
        j31Var.b.b(i7, i10);
        j31Var.d.setImageResource(i11);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        j31Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        j31Var.setValue(charSequence3);
        j31Var.updateColors();
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j31(context, f6Var);
    }
}
