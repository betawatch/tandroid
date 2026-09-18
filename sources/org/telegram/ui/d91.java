package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class d91 extends org.telegram.ui.Components.w51 {
    static {
        org.telegram.ui.Components.w51.setup(new d91());
    }

    public static org.telegram.ui.Components.x51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.x51 J = org.telegram.ui.Components.x51.J(d91.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        e91 e91Var = (e91) view;
        CharSequence charSequence = x51Var.l;
        CharSequence charSequence2 = x51Var.m;
        CharSequence charSequence3 = x51Var.n;
        View.OnClickListener onClickListener = x51Var.D;
        CharSequence charSequence4 = x51Var.o;
        View.OnClickListener onClickListener2 = x51Var.E;
        ci.d dVar = e91Var.e;
        org.telegram.ui.Components.l90 l90Var = e91Var.b;
        l90Var.setText(Emoji.replaceEmoji(charSequence, l90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.l90 l90Var2 = e91Var.c;
        l90Var2.setText(Emoji.replaceEmoji(charSequence2, l90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = e91Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, org.telegram.ui.Components.wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new e91(context, e6Var);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean isClickable() {
        return false;
    }
}
