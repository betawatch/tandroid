package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i31 extends org.telegram.ui.Components.a41 {
    static {
        org.telegram.ui.Components.a41.h(new i31());
    }

    public static org.telegram.ui.Components.b41 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(i31.class);
        K.l = str;
        K.m = charSequence;
        K.n = str2;
        K.D = onClickListener;
        K.o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        j31 j31Var = (j31) view;
        CharSequence charSequence = b41Var.l;
        CharSequence charSequence2 = b41Var.m;
        CharSequence charSequence3 = b41Var.n;
        View.OnClickListener onClickListener = b41Var.D;
        CharSequence charSequence4 = b41Var.o;
        View.OnClickListener onClickListener2 = b41Var.E;
        hi.d dVar = j31Var.e;
        org.telegram.ui.Components.z70 z70Var = j31Var.b;
        z70Var.setText(org.telegram.messenger.j6.m(charSequence, z70Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.z70 z70Var2 = j31Var.c;
        z70Var2.setText(org.telegram.messenger.j6.m(charSequence2, z70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        hi.d dVar2 = j31Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new j31(context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return false;
    }
}
