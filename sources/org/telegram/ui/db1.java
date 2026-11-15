package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class db1 extends org.telegram.ui.Components.a41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.a41.h(new db1());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        eb1 eb1Var = (eb1) view;
        int i7 = b41Var.k;
        CharSequence charSequence = b41Var.l;
        CharSequence charSequence2 = b41Var.m;
        boolean z11 = b41Var.q;
        boolean z12 = b41Var.r;
        int i10 = b41Var.z;
        TextView textView = eb1Var.e;
        ImageView imageView = eb1Var.f;
        eb1Var.h = z11;
        eb1Var.n = z12;
        eb1Var.b.setImageResource(i7);
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        eb1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int L = org.telegram.messenger.g0.L(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        eb1Var.c.setPadding(0, L, 0, L);
        eb1Var.updateColors();
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new eb1(context, e6Var);
    }
}
