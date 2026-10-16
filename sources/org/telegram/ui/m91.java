package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class m91 extends org.telegram.ui.Components.l61 {
    static {
        org.telegram.ui.Components.l61.setup(new m91());
    }

    public static org.telegram.ui.Components.m61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(m91.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        n91 n91Var = (n91) view;
        CharSequence charSequence = m61Var.l;
        CharSequence charSequence2 = m61Var.m;
        CharSequence charSequence3 = m61Var.n;
        View.OnClickListener onClickListener = m61Var.D;
        CharSequence charSequence4 = m61Var.o;
        View.OnClickListener onClickListener2 = m61Var.E;
        di.d dVar = n91Var.e;
        org.telegram.ui.Components.da0 da0Var = n91Var.b;
        da0Var.setText(Emoji.replaceEmoji(charSequence, da0Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.da0 da0Var2 = n91Var.c;
        da0Var2.setText(Emoji.replaceEmoji(charSequence2, da0Var2.getPaint().getFontMetricsInt(), false));
        di.d dVar2 = n91Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new n91(context, c6Var);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }
}
