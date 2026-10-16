package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class rc extends pb {
    public final n9 a;
    public final da0 b;
    public final da0 c;
    public final LinearLayout d;

    public rc(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var);
        n9 n9Var = new n9(context, false);
        this.a = n9Var;
        n9Var.setStyle(11);
        n9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(n9Var, w7.z5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.z5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            zb zbVar = new zb(context, 2, null);
            this.b = zbVar;
            NotificationCenter.listenEmojiLoading(zbVar);
            Typeface typeface = Typeface.SANS_SERIF;
            zbVar.setTypeface(typeface);
            zbVar.setTextSize(1, 14.0f);
            zbVar.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            zbVar.setEllipsize(truncateAt);
            zbVar.setMaxLines(1);
            linearLayout.addView(zbVar);
            da0 da0Var = new da0(context, null);
            this.c = da0Var;
            da0Var.setTypeface(typeface);
            da0Var.setTextSize(1, 12.0f);
            da0Var.setEllipsize(truncateAt);
            da0Var.setSingleLine(false);
            da0Var.setMaxLines(3);
            da0Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
            linearLayout.addView(da0Var, w7.z5.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            zb zbVar2 = new zb(context, 1, null);
            this.b = zbVar2;
            NotificationCenter.listenEmojiLoading(zbVar2);
            zbVar2.setTypeface(Typeface.SANS_SERIF);
            zbVar2.setTextSize(1, 15.0f);
            zbVar2.setEllipsize(TextUtils.TruncateAt.END);
            zbVar2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            zbVar2.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(zbVar2, w7.z5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        this.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
    }

    @Override // org.telegram.ui.Components.wb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
        da0 da0Var = this.c;
        if (da0Var != null) {
            da0Var.setTextColor(i10);
        }
    }
}
