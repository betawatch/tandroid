package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fh1 extends org.telegram.ui.Components.g51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new fh1());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        gh1 gh1Var = (gh1) view;
        int i10 = h51Var.k;
        CharSequence charSequence = h51Var.l;
        CharSequence charSequence2 = h51Var.m;
        boolean z10 = h51Var.q;
        boolean z11 = h51Var.r;
        int i11 = h51Var.z;
        TextView textView = gh1Var.d;
        TextView textView2 = gh1Var.e;
        ImageView imageView = gh1Var.f;
        gh1Var.h = z10;
        gh1Var.n = z11;
        ImageView imageView2 = gh1Var.b;
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
        gh1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.g6 g6Var = gh1Var.a;
        int v02 = org.telegram.ui.ActionBar.k6.v0(gh1Var.n ? org.telegram.ui.ActionBar.k6.q7 : gh1Var.h ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.G6, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(gh1Var.n ? org.telegram.ui.ActionBar.k6.q7 : gh1Var.h ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.G6, g6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(gh1Var.n ? org.telegram.ui.ActionBar.k6.p7 : gh1Var.h ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.G6, g6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(gh1Var.n ? org.telegram.ui.ActionBar.k6.p7 : gh1Var.h ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.y6, g6Var));
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new gh1(context, g6Var);
    }
}
