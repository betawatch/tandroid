package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lg1 extends org.telegram.ui.Components.v41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.v41.setup(new lg1());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        mg1 mg1Var = (mg1) view;
        int i10 = w41Var.k;
        CharSequence charSequence = w41Var.l;
        CharSequence charSequence2 = w41Var.m;
        boolean z11 = w41Var.q;
        boolean z12 = w41Var.r;
        int i11 = w41Var.z;
        TextView textView = mg1Var.d;
        TextView textView2 = mg1Var.e;
        ImageView imageView = mg1Var.f;
        mg1Var.h = z11;
        mg1Var.n = z12;
        ImageView imageView2 = mg1Var.b;
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
        mg1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.c6 c6Var = mg1Var.a;
        int v02 = org.telegram.ui.ActionBar.g6.v0(mg1Var.n ? org.telegram.ui.ActionBar.g6.q7 : mg1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.G6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(mg1Var.n ? org.telegram.ui.ActionBar.g6.q7 : mg1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.G6, c6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(mg1Var.n ? org.telegram.ui.ActionBar.g6.p7 : mg1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(mg1Var.n ? org.telegram.ui.ActionBar.g6.p7 : mg1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.y6, c6Var));
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new mg1(context, c6Var);
    }
}
