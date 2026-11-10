package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ac extends ya {
    public final y8 a;
    public final w70 b;
    public final w70 c;
    public final LinearLayout d;

    public ac(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context, h6Var);
        y8 y8Var = new y8(context, false);
        this.a = y8Var;
        y8Var.setStyle(11);
        y8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(y8Var, c8.ha.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z9) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, c8.ha.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            ib ibVar = new ib(2, context, null);
            this.b = ibVar;
            org.telegram.messenger.qs.i(ibVar);
            Typeface typeface = Typeface.SANS_SERIF;
            ibVar.setTypeface(typeface);
            ibVar.setTextSize(1, 14.0f);
            ibVar.setTypeface(org.telegram.messenger.g0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            ibVar.setEllipsize(truncateAt);
            ibVar.setMaxLines(1);
            linearLayout.addView(ibVar);
            w70 w70Var = new w70(context, null);
            this.c = w70Var;
            w70Var.setTypeface(typeface);
            w70Var.setTextSize(1, 12.0f);
            w70Var.setEllipsize(truncateAt);
            w70Var.setSingleLine(false);
            w70Var.setMaxLines(3);
            org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.uj, h6Var);
            linearLayout.addView(w70Var, c8.ha.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            ib ibVar2 = new ib(1, context, null);
            this.b = ibVar2;
            org.telegram.messenger.qs.i(ibVar2);
            ibVar2.setTypeface(Typeface.SANS_SERIF);
            ibVar2.setTextSize(1, 15.0f);
            ibVar2.setEllipsize(TextUtils.TruncateAt.END);
            ibVar2.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            ibVar2.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
            addView(ibVar2, c8.ha.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.t6.G(this.b, org.telegram.ui.ActionBar.m6.uj, h6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
    }

    @Override // org.telegram.ui.Components.fb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i7) {
        this.b.setTextColor(i7);
        w70 w70Var = this.c;
        if (w70Var != null) {
            w70Var.setTextColor(i7);
        }
    }
}
