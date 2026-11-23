package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j31 extends org.telegram.ui.Components.m41 {
    static {
        org.telegram.ui.Components.m41.h(new j31());
    }

    public static org.telegram.ui.Components.n41 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(j31.class);
        K.d = i7;
        K.k = i12;
        K.m = charSequence;
        K.n = charSequence2;
        K.o = charSequence3;
        K.C = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        long j3 = n41Var.C;
        int i7 = (int) j3;
        int i10 = (int) (j3 >>> 32);
        k31 k31Var = (k31) view;
        int i11 = n41Var.k;
        CharSequence charSequence = n41Var.m;
        CharSequence charSequence2 = n41Var.n;
        CharSequence charSequence3 = n41Var.o;
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

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new k31(context, i6Var);
    }
}
