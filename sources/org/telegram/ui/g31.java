package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g31 extends org.telegram.ui.Components.a41 {
    static {
        org.telegram.ui.Components.a41.h(new g31());
    }

    public static org.telegram.ui.Components.b41 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(g31.class);
        K.d = i7;
        K.k = i12;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.B = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        long j3 = b41Var.B;
        int i7 = (int) j3;
        int i10 = (int) (j3 >>> 32);
        h31 h31Var = (h31) view;
        int i11 = b41Var.k;
        CharSequence charSequence = b41Var.l;
        CharSequence charSequence2 = b41Var.m;
        CharSequence charSequence3 = b41Var.n;
        TextView textView = h31Var.e;
        TextView textView2 = h31Var.f;
        h31Var.n = (i7 == 0 && i10 == 0) ? false : true;
        h31Var.c.setVisibility(i11 != 0 ? 0 : 8);
        textView.setTranslationX(i11 == 0 ? org.telegram.messenger.g0.L(2.0f) : 0.0f);
        textView2.setTranslationX(i11 == 0 ? org.telegram.messenger.g0.L(2.0f) : 0.0f);
        h31Var.b.b(i7, i10);
        h31Var.d.setImageResource(i11);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        h31Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        h31Var.setValue(charSequence3);
        h31Var.updateColors();
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h31(context, e6Var);
    }
}
