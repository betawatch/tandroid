package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class fc extends eb {
    public final e9 a;
    public final m80 b;
    public final m80 c;
    public final LinearLayout d;

    public fc(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context, h6Var);
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
            bi.u2 u2Var = new bi.u2(5, context, null);
            this.b = u2Var;
            org.telegram.messenger.ls.i(u2Var);
            Typeface typeface = Typeface.SANS_SERIF;
            u2Var.setTypeface(typeface);
            u2Var.setTextSize(1, 14.0f);
            u2Var.setTypeface(org.telegram.messenger.g0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            u2Var.setEllipsize(truncateAt);
            u2Var.setMaxLines(1);
            linearLayout.addView(u2Var);
            m80 m80Var = new m80(context, null);
            this.c = m80Var;
            m80Var.setTypeface(typeface);
            m80Var.setTextSize(1, 12.0f);
            m80Var.setEllipsize(truncateAt);
            m80Var.setSingleLine(false);
            m80Var.setMaxLines(3);
            org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.xj, h6Var);
            linearLayout.addView(m80Var, c8.ma.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            bi.u2 u2Var2 = new bi.u2(4, context, null);
            this.b = u2Var2;
            org.telegram.messenger.ls.i(u2Var2);
            u2Var2.setTypeface(Typeface.SANS_SERIF);
            u2Var2.setTextSize(1, 15.0f);
            u2Var2.setEllipsize(TextUtils.TruncateAt.END);
            u2Var2.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            u2Var2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
            addView(u2Var2, c8.ma.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.t6.G(this.b, org.telegram.ui.ActionBar.m6.xj, h6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.wj));
    }

    @Override // org.telegram.ui.Components.lb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i7) {
        this.b.setTextColor(i7);
        m80 m80Var = this.c;
        if (m80Var != null) {
            m80Var.setTextColor(i7);
        }
    }
}
