package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class eb1 extends org.telegram.ui.Components.q31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.q31.h(new eb1());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z9, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.k41 k41Var) {
        fb1 fb1Var = (fb1) view;
        int i7 = r31Var.k;
        CharSequence charSequence = r31Var.l;
        CharSequence charSequence2 = r31Var.m;
        boolean z10 = r31Var.q;
        boolean z11 = r31Var.r;
        int i10 = r31Var.z;
        TextView textView = fb1Var.e;
        ImageView imageView = fb1Var.f;
        fb1Var.h = z10;
        fb1Var.n = z11;
        fb1Var.b.setImageResource(i7);
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        fb1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int L = org.telegram.messenger.g0.L(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        fb1Var.c.setPadding(0, L, 0, L);
        fb1Var.updateColors();
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new fb1(context, f6Var);
    }
}
