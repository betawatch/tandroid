package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zb extends ya {
    public final x8 a;
    public final s70 b;
    public final s70 c;
    public final LinearLayout d;

    public zb(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var);
        x8 x8Var = new x8(context, false);
        this.a = x8Var;
        x8Var.setStyle(11);
        x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(x8Var, b8.mf.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, b8.mf.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            ai.e2 e2Var = new ai.e2(5, context, null);
            this.b = e2Var;
            org.telegram.messenger.hs.i(e2Var);
            Typeface typeface = Typeface.SANS_SERIF;
            e2Var.setTypeface(typeface);
            e2Var.setTextSize(1, 14.0f);
            e2Var.setTypeface(org.telegram.messenger.g0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            e2Var.setEllipsize(truncateAt);
            e2Var.setMaxLines(1);
            linearLayout.addView(e2Var);
            s70 s70Var = new s70(context, null);
            this.c = s70Var;
            s70Var.setTypeface(typeface);
            s70Var.setTextSize(1, 12.0f);
            s70Var.setEllipsize(truncateAt);
            s70Var.setSingleLine(false);
            s70Var.setMaxLines(3);
            org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.uj, e6Var);
            linearLayout.addView(s70Var, b8.mf.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            ai.e2 e2Var2 = new ai.e2(4, context, null);
            this.b = e2Var2;
            org.telegram.messenger.hs.i(e2Var2);
            e2Var2.setTypeface(Typeface.SANS_SERIF);
            e2Var2.setTextSize(1, 15.0f);
            e2Var2.setEllipsize(TextUtils.TruncateAt.END);
            e2Var2.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            e2Var2.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
            addView(e2Var2, b8.mf.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.r6.H(this.b, org.telegram.ui.ActionBar.k6.uj, e6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
    }

    @Override // org.telegram.ui.Components.fb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i3) {
        this.b.setTextColor(i3);
        s70 s70Var = this.c;
        if (s70Var != null) {
            s70Var.setTextColor(i3);
        }
    }
}
