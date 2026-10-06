package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class hh1 extends org.telegram.ui.Components.g61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new hh1());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        ih1 ih1Var = (ih1) view;
        int i10 = h61Var.k;
        CharSequence charSequence = h61Var.l;
        CharSequence charSequence2 = h61Var.m;
        boolean z11 = h61Var.q;
        boolean z12 = h61Var.r;
        int i11 = h61Var.z;
        TextView textView = ih1Var.d;
        TextView textView2 = ih1Var.e;
        ImageView imageView = ih1Var.f;
        ih1Var.h = z11;
        ih1Var.n = z12;
        ImageView imageView2 = ih1Var.b;
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
        ih1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.d6 d6Var = ih1Var.a;
        int v02 = org.telegram.ui.ActionBar.i6.v0(ih1Var.n ? org.telegram.ui.ActionBar.i6.q7 : ih1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(ih1Var.n ? org.telegram.ui.ActionBar.i6.q7 : ih1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, d6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(ih1Var.n ? org.telegram.ui.ActionBar.i6.p7 : ih1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, d6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(ih1Var.n ? org.telegram.ui.ActionBar.i6.p7 : ih1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.y6, d6Var));
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ih1(context, d6Var);
    }
}
