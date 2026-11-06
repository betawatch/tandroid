package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class eb1 extends org.telegram.ui.Components.w31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.w31.h(new eb1());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        fb1 fb1Var = (fb1) view;
        int i7 = x31Var.k;
        CharSequence charSequence = x31Var.l;
        CharSequence charSequence2 = x31Var.m;
        boolean z10 = x31Var.q;
        boolean z11 = x31Var.r;
        int i10 = x31Var.z;
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

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new fb1(context, f6Var);
    }
}
