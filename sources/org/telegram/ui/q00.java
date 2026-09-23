package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class q00 extends org.telegram.ui.Cells.m4 {
    public final TextView r;
    public final p00 s;
    public int v;
    public final org.telegram.ui.Components.h5 w;
    public boolean x;
    public final /* synthetic */ c10 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q00(c10 c10Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.y = c10Var;
        int i10 = org.telegram.ui.ActionBar.h6.L6;
        d6Var = ((org.telegram.ui.ActionBar.n2) c10Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(c10Var.getThemedColor(org.telegram.ui.ActionBar.h6.z6));
        org.telegram.messenger.ul.l(c10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i11 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f7 = this.b;
        addView(textView, w7.x5.d(-1, -1.0f, i11, f7, 16.66f, f7, this.c));
        textView.setAlpha(0.0f);
        p00 p00Var = new p00(this, getContext());
        this.s = p00Var;
        this.w = new org.telegram.ui.Components.h5(p00Var, 320L, org.telegram.ui.Components.rr.h, 0);
        p00Var.setTextSize(AndroidUtilities.dp(10.0f));
        p00Var.setTypeface(AndroidUtilities.bold());
        p00Var.setGravity(5);
        p00Var.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i12 = LocaleController.isRTL ? 3 : 5;
        float f10 = this.b;
        addView(p00Var, w7.x5.d(-1, -1.0f, i12 | 48, f10, 16.66f, f10, this.c));
    }

    public final void d(int i10, boolean z10) {
        c10 c10Var = this.y;
        String string = LocaleController.getString(c10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.r;
        textView.setText(string);
        int i11 = 0;
        boolean z11 = i10 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.h6.r8;
            i11 = c10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i11;
        p00 p00Var = this.s;
        if (!z11) {
            p00Var.setEmojiColor(i11);
        }
        if (!z10) {
            this.w.a(this.v, true);
        }
        if (z11 != this.x) {
            this.x = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
            duration.setInterpolator(rrVar).start();
            p00Var.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(rrVar).start();
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
        p00 p00Var = this.s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, p00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        p00Var.c(replaceEmoji, z11, true);
    }
}
