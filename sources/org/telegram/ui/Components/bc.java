package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class bc extends za {
    public final z8 a;
    public final w70 b;
    public final w70 c;
    public final LinearLayout d;

    public bc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var);
        z8 z8Var = new z8(context, false);
        this.a = z8Var;
        z8Var.setStyle(11);
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(z8Var, c8.ha.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z9) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, c8.ha.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            jb jbVar = new jb(2, context, null);
            this.b = jbVar;
            org.telegram.messenger.qs.i(jbVar);
            Typeface typeface = Typeface.SANS_SERIF;
            jbVar.setTypeface(typeface);
            jbVar.setTextSize(1, 14.0f);
            jbVar.setTypeface(org.telegram.messenger.g0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            jbVar.setEllipsize(truncateAt);
            jbVar.setMaxLines(1);
            linearLayout.addView(jbVar);
            w70 w70Var = new w70(context, null);
            this.c = w70Var;
            w70Var.setTypeface(typeface);
            w70Var.setTextSize(1, 12.0f);
            w70Var.setEllipsize(truncateAt);
            w70Var.setSingleLine(false);
            w70Var.setMaxLines(3);
            org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.uj, f6Var);
            linearLayout.addView(w70Var, c8.ha.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            jb jbVar2 = new jb(1, context, null);
            this.b = jbVar2;
            org.telegram.messenger.qs.i(jbVar2);
            jbVar2.setTypeface(Typeface.SANS_SERIF);
            jbVar2.setTextSize(1, 15.0f);
            jbVar2.setEllipsize(TextUtils.TruncateAt.END);
            jbVar2.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            jbVar2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
            addView(jbVar2, c8.ha.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.r6.H(this.b, org.telegram.ui.ActionBar.k6.uj, f6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
    }

    @Override // org.telegram.ui.Components.gb
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
