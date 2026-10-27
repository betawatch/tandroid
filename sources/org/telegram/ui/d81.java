package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d81 extends org.telegram.ui.Components.t61 {
    static {
        org.telegram.ui.Components.t61.setup(new d81());
    }

    public static org.telegram.ui.Components.u61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.u61 K = org.telegram.ui.Components.u61.K(d81.class);
        K.l = str;
        K.m = charSequence;
        K.n = str2;
        K.D = onClickListener;
        K.o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        e81 e81Var = (e81) view;
        CharSequence charSequence = u61Var.l;
        CharSequence charSequence2 = u61Var.m;
        CharSequence charSequence3 = u61Var.n;
        View.OnClickListener onClickListener = u61Var.D;
        CharSequence charSequence4 = u61Var.o;
        View.OnClickListener onClickListener2 = u61Var.E;
        fi.d dVar = e81Var.e;
        org.telegram.ui.Components.aa0 aa0Var = e81Var.b;
        aa0Var.setText(Emoji.replaceEmoji(charSequence, aa0Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.aa0 aa0Var2 = e81Var.c;
        aa0Var2.setText(Emoji.replaceEmoji(charSequence2, aa0Var2.getPaint().getFontMetricsInt(), false));
        fi.d dVar2 = e81Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new e81(context, u6Var);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean isClickable() {
        return false;
    }
}
