package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hb1 extends org.telegram.ui.Components.x31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.x31.h(new hb1());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        ib1 ib1Var = (ib1) view;
        int i7 = y31Var.k;
        CharSequence charSequence = y31Var.l;
        CharSequence charSequence2 = y31Var.m;
        boolean z10 = y31Var.q;
        boolean z11 = y31Var.r;
        int i10 = y31Var.z;
        TextView textView = ib1Var.e;
        ImageView imageView = ib1Var.f;
        ib1Var.h = z10;
        ib1Var.n = z11;
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

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new ib1(context, g6Var);
    }
}
