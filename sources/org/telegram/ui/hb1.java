package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class hb1 extends org.telegram.ui.Components.n41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.n41.h(new hb1());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        ib1 ib1Var = (ib1) view;
        int i7 = o41Var.k;
        CharSequence charSequence = o41Var.m;
        CharSequence charSequence2 = o41Var.n;
        boolean z11 = o41Var.r;
        boolean z12 = o41Var.s;
        int i10 = o41Var.A;
        TextView textView = ib1Var.e;
        ImageView imageView = ib1Var.f;
        ib1Var.h = z11;
        ib1Var.n = z12;
        ib1Var.b.setImageResource(i7);
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        ib1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int L = org.telegram.messenger.g0.L(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        ib1Var.c.setPadding(0, L, 0, L);
        ib1Var.updateColors();
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new ib1(context, h6Var);
    }
}
