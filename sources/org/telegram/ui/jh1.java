package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jh1 extends org.telegram.ui.Components.g51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new jh1());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        kh1 kh1Var = (kh1) view;
        int i10 = h51Var.k;
        CharSequence charSequence = h51Var.l;
        CharSequence charSequence2 = h51Var.m;
        boolean z11 = h51Var.q;
        boolean z12 = h51Var.r;
        int i11 = h51Var.z;
        TextView textView = kh1Var.d;
        TextView textView2 = kh1Var.e;
        ImageView imageView = kh1Var.f;
        kh1Var.h = z11;
        kh1Var.n = z12;
        ImageView imageView2 = kh1Var.b;
        imageView2.setImageResource(i10);
        if (i11 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView2.setText(charSequence2);
        textView2.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int dp = AndroidUtilities.dp(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        kh1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.d6 d6Var = kh1Var.a;
        int v02 = org.telegram.ui.ActionBar.h6.v0(kh1Var.n ? org.telegram.ui.ActionBar.h6.q7 : kh1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.G6, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(kh1Var.n ? org.telegram.ui.ActionBar.h6.q7 : kh1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.G6, d6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(kh1Var.n ? org.telegram.ui.ActionBar.h6.p7 : kh1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.G6, d6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(kh1Var.n ? org.telegram.ui.ActionBar.h6.p7 : kh1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.y6, d6Var));
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new kh1(context, d6Var);
    }
}
