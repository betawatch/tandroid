package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ib1 extends org.telegram.ui.Components.w31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.w31.h(new ib1());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        jb1 jb1Var = (jb1) view;
        int i7 = x31Var.k;
        CharSequence charSequence = x31Var.l;
        CharSequence charSequence2 = x31Var.m;
        boolean z10 = x31Var.q;
        boolean z11 = x31Var.r;
        int i10 = x31Var.z;
        TextView textView = jb1Var.e;
        ImageView imageView = jb1Var.f;
        jb1Var.h = z10;
        jb1Var.n = z11;
        jb1Var.b.setImageResource(i7);
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        jb1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int L = org.telegram.messenger.g0.L(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        jb1Var.c.setPadding(0, L, 0, L);
        jb1Var.updateColors();
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new jb1(context, h6Var);
    }
}
