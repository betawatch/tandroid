package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b00 extends org.telegram.ui.Cells.m4 {
    public final TextView r;
    public final gh.ca s;
    public int v;
    public final org.telegram.ui.Components.b5 w;
    public boolean x;
    public final /* synthetic */ n00 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b00(n00 n00Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.b6 b6Var;
        this.y = n00Var;
        int i9 = org.telegram.ui.ActionBar.f6.L6;
        b6Var = ((org.telegram.ui.ActionBar.o2) n00Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(n00Var.getThemedColor(org.telegram.ui.ActionBar.f6.z6));
        org.telegram.messenger.ll.l(n00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i10 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f10 = this.b;
        addView(textView, g7.e6.d(-1, -1.0f, i10, f10, 16.66f, f10, this.c));
        textView.setAlpha(0.0f);
        gh.ca caVar = new gh.ca(this, getContext());
        this.s = caVar;
        this.w = new org.telegram.ui.Components.b5(caVar, 320L, org.telegram.ui.Components.gr.h, 0);
        caVar.setTextSize(AndroidUtilities.dp(10.0f));
        caVar.setTypeface(AndroidUtilities.bold());
        caVar.setGravity(5);
        caVar.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i11 = LocaleController.isRTL ? 3 : 5;
        float f11 = this.b;
        addView(caVar, g7.e6.d(-1, -1.0f, i11 | 48, f11, 16.66f, f11, this.c));
    }

    public final void d(int i9, boolean z10) {
        n00 n00Var = this.y;
        String string = LocaleController.getString(n00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.r;
        textView.setText(string);
        int i10 = 0;
        boolean z11 = i9 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.f6.r8;
            i10 = n00Var.getThemedColor(iArr[i9 % iArr.length]);
        }
        this.v = i10;
        gh.ca caVar = this.s;
        if (!z11) {
            caVar.setEmojiColor(i10);
        }
        if (!z10) {
            this.w.a(this.v, true);
        }
        if (z11 != this.x) {
            this.x = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
            duration.setInterpolator(grVar).start();
            caVar.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(grVar).start();
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
        gh.ca caVar = this.s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, caVar.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        caVar.c(replaceEmoji, z11, true);
    }
}
