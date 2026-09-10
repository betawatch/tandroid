package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i91 extends org.telegram.ui.Components.u51 {
    static {
        org.telegram.ui.Components.u51.setup(new i91());
    }

    public static org.telegram.ui.Components.v51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(i91.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        j91 j91Var = (j91) view;
        CharSequence charSequence = v51Var.l;
        CharSequence charSequence2 = v51Var.m;
        CharSequence charSequence3 = v51Var.n;
        View.OnClickListener onClickListener = v51Var.D;
        CharSequence charSequence4 = v51Var.o;
        View.OnClickListener onClickListener2 = v51Var.E;
        bi.d dVar = j91Var.e;
        org.telegram.ui.Components.m90 m90Var = j91Var.b;
        m90Var.setText(Emoji.replaceEmoji(charSequence, m90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.m90 m90Var2 = j91Var.c;
        m90Var2.setText(Emoji.replaceEmoji(charSequence2, m90Var2.getPaint().getFontMetricsInt(), false));
        bi.d dVar2 = j91Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j91(context, f6Var);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
