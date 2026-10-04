package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class jh1 extends org.telegram.ui.Components.f61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.f61.setup(new jh1());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        kh1 kh1Var = (kh1) view;
        int i10 = g61Var.k;
        CharSequence charSequence = g61Var.l;
        CharSequence charSequence2 = g61Var.m;
        boolean z11 = g61Var.q;
        boolean z12 = g61Var.r;
        int i11 = g61Var.z;
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
        int v02 = org.telegram.ui.ActionBar.i6.v0(kh1Var.n ? org.telegram.ui.ActionBar.i6.q7 : kh1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(kh1Var.n ? org.telegram.ui.ActionBar.i6.q7 : kh1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, d6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(kh1Var.n ? org.telegram.ui.ActionBar.i6.p7 : kh1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, d6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(kh1Var.n ? org.telegram.ui.ActionBar.i6.p7 : kh1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.y6, d6Var));
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new kh1(context, d6Var);
    }
}
