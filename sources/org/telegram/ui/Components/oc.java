package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class oc extends mb {
    public final j9 a;
    public final m90 b;
    public final m90 c;
    public final LinearLayout d;

    public oc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var);
        j9 j9Var = new j9(context, false);
        this.a = j9Var;
        j9Var.setStyle(11);
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(j9Var, w7.a6.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.a6.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            wb wbVar = new wb(context, 2, null);
            this.b = wbVar;
            NotificationCenter.listenEmojiLoading(wbVar);
            Typeface typeface = Typeface.SANS_SERIF;
            wbVar.setTypeface(typeface);
            wbVar.setTextSize(1, 14.0f);
            wbVar.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            wbVar.setEllipsize(truncateAt);
            wbVar.setMaxLines(1);
            linearLayout.addView(wbVar);
            m90 m90Var = new m90(context, null);
            this.c = m90Var;
            m90Var.setTypeface(typeface);
            m90Var.setTextSize(1, 12.0f);
            m90Var.setEllipsize(truncateAt);
            m90Var.setSingleLine(false);
            m90Var.setMaxLines(3);
            m90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
            linearLayout.addView(m90Var, w7.a6.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            wb wbVar2 = new wb(context, 1, null);
            this.b = wbVar2;
            NotificationCenter.listenEmojiLoading(wbVar2);
            wbVar2.setTypeface(Typeface.SANS_SERIF);
            wbVar2.setTextSize(1, 15.0f);
            wbVar2.setEllipsize(TextUtils.TruncateAt.END);
            wbVar2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            wbVar2.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(wbVar2, w7.a6.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        this.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    @Override // org.telegram.ui.Components.tb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
        m90 m90Var = this.c;
        if (m90Var != null) {
            m90Var.setTextColor(i10);
        }
    }
}
