package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class k31 extends org.telegram.ui.Components.q31 {
    static {
        org.telegram.ui.Components.q31.h(new k31());
    }

    public static org.telegram.ui.Components.r31 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(k31.class);
        K.l = str;
        K.m = charSequence;
        K.n = str2;
        K.D = onClickListener;
        K.o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z9, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.k41 k41Var) {
        l31 l31Var = (l31) view;
        CharSequence charSequence = r31Var.l;
        CharSequence charSequence2 = r31Var.m;
        CharSequence charSequence3 = r31Var.n;
        View.OnClickListener onClickListener = r31Var.D;
        CharSequence charSequence4 = r31Var.o;
        View.OnClickListener onClickListener2 = r31Var.E;
        fi.d dVar = l31Var.e;
        org.telegram.ui.Components.w70 w70Var = l31Var.b;
        w70Var.setText(org.telegram.messenger.i6.m(charSequence, w70Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.w70 w70Var2 = l31Var.c;
        w70Var2.setText(org.telegram.messenger.i6.m(charSequence2, w70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        fi.d dVar2 = l31Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new l31(context, f6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
