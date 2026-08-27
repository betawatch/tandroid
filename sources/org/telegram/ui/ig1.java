package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ig1 extends org.telegram.ui.Components.m41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.m41.setup(new ig1());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        jg1 jg1Var = (jg1) view;
        int i10 = n41Var.k;
        CharSequence charSequence = n41Var.l;
        CharSequence charSequence2 = n41Var.m;
        boolean z11 = n41Var.q;
        boolean z12 = n41Var.r;
        int i11 = n41Var.z;
        TextView textView = jg1Var.d;
        TextView textView2 = jg1Var.e;
        ImageView imageView = jg1Var.f;
        jg1Var.h = z11;
        jg1Var.n = z12;
        ImageView imageView2 = jg1Var.b;
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
        jg1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.c6 c6Var = jg1Var.a;
        int v02 = org.telegram.ui.ActionBar.g6.v0(jg1Var.n ? org.telegram.ui.ActionBar.g6.q7 : jg1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.G6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(jg1Var.n ? org.telegram.ui.ActionBar.g6.q7 : jg1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.G6, c6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(jg1Var.n ? org.telegram.ui.ActionBar.g6.p7 : jg1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(jg1Var.n ? org.telegram.ui.ActionBar.g6.p7 : jg1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.y6, c6Var));
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new jg1(context, c6Var);
    }
}
