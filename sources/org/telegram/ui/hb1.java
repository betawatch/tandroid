package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hb1 extends org.telegram.ui.Components.k41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.k41.h(new hb1());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        ib1 ib1Var = (ib1) view;
        int i7 = l41Var.k;
        CharSequence charSequence = l41Var.m;
        CharSequence charSequence2 = l41Var.n;
        boolean z11 = l41Var.r;
        boolean z12 = l41Var.s;
        int i10 = l41Var.A;
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

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new ib1(context, i6Var);
    }
}
