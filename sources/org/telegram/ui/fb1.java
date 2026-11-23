package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fb1 extends org.telegram.ui.Components.m41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.m41.h(new fb1());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        gb1 gb1Var = (gb1) view;
        int i7 = n41Var.k;
        CharSequence charSequence = n41Var.m;
        CharSequence charSequence2 = n41Var.n;
        boolean z11 = n41Var.r;
        boolean z12 = n41Var.s;
        int i10 = n41Var.A;
        TextView textView = gb1Var.e;
        ImageView imageView = gb1Var.f;
        gb1Var.h = z11;
        gb1Var.n = z12;
        gb1Var.b.setImageResource(i7);
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        gb1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int L = org.telegram.messenger.g0.L(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        gb1Var.c.setPadding(0, L, 0, L);
        gb1Var.updateColors();
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new gb1(context, i6Var);
    }
}
