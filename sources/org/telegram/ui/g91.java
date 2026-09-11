package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class g91 extends org.telegram.ui.Components.g51 {
    static {
        org.telegram.ui.Components.g51.setup(new g91());
    }

    public static org.telegram.ui.Components.h51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(g91.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        h91 h91Var = (h91) view;
        CharSequence charSequence = h51Var.l;
        CharSequence charSequence2 = h51Var.m;
        CharSequence charSequence3 = h51Var.n;
        View.OnClickListener onClickListener = h51Var.D;
        CharSequence charSequence4 = h51Var.o;
        View.OnClickListener onClickListener2 = h51Var.E;
        di.d dVar = h91Var.e;
        org.telegram.ui.Components.d90 d90Var = h91Var.b;
        d90Var.setText(Emoji.replaceEmoji(charSequence, d90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.d90 d90Var2 = h91Var.c;
        d90Var2.setText(Emoji.replaceEmoji(charSequence2, d90Var2.getPaint().getFontMetricsInt(), false));
        di.d dVar2 = h91Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h91(context, f6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
