package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jg1 extends org.telegram.ui.Components.k41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.k41.setup(new jg1());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        kg1 kg1Var = (kg1) view;
        int i9 = l41Var.k;
        CharSequence charSequence = l41Var.l;
        CharSequence charSequence2 = l41Var.m;
        boolean z11 = l41Var.q;
        boolean z12 = l41Var.r;
        int i10 = l41Var.z;
        TextView textView = kg1Var.d;
        TextView textView2 = kg1Var.e;
        ImageView imageView = kg1Var.f;
        kg1Var.h = z11;
        kg1Var.n = z12;
        ImageView imageView2 = kg1Var.b;
        imageView2.setImageResource(i9);
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView2.setText(charSequence2);
        textView2.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int dp = AndroidUtilities.dp(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        kg1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.b6 b6Var = kg1Var.a;
        int v02 = org.telegram.ui.ActionBar.f6.v0(kg1Var.n ? org.telegram.ui.ActionBar.f6.q7 : kg1Var.h ? org.telegram.ui.ActionBar.f6.n6 : org.telegram.ui.ActionBar.f6.G6, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(kg1Var.n ? org.telegram.ui.ActionBar.f6.q7 : kg1Var.h ? org.telegram.ui.ActionBar.f6.n6 : org.telegram.ui.ActionBar.f6.G6, b6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(kg1Var.n ? org.telegram.ui.ActionBar.f6.p7 : kg1Var.h ? org.telegram.ui.ActionBar.f6.n6 : org.telegram.ui.ActionBar.f6.G6, b6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(kg1Var.n ? org.telegram.ui.ActionBar.f6.p7 : kg1Var.h ? org.telegram.ui.ActionBar.f6.n6 : org.telegram.ui.ActionBar.f6.y6, b6Var));
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new kg1(context, b6Var);
    }
}
