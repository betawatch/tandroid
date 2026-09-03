package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p00 extends org.telegram.ui.Cells.m4 {
    public final TextView r;
    public final mh.x9 s;
    public int v;
    public final org.telegram.ui.Components.c5 w;
    public boolean x;
    public final /* synthetic */ b10 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p00(b10 b10Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.y = b10Var;
        int i10 = org.telegram.ui.ActionBar.k6.L6;
        g6Var = ((org.telegram.ui.ActionBar.p2) b10Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(b10Var.getThemedColor(org.telegram.ui.ActionBar.k6.z6));
        org.telegram.messenger.y3.r(b10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i11 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f10 = this.b;
        addView(textView, k7.c6.d(-1, -1.0f, i11, f10, 16.66f, f10, this.c));
        textView.setAlpha(0.0f);
        mh.x9 x9Var = new mh.x9(this, getContext());
        this.s = x9Var;
        this.w = new org.telegram.ui.Components.c5(x9Var, 320L, org.telegram.ui.Components.pr.h, 0);
        x9Var.setTextSize(AndroidUtilities.dp(10.0f));
        x9Var.setTypeface(AndroidUtilities.bold());
        x9Var.setGravity(5);
        x9Var.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i12 = LocaleController.isRTL ? 3 : 5;
        float f11 = this.b;
        addView(x9Var, k7.c6.d(-1, -1.0f, i12 | 48, f11, 16.66f, f11, this.c));
    }

    public final void d(int i10, boolean z4) {
        b10 b10Var = this.y;
        String string = LocaleController.getString(b10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.r;
        textView.setText(string);
        int i11 = 0;
        boolean z10 = i10 < 0;
        if (!z10) {
            int[] iArr = org.telegram.ui.ActionBar.k6.r8;
            i11 = b10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i11;
        mh.x9 x9Var = this.s;
        if (!z10) {
            x9Var.setEmojiColor(i11);
        }
        if (!z4) {
            this.w.a(this.v, true);
        }
        if (z10 != this.x) {
            this.x = z10;
            ViewPropertyAnimator duration = textView.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
            duration.setInterpolator(prVar).start();
            x9Var.animate().alpha(z10 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(prVar).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z4) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z10 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        mh.x9 x9Var = this.s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, x9Var.getPaint().getFontMetricsInt(), false);
        if (z4 && !LocaleController.isRTL) {
            z10 = true;
        }
        x9Var.c(replaceEmoji, z10, true);
    }
}
