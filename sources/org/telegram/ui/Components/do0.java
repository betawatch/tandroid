package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class do0 extends LinearLayout {
    public final mu0 a;
    public final TextView b;
    public final TextView c;

    public do0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        setLayoutParams(new f2.a1(-1, -2));
        setOrientation(0);
        setGravity(16);
        int dp = AndroidUtilities.dp(14.0f);
        int i9 = dp / 2;
        setPadding(dp, i9, dp, i9);
        mu0 mu0Var = new mu0(context);
        this.a = mu0Var;
        addView(mu0Var, g7.e6.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        int i10 = org.telegram.ui.ActionBar.f6.E8;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), 102));
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
