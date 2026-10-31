package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vb extends ta {
    public final u8 a;
    public final p80 b;
    public final p80 c;
    public final LinearLayout d;

    public vb(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var);
        u8 u8Var = new u8(context, false);
        this.a = u8Var;
        u8Var.setStyle(11);
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(18.0f));
        addView(u8Var, w7.b6.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.b6.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            kg.t1 t1Var = new kg.t1(3, context, null);
            this.b = t1Var;
            org.telegram.messenger.zs.i(t1Var);
            Typeface typeface = Typeface.SANS_SERIF;
            t1Var.setTypeface(typeface);
            t1Var.setTextSize(1, 14.0f);
            t1Var.setTypeface(org.telegram.messenger.i0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            t1Var.setEllipsize(truncateAt);
            t1Var.setMaxLines(1);
            linearLayout.addView(t1Var);
            p80 p80Var = new p80(context, null);
            this.c = p80Var;
            p80Var.setTypeface(typeface);
            p80Var.setTextSize(1, 12.0f);
            p80Var.setEllipsize(truncateAt);
            p80Var.setSingleLine(false);
            p80Var.setMaxLines(3);
            org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.uj, p6Var);
            linearLayout.addView(p80Var, w7.b6.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            kg.t1 t1Var2 = new kg.t1(2, context, null);
            this.b = t1Var2;
            org.telegram.messenger.zs.i(t1Var2);
            t1Var2.setTypeface(Typeface.SANS_SERIF);
            t1Var2.setTextSize(1, 15.0f);
            t1Var2.setEllipsize(TextUtils.TruncateAt.END);
            t1Var2.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
            t1Var2.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            addView(t1Var2, w7.b6.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.a7.H(this.b, org.telegram.ui.ActionBar.t6.uj, p6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
    }

    @Override // org.telegram.ui.Components.bb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
        p80 p80Var = this.c;
        if (p80Var != null) {
            p80Var.setTextColor(i10);
        }
    }
}
