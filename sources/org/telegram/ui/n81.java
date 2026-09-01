package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n81 extends org.telegram.ui.Components.i51 {
    static {
        org.telegram.ui.Components.i51.setup(new n81());
    }

    public static org.telegram.ui.Components.j51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(n81.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        o81 o81Var = (o81) view;
        CharSequence charSequence = j51Var.l;
        CharSequence charSequence2 = j51Var.m;
        CharSequence charSequence3 = j51Var.n;
        View.OnClickListener onClickListener = j51Var.D;
        CharSequence charSequence4 = j51Var.o;
        View.OnClickListener onClickListener2 = j51Var.E;
        qh.d dVar = o81Var.e;
        org.telegram.ui.Components.g90 g90Var = o81Var.b;
        g90Var.setText(Emoji.replaceEmoji(charSequence, g90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.g90 g90Var2 = o81Var.c;
        g90Var2.setText(Emoji.replaceEmoji(charSequence2, g90Var2.getPaint().getFontMetricsInt(), false));
        qh.d dVar2 = o81Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new o81(context, g6Var);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean isClickable() {
        return false;
    }
}
