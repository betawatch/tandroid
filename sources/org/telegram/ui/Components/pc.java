package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class pc extends nb {
    public final k9 a;
    public final x90 b;
    public final x90 c;
    public final LinearLayout d;

    public pc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var);
        k9 k9Var = new k9(context, false);
        this.a = k9Var;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(k9Var, w7.z5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.z5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
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
            x90 x90Var = new x90(context, null);
            this.c = x90Var;
            x90Var.setTypeface(typeface);
            x90Var.setTextSize(1, 12.0f);
            x90Var.setEllipsize(truncateAt);
            x90Var.setSingleLine(false);
            x90Var.setMaxLines(3);
            x90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
            linearLayout.addView(x90Var, w7.z5.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            xb xbVar2 = new xb(context, 1, null);
            this.b = xbVar2;
            NotificationCenter.listenEmojiLoading(xbVar2);
            xbVar2.setTypeface(Typeface.SANS_SERIF);
            xbVar2.setTextSize(1, 15.0f);
            xbVar2.setEllipsize(TextUtils.TruncateAt.END);
            xbVar2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            xbVar2.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(xbVar2, w7.z5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
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
        x90 x90Var = this.c;
        if (x90Var != null) {
            x90Var.setTextColor(i10);
        }
    }
}
