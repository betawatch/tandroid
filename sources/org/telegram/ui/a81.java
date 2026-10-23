package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class a81 extends org.telegram.ui.Components.l61 {
    static {
        org.telegram.ui.Components.l61.setup(new a81());
    }

    public static org.telegram.ui.Components.m61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(a81.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        b81 b81Var = (b81) view;
        CharSequence charSequence = m61Var.l;
        CharSequence charSequence2 = m61Var.m;
        CharSequence charSequence3 = m61Var.n;
        View.OnClickListener onClickListener = m61Var.D;
        CharSequence charSequence4 = m61Var.o;
        View.OnClickListener onClickListener2 = m61Var.E;
        ei.d dVar = b81Var.e;
        org.telegram.ui.Components.y90 y90Var = b81Var.b;
        y90Var.setText(Emoji.replaceEmoji(charSequence, y90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.y90 y90Var2 = b81Var.c;
        y90Var2.setText(Emoji.replaceEmoji(charSequence2, y90Var2.getPaint().getFontMetricsInt(), false));
        ei.d dVar2 = b81Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new b81(context, g6Var);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }
}
