package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g91 extends org.telegram.ui.Components.o61 {
    static {
        org.telegram.ui.Components.o61.setup(new g91());
    }

    public static org.telegram.ui.Components.p61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.p61 J = org.telegram.ui.Components.p61.J(g91.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        h91 h91Var = (h91) view;
        CharSequence charSequence = p61Var.l;
        CharSequence charSequence2 = p61Var.m;
        CharSequence charSequence3 = p61Var.n;
        View.OnClickListener onClickListener = p61Var.D;
        CharSequence charSequence4 = p61Var.o;
        View.OnClickListener onClickListener2 = p61Var.E;
        ci.d dVar = h91Var.e;
        org.telegram.ui.Components.ea0 ea0Var = h91Var.b;
        ea0Var.setText(Emoji.replaceEmoji(charSequence, ea0Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.ea0 ea0Var2 = h91Var.c;
        ea0Var2.setText(Emoji.replaceEmoji(charSequence2, ea0Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = h91Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h91(context, e6Var);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean isClickable() {
        return false;
    }
}
