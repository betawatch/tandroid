package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wb extends va {
    public final w8 a;
    public final z70 b;
    public final z70 c;
    public final LinearLayout d;

    public wb(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var);
        w8 w8Var = new w8(context, false);
        this.a = w8Var;
        w8Var.setStyle(11);
        w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(w8Var, c8.ja.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, c8.ja.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            bi.w1 w1Var = new bi.w1(5, context, null);
            this.b = w1Var;
            org.telegram.messenger.ns.i(w1Var);
            Typeface typeface = Typeface.SANS_SERIF;
            w1Var.setTypeface(typeface);
            w1Var.setTextSize(1, 14.0f);
            w1Var.setTypeface(org.telegram.messenger.g0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            w1Var.setEllipsize(truncateAt);
            w1Var.setMaxLines(1);
            linearLayout.addView(w1Var);
            z70 z70Var = new z70(context, null);
            this.c = z70Var;
            z70Var.setTypeface(typeface);
            z70Var.setTextSize(1, 12.0f);
            z70Var.setEllipsize(truncateAt);
            z70Var.setSingleLine(false);
            z70Var.setMaxLines(3);
            org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.xj, e6Var);
            linearLayout.addView(z70Var, c8.ja.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            bi.w1 w1Var2 = new bi.w1(4, context, null);
            this.b = w1Var2;
            org.telegram.messenger.ns.i(w1Var2);
            w1Var2.setTypeface(Typeface.SANS_SERIF);
            w1Var2.setTextSize(1, 15.0f);
            w1Var2.setEllipsize(TextUtils.TruncateAt.END);
            w1Var2.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            w1Var2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
            addView(w1Var2, c8.ja.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.q6.G(this.b, org.telegram.ui.ActionBar.j6.xj, e6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
    }

    @Override // org.telegram.ui.Components.cb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i7) {
        this.b.setTextColor(i7);
        z70 z70Var = this.c;
        if (z70Var != null) {
            z70Var.setTextColor(i7);
        }
    }
}
