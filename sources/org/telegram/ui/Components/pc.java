package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pc extends nb {
    public final k9 a;
    public final n90 b;
    public final n90 c;
    public final LinearLayout d;

    public pc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var);
        k9 k9Var = new k9(context, false);
        this.a = k9Var;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(k9Var, w7.y5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.y5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            xb xbVar = new xb(context, 2, null);
            this.b = xbVar;
            NotificationCenter.listenEmojiLoading(xbVar);
            Typeface typeface = Typeface.SANS_SERIF;
            xbVar.setTypeface(typeface);
            xbVar.setTextSize(1, 14.0f);
            xbVar.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            xbVar.setEllipsize(truncateAt);
            xbVar.setMaxLines(1);
            linearLayout.addView(xbVar);
            n90 n90Var = new n90(context, null);
            this.c = n90Var;
            n90Var.setTypeface(typeface);
            n90Var.setTextSize(1, 12.0f);
            n90Var.setEllipsize(truncateAt);
            n90Var.setSingleLine(false);
            n90Var.setMaxLines(3);
            n90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
            linearLayout.addView(n90Var, w7.y5.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            xb xbVar2 = new xb(context, 1, null);
            this.b = xbVar2;
            NotificationCenter.listenEmojiLoading(xbVar2);
            xbVar2.setTypeface(Typeface.SANS_SERIF);
            xbVar2.setTextSize(1, 15.0f);
            xbVar2.setEllipsize(TextUtils.TruncateAt.END);
            xbVar2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            xbVar2.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(xbVar2, w7.y5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        this.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
        n90 n90Var = this.c;
        if (n90Var != null) {
            n90Var.setTextColor(i10);
        }
    }
}
