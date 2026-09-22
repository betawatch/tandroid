package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class nc extends lb {
    public final i9 a;
    public final c90 b;
    public final c90 c;
    public final LinearLayout d;

    public nc(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var);
        i9 i9Var = new i9(context, false);
        this.a = i9Var;
        i9Var.setStyle(11);
        i9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(i9Var, w7.x5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.x5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            vb vbVar = new vb(context, 2, null);
            this.b = vbVar;
            NotificationCenter.listenEmojiLoading(vbVar);
            Typeface typeface = Typeface.SANS_SERIF;
            vbVar.setTypeface(typeface);
            vbVar.setTextSize(1, 14.0f);
            vbVar.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vbVar.setEllipsize(truncateAt);
            vbVar.setMaxLines(1);
            linearLayout.addView(vbVar);
            c90 c90Var = new c90(context, null);
            this.c = c90Var;
            c90Var.setTypeface(typeface);
            c90Var.setTextSize(1, 12.0f);
            c90Var.setEllipsize(truncateAt);
            c90Var.setSingleLine(false);
            c90Var.setMaxLines(3);
            c90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
            linearLayout.addView(c90Var, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            vb vbVar2 = new vb(context, 1, null);
            this.b = vbVar2;
            NotificationCenter.listenEmojiLoading(vbVar2);
            vbVar2.setTypeface(Typeface.SANS_SERIF);
            vbVar2.setTextSize(1, 15.0f);
            vbVar2.setEllipsize(TextUtils.TruncateAt.END);
            vbVar2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            vbVar2.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(vbVar2, w7.x5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        this.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
    }

    @Override // org.telegram.ui.Components.sb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
        c90 c90Var = this.c;
        if (c90Var != null) {
            c90Var.setTextColor(i10);
        }
    }
}
