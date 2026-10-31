package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ad1 extends org.telegram.ui.Components.z41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.z41.h(new ad1());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        bd1 bd1Var = (bd1) view;
        int i10 = a51Var.k;
        CharSequence charSequence = a51Var.l;
        CharSequence charSequence2 = a51Var.m;
        boolean z11 = a51Var.q;
        boolean z12 = a51Var.r;
        int i11 = a51Var.z;
        TextView textView = bd1Var.e;
        ImageView imageView = bd1Var.f;
        bd1Var.h = z11;
        bd1Var.n = z12;
        bd1Var.b.setImageResource(i10);
        if (i11 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        bd1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int L = org.telegram.messenger.i0.L(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        bd1Var.c.setPadding(0, L, 0, L);
        bd1Var.updateColors();
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new bd1(context, p6Var);
    }
}
