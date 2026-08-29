package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lc extends jb {
    public final h9 a;
    public final y80 b;
    public final y80 c;
    public final LinearLayout d;

    public lc(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var);
        h9 h9Var = new h9(context, false);
        this.a = h9Var;
        h9Var.setStyle(11);
        h9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(h9Var, i7.f6.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, i7.f6.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            cg.c2 c2Var = new cg.c2(context, 4, null);
            this.b = c2Var;
            NotificationCenter.listenEmojiLoading(c2Var);
            Typeface typeface = Typeface.SANS_SERIF;
            c2Var.setTypeface(typeface);
            c2Var.setTextSize(1, 14.0f);
            c2Var.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c2Var.setEllipsize(truncateAt);
            c2Var.setMaxLines(1);
            linearLayout.addView(c2Var);
            y80 y80Var = new y80(context, null);
            this.c = y80Var;
            y80Var.setTypeface(typeface);
            y80Var.setTextSize(1, 12.0f);
            y80Var.setEllipsize(truncateAt);
            y80Var.setSingleLine(false);
            y80Var.setMaxLines(3);
            y80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
            linearLayout.addView(y80Var, i7.f6.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            cg.c2 c2Var2 = new cg.c2(context, 3, null);
            this.b = c2Var2;
            NotificationCenter.listenEmojiLoading(c2Var2);
            c2Var2.setTypeface(Typeface.SANS_SERIF);
            c2Var2.setTextSize(1, 15.0f);
            c2Var2.setEllipsize(TextUtils.TruncateAt.END);
            c2Var2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            c2Var2.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(c2Var2, i7.f6.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        this.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
    }

    @Override // org.telegram.ui.Components.rb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
        y80 y80Var = this.c;
        if (y80Var != null) {
            y80Var.setTextColor(i10);
        }
    }
}
