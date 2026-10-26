package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pc extends nb {
    public final m9 a;
    public final z90 b;
    public final z90 c;
    public final LinearLayout d;

    public pc(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var);
        m9 m9Var = new m9(context, false);
        this.a = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(m9Var, gb1.m(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, gb1.m(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
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
            z90 z90Var = new z90(context, null);
            this.c = z90Var;
            z90Var.setTypeface(typeface);
            z90Var.setTextSize(1, 12.0f);
            z90Var.setEllipsize(truncateAt);
            z90Var.setSingleLine(false);
            z90Var.setMaxLines(3);
            org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.Gi, u6Var);
            linearLayout.addView(z90Var, gb1.x(-2, -2, 0, 0, 0, 0, 0));
        } else {
            xb xbVar2 = new xb(context, 1, null);
            this.b = xbVar2;
            NotificationCenter.listenEmojiLoading(xbVar2);
            xbVar2.setTypeface(Typeface.SANS_SERIF);
            xbVar2.setTextSize(1, 15.0f);
            xbVar2.setEllipsize(TextUtils.TruncateAt.END);
            xbVar2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            xbVar2.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(xbVar2, gb1.m(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.f7.H(this.b, org.telegram.ui.ActionBar.y6.Gi, u6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
        z90 z90Var = this.c;
        if (z90Var != null) {
            z90Var.setTextColor(i10);
        }
    }
}
