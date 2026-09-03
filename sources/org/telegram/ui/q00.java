package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q00 extends org.telegram.ui.Cells.l4 {
    public final TextView r;
    public final lh.x9 s;
    public int v;
    public final org.telegram.ui.Components.c5 w;
    public boolean x;
    public final /* synthetic */ c10 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q00(c10 c10Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.y = c10Var;
        int i10 = org.telegram.ui.ActionBar.j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.p2) c10Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(c10Var.getThemedColor(org.telegram.ui.ActionBar.j6.z6));
        org.telegram.messenger.y3.r(c10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i11 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f10 = this.b;
        addView(textView, k7.b6.d(-1, -1.0f, i11, f10, 16.66f, f10, this.c));
        textView.setAlpha(0.0f);
        lh.x9 x9Var = new lh.x9(this, getContext());
        this.s = x9Var;
        this.w = new org.telegram.ui.Components.c5(x9Var, 320L, org.telegram.ui.Components.mr.h, 0);
        x9Var.setTextSize(AndroidUtilities.dp(10.0f));
        x9Var.setTypeface(AndroidUtilities.bold());
        x9Var.setGravity(5);
        x9Var.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i12 = LocaleController.isRTL ? 3 : 5;
        float f11 = this.b;
        addView(x9Var, k7.b6.d(-1, -1.0f, i12 | 48, f11, 16.66f, f11, this.c));
    }

    public final void d(int i10, boolean z4) {
        c10 c10Var = this.y;
        String string = LocaleController.getString(c10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.r;
        textView.setText(string);
        int i11 = 0;
        boolean z10 = i10 < 0;
        if (!z10) {
            int[] iArr = org.telegram.ui.ActionBar.j6.r8;
            i11 = c10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i11;
        lh.x9 x9Var = this.s;
        if (!z10) {
            x9Var.setEmojiColor(i11);
        }
        if (!z4) {
            this.w.a(this.v, true);
        }
        if (z10 != this.x) {
            this.x = z10;
            ViewPropertyAnimator duration = textView.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
            duration.setInterpolator(mrVar).start();
            x9Var.animate().alpha(z10 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(mrVar).start();
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
        lh.x9 x9Var = this.s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, x9Var.getPaint().getFontMetricsInt(), false);
        if (z4 && !LocaleController.isRTL) {
            z10 = true;
        }
        x9Var.c(replaceEmoji, z10, true);
    }
}
