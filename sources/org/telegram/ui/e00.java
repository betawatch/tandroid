package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e00 extends org.telegram.ui.Cells.j4 {
    public final TextView r;
    public final hh.ca s;
    public int v;
    public final org.telegram.ui.Components.b5 w;
    public boolean x;
    public final /* synthetic */ q00 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e00(q00 q00Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.y = q00Var;
        int i10 = org.telegram.ui.ActionBar.g6.L6;
        c6Var = ((org.telegram.ui.ActionBar.n2) q00Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(q00Var.getThemedColor(org.telegram.ui.ActionBar.g6.z6));
        org.telegram.messenger.rl.i(q00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i11 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f10 = this.b;
        addView(textView, h7.z5.d(-1, -1.0f, i11, f10, 16.66f, f10, this.c));
        textView.setAlpha(0.0f);
        hh.ca caVar = new hh.ca(this, getContext());
        this.s = caVar;
        this.w = new org.telegram.ui.Components.b5(caVar, 320L, org.telegram.ui.Components.er.h, 0);
        caVar.setTextSize(AndroidUtilities.dp(10.0f));
        caVar.setTypeface(AndroidUtilities.bold());
        caVar.setGravity(5);
        caVar.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i12 = LocaleController.isRTL ? 3 : 5;
        float f11 = this.b;
        addView(caVar, h7.z5.d(-1, -1.0f, i12 | 48, f11, 16.66f, f11, this.c));
    }

    public final void d(int i10, boolean z10) {
        q00 q00Var = this.y;
        String string = LocaleController.getString(q00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.r;
        textView.setText(string);
        int i11 = 0;
        boolean z11 = i10 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.g6.r8;
            i11 = q00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i11;
        hh.ca caVar = this.s;
        if (!z11) {
            caVar.setEmojiColor(i11);
        }
        if (!z10) {
            this.w.a(this.v, true);
        }
        if (z11 != this.x) {
            this.x = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
            duration.setInterpolator(erVar).start();
            caVar.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(erVar).start();
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
        hh.ca caVar = this.s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, caVar.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        caVar.c(replaceEmoji, z11, true);
    }
}
