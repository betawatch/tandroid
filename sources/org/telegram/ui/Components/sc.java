package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sc extends qb {
    public final m9 a;
    public final ea0 b;
    public final ea0 c;
    public final LinearLayout d;

    public sc(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var);
        m9 m9Var = new m9(context, false);
        this.a = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(m9Var, w7.x5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.x5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            ac acVar = new ac(context, 2, null);
            this.b = acVar;
            NotificationCenter.listenEmojiLoading(acVar);
            Typeface typeface = Typeface.SANS_SERIF;
            acVar.setTypeface(typeface);
            acVar.setTextSize(1, 14.0f);
            acVar.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            acVar.setEllipsize(truncateAt);
            acVar.setMaxLines(1);
            linearLayout.addView(acVar);
            ea0 ea0Var = new ea0(context, null);
            this.c = ea0Var;
            ea0Var.setTypeface(typeface);
            ea0Var.setTextSize(1, 12.0f);
            ea0Var.setEllipsize(truncateAt);
            ea0Var.setSingleLine(false);
            ea0Var.setMaxLines(3);
            ea0Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
            linearLayout.addView(ea0Var, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            ac acVar2 = new ac(context, 1, null);
            this.b = acVar2;
            NotificationCenter.listenEmojiLoading(acVar2);
            acVar2.setTypeface(Typeface.SANS_SERIF);
            acVar2.setTextSize(1, 15.0f);
            acVar2.setEllipsize(TextUtils.TruncateAt.END);
            acVar2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            acVar2.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(acVar2, w7.x5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        this.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
    }

    @Override // org.telegram.ui.Components.xb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
        ea0 ea0Var = this.c;
        if (ea0Var != null) {
            ea0Var.setTextColor(i10);
        }
    }
}
