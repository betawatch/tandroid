package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b81 extends org.telegram.ui.Components.s61 {
    static {
        org.telegram.ui.Components.s61.setup(new b81());
    }

    public static org.telegram.ui.Components.t61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(b81.class);
        K.l = str;
        K.m = charSequence;
        K.n = str2;
        K.D = onClickListener;
        K.o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        c81 c81Var = (c81) view;
        CharSequence charSequence = t61Var.l;
        CharSequence charSequence2 = t61Var.m;
        CharSequence charSequence3 = t61Var.n;
        View.OnClickListener onClickListener = t61Var.D;
        CharSequence charSequence4 = t61Var.o;
        View.OnClickListener onClickListener2 = t61Var.E;
        fi.d dVar = c81Var.e;
        org.telegram.ui.Components.z90 z90Var = c81Var.b;
        z90Var.setText(Emoji.replaceEmoji(charSequence, z90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.z90 z90Var2 = c81Var.c;
        z90Var2.setText(Emoji.replaceEmoji(charSequence2, z90Var2.getPaint().getFontMetricsInt(), false));
        fi.d dVar2 = c81Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new c81(context, u6Var);
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean isClickable() {
        return false;
    }
}
