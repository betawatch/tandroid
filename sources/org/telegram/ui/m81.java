package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m81 extends org.telegram.ui.Components.h51 {
    static {
        org.telegram.ui.Components.h51.setup(new m81());
    }

    public static org.telegram.ui.Components.i51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(m81.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        n81 n81Var = (n81) view;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        CharSequence charSequence3 = i51Var.n;
        View.OnClickListener onClickListener = i51Var.D;
        CharSequence charSequence4 = i51Var.o;
        View.OnClickListener onClickListener2 = i51Var.E;
        ph.d dVar = n81Var.e;
        org.telegram.ui.Components.e90 e90Var = n81Var.b;
        e90Var.setText(Emoji.replaceEmoji(charSequence, e90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.e90 e90Var2 = n81Var.c;
        e90Var2.setText(Emoji.replaceEmoji(charSequence2, e90Var2.getPaint().getFontMetricsInt(), false));
        ph.d dVar2 = n81Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new n81(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
