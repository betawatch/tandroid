package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class d00 extends org.telegram.ui.Cells.l4 {
    public final TextView r;
    public final ai.yc s;
    public int v;
    public final org.telegram.ui.Components.i5 w;
    public boolean x;
    public final /* synthetic */ p00 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d00(p00 p00Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.y = p00Var;
        int i10 = org.telegram.ui.ActionBar.h6.L6;
        d6Var = ((org.telegram.ui.ActionBar.n2) p00Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(p00Var.getThemedColor(org.telegram.ui.ActionBar.h6.z6));
        org.telegram.messenger.wh.m(p00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i11 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f7 = this.b;
        addView(textView, w7.z5.a(-1.0f, f7, 16.66f, f7, this.c, -1, i11));
        textView.setAlpha(0.0f);
        ai.yc ycVar = new ai.yc(this, getContext());
        this.s = ycVar;
        this.w = new org.telegram.ui.Components.i5(ycVar, 320L, org.telegram.ui.Components.bs.h, 0);
        ycVar.setTextSize(AndroidUtilities.dp(10.0f));
        ycVar.setTypeface(AndroidUtilities.bold());
        ycVar.setGravity(5);
        ycVar.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i12 = LocaleController.isRTL ? 3 : 5;
        float f10 = this.b;
        addView(ycVar, w7.z5.a(-1.0f, f10, 16.66f, f10, this.c, -1, i12 | 48));
    }

    public final void d(int i10, boolean z10) {
        p00 p00Var = this.y;
        String string = LocaleController.getString(p00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.r;
        textView.setText(string);
        int i11 = 0;
        boolean z11 = i10 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.h6.r8;
            i11 = p00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i11;
        ai.yc ycVar = this.s;
        if (!z11) {
            ycVar.setEmojiColor(i11);
        }
        if (!z10) {
            this.w.a(this.v, true);
        }
        if (z11 != this.x) {
            this.x = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
            duration.setInterpolator(bsVar).start();
            ycVar.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(bsVar).start();
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
        ai.yc ycVar = this.s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, ycVar.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        ycVar.c(replaceEmoji, z11, true);
    }
}
