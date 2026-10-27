package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pc extends nb {
    public final m9 a;
    public final aa0 b;
    public final aa0 c;
    public final LinearLayout d;

    public pc(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var);
        m9 m9Var = new m9(context, false);
        this.a = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(m9Var, kb1.m(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, kb1.m(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
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
            aa0 aa0Var = new aa0(context, null);
            this.c = aa0Var;
            aa0Var.setTypeface(typeface);
            aa0Var.setTextSize(1, 12.0f);
            aa0Var.setEllipsize(truncateAt);
            aa0Var.setSingleLine(false);
            aa0Var.setMaxLines(3);
            org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.Gi, u6Var);
            linearLayout.addView(aa0Var, kb1.x(-2, -2, 0, 0, 0, 0, 0));
        } else {
            xb xbVar2 = new xb(context, 1, null);
            this.b = xbVar2;
            NotificationCenter.listenEmojiLoading(xbVar2);
            xbVar2.setTypeface(Typeface.SANS_SERIF);
            xbVar2.setTextSize(1, 15.0f);
            xbVar2.setEllipsize(TextUtils.TruncateAt.END);
            xbVar2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            xbVar2.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(xbVar2, kb1.m(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
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
        aa0 aa0Var = this.c;
        if (aa0Var != null) {
            aa0Var.setTextColor(i10);
        }
    }
}
