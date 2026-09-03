package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fh1 extends org.telegram.ui.Components.h51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new fh1());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        gh1 gh1Var = (gh1) view;
        int i10 = i51Var.k;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        boolean z10 = i51Var.q;
        boolean z11 = i51Var.r;
        int i11 = i51Var.z;
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
        org.telegram.ui.ActionBar.f6 f6Var = gh1Var.a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(gh1Var.n ? org.telegram.ui.ActionBar.j6.q7 : gh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.G6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(gh1Var.n ? org.telegram.ui.ActionBar.j6.q7 : gh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.G6, f6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(gh1Var.n ? org.telegram.ui.ActionBar.j6.p7 : gh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.G6, f6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(gh1Var.n ? org.telegram.ui.ActionBar.j6.p7 : gh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, f6Var));
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new gh1(context, f6Var);
    }
}
