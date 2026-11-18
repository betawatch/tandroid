package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fc extends eb {
    public final e9 a;
    public final k80 b;
    public final k80 c;
    public final LinearLayout d;

    public fc(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var);
        e9 e9Var = new e9(context, false);
        this.a = e9Var;
        e9Var.setStyle(11);
        e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(e9Var, c8.ma.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, c8.ma.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            bi.q2 q2Var = new bi.q2(5, context, null);
            this.b = q2Var;
            org.telegram.messenger.ks.i(q2Var);
            Typeface typeface = Typeface.SANS_SERIF;
            q2Var.setTypeface(typeface);
            q2Var.setTextSize(1, 14.0f);
            q2Var.setTypeface(org.telegram.messenger.g0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            q2Var.setEllipsize(truncateAt);
            q2Var.setMaxLines(1);
            linearLayout.addView(q2Var);
            k80 k80Var = new k80(context, null);
            this.c = k80Var;
            k80Var.setTypeface(typeface);
            k80Var.setTextSize(1, 12.0f);
            k80Var.setEllipsize(truncateAt);
            k80Var.setSingleLine(false);
            k80Var.setMaxLines(3);
            org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.xj, i6Var);
            linearLayout.addView(k80Var, c8.ma.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            bi.q2 q2Var2 = new bi.q2(4, context, null);
            this.b = q2Var2;
            org.telegram.messenger.ks.i(q2Var2);
            q2Var2.setTypeface(Typeface.SANS_SERIF);
            q2Var2.setTextSize(1, 15.0f);
            q2Var2.setEllipsize(TextUtils.TruncateAt.END);
            q2Var2.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            q2Var2.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
            addView(q2Var2, c8.ma.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.u6.G(this.b, org.telegram.ui.ActionBar.n6.xj, i6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
    }

    @Override // org.telegram.ui.Components.lb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i7) {
        this.b.setTextColor(i7);
        k80 k80Var = this.c;
        if (k80Var != null) {
            k80Var.setTextColor(i7);
        }
    }
}
