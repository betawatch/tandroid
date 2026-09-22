package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class e91 extends org.telegram.ui.Components.x51 {
    static {
        org.telegram.ui.Components.x51.setup(new e91());
    }

    public static org.telegram.ui.Components.y51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.y51 J = org.telegram.ui.Components.y51.J(e91.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        long j3 = y51Var.B;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        f91 f91Var = (f91) view;
        int i12 = y51Var.k;
        CharSequence charSequence = y51Var.l;
        CharSequence charSequence2 = y51Var.m;
        CharSequence charSequence3 = y51Var.n;
        TextView textView = f91Var.e;
        TextView textView2 = f91Var.f;
        f91Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        f91Var.b.b(i10, i11);
        f91Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        f91Var.n = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        f91Var.setValue(charSequence3);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f91(context, f6Var);
    }
}
