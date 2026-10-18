package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class gg1 extends org.telegram.ui.Components.e61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.e61.setup(new gg1());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        hg1 hg1Var = (hg1) view;
        int i10 = f61Var.k;
        CharSequence charSequence = f61Var.l;
        CharSequence charSequence2 = f61Var.m;
        boolean z11 = f61Var.q;
        boolean z12 = f61Var.r;
        int i11 = f61Var.z;
        TextView textView = hg1Var.d;
        TextView textView2 = hg1Var.e;
        ImageView imageView = hg1Var.f;
        hg1Var.h = z11;
        hg1Var.n = z12;
        ImageView imageView2 = hg1Var.b;
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
        hg1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.d6 d6Var = hg1Var.a;
        int w02 = org.telegram.ui.ActionBar.h6.w0(hg1Var.n ? org.telegram.ui.ActionBar.h6.q7 : hg1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.G6, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(hg1Var.n ? org.telegram.ui.ActionBar.h6.q7 : hg1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.G6, d6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(hg1Var.n ? org.telegram.ui.ActionBar.h6.p7 : hg1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.G6, d6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(hg1Var.n ? org.telegram.ui.ActionBar.h6.p7 : hg1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.y6, d6Var));
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hg1(context, d6Var);
    }
}
