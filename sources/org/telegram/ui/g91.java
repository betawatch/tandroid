package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class g91 extends org.telegram.ui.Components.x51 {
    static {
        org.telegram.ui.Components.x51.setup(new g91());
    }

    public static org.telegram.ui.Components.y51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.y51 J = org.telegram.ui.Components.y51.J(g91.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        h91 h91Var = (h91) view;
        CharSequence charSequence = y51Var.l;
        CharSequence charSequence2 = y51Var.m;
        CharSequence charSequence3 = y51Var.n;
        View.OnClickListener onClickListener = y51Var.D;
        CharSequence charSequence4 = y51Var.o;
        View.OnClickListener onClickListener2 = y51Var.E;
        ci.d dVar = h91Var.e;
        org.telegram.ui.Components.n90 n90Var = h91Var.b;
        n90Var.setText(Emoji.replaceEmoji(charSequence, n90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.n90 n90Var2 = h91Var.c;
        n90Var2.setText(Emoji.replaceEmoji(charSequence2, n90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = h91Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h91(context, f6Var);
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean isClickable() {
        return false;
    }
}
