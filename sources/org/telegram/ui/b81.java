package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b81 extends org.telegram.ui.Components.t61 {
    static {
        org.telegram.ui.Components.t61.setup(new b81());
    }

    public static org.telegram.ui.Components.u61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.u61 K = org.telegram.ui.Components.u61.K(b81.class);
        K.d = i10;
        K.k = i13;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.B = (i11 & 4294967295L) | (i12 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        long j10 = u61Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        c81 c81Var = (c81) view;
        int i12 = u61Var.k;
        CharSequence charSequence = u61Var.l;
        CharSequence charSequence2 = u61Var.m;
        CharSequence charSequence3 = u61Var.n;
        TextView textView = c81Var.e;
        TextView textView2 = c81Var.f;
        c81Var.n = (i10 == 0 && i11 == 0) ? false : true;
        c81Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        c81Var.b.b(i10, i11);
        c81Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        c81Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        c81Var.setValue(charSequence3);
        c81Var.updateColors();
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new c81(context, u6Var);
    }
}
