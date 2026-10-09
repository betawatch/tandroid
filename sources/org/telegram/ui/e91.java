package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class e91 extends org.telegram.ui.Components.o61 {
    static {
        org.telegram.ui.Components.o61.setup(new e91());
    }

    public static org.telegram.ui.Components.p61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.p61 J = org.telegram.ui.Components.p61.J(e91.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        long j3 = p61Var.B;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        f91 f91Var = (f91) view;
        int i12 = p61Var.k;
        CharSequence charSequence = p61Var.l;
        CharSequence charSequence2 = p61Var.m;
        CharSequence charSequence3 = p61Var.n;
        TextView textView = f91Var.e;
        TextView textView2 = f91Var.f;
        f91Var.n = (i10 == 0 && i11 == 0) ? false : true;
        f91Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        f91Var.b.b(i10, i11);
        f91Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        f91Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        f91Var.setValue(charSequence3);
        f91Var.e();
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new f91(context, e6Var);
    }
}
