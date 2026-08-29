package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d00 extends org.telegram.ui.Cells.k4 {
    public final TextView r;
    public final jh.w9 s;
    public int v;
    public final org.telegram.ui.Components.f5 w;
    public boolean x;
    public final /* synthetic */ p00 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d00(p00 p00Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.y = p00Var;
        int i10 = org.telegram.ui.ActionBar.g6.L6;
        c6Var = ((org.telegram.ui.ActionBar.o2) p00Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(p00Var.getThemedColor(org.telegram.ui.ActionBar.g6.z6));
        b.i(p00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i11 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f9 = this.b;
        addView(textView, i7.f6.d(-1, -1.0f, i11, f9, 16.66f, f9, this.c));
        textView.setAlpha(0.0f);
        jh.w9 w9Var = new jh.w9(this, getContext());
        this.s = w9Var;
        this.w = new org.telegram.ui.Components.f5(w9Var, 320L, org.telegram.ui.Components.jr.h, 0);
        w9Var.setTextSize(AndroidUtilities.dp(10.0f));
        w9Var.setTypeface(AndroidUtilities.bold());
        w9Var.setGravity(5);
        w9Var.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i12 = LocaleController.isRTL ? 3 : 5;
        float f10 = this.b;
        addView(w9Var, i7.f6.d(-1, -1.0f, i12 | 48, f10, 16.66f, f10, this.c));
    }

    public final void d(int i10, boolean z10) {
        p00 p00Var = this.y;
        String string = LocaleController.getString(p00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.r;
        textView.setText(string);
        int i11 = 0;
        boolean z11 = i10 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.g6.r8;
            i11 = p00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i11;
        jh.w9 w9Var = this.s;
        if (!z11) {
            w9Var.setEmojiColor(i11);
        }
        if (!z10) {
            this.w.a(this.v, true);
        }
        if (z11 != this.x) {
            this.x = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
            duration.setInterpolator(jrVar).start();
            w9Var.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(jrVar).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z10) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z11 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        jh.w9 w9Var = this.s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, w9Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        w9Var.c(replaceEmoji, z11, true);
    }
}
