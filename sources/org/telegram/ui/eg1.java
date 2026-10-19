package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class eg1 extends org.telegram.ui.Components.f61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.f61.setup(new eg1());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.b71 b71Var) {
        fg1 fg1Var = (fg1) view;
        int i10 = g61Var.k;
        CharSequence charSequence = g61Var.l;
        CharSequence charSequence2 = g61Var.m;
        boolean z11 = g61Var.q;
        boolean z12 = g61Var.r;
        int i11 = g61Var.z;
        TextView textView = fg1Var.d;
        TextView textView2 = fg1Var.e;
        ImageView imageView = fg1Var.f;
        fg1Var.h = z11;
        fg1Var.n = z12;
        ImageView imageView2 = fg1Var.b;
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
        fg1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.d6 d6Var = fg1Var.a;
        int w02 = org.telegram.ui.ActionBar.h6.w0(fg1Var.n ? org.telegram.ui.ActionBar.h6.q7 : fg1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.G6, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(fg1Var.n ? org.telegram.ui.ActionBar.h6.q7 : fg1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.G6, d6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(fg1Var.n ? org.telegram.ui.ActionBar.h6.p7 : fg1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.G6, d6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(fg1Var.n ? org.telegram.ui.ActionBar.h6.p7 : fg1Var.h ? org.telegram.ui.ActionBar.h6.n6 : org.telegram.ui.ActionBar.h6.y6, d6Var));
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new fg1(context, d6Var);
    }
}
