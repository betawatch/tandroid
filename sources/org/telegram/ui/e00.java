package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e00 extends org.telegram.ui.Cells.q4 {
    public final TextView r;
    public final bi.qc s;
    public int v;
    public final org.telegram.ui.Components.j5 w;
    public boolean x;
    public final /* synthetic */ q00 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e00(q00 q00Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.u6 u6Var;
        this.y = q00Var;
        int i10 = org.telegram.ui.ActionBar.y6.L6;
        u6Var = ((org.telegram.ui.ActionBar.r2) q00Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.z6, q00Var.getResourceProvider());
        org.telegram.messenger.wh.k(q00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i11 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f7 = this.b;
        addView(textView, org.telegram.ui.Components.kb1.h(-1, -1.0f, i11, f7, 16.66f, f7, this.c));
        textView.setAlpha(0.0f);
        bi.qc qcVar = new bi.qc(this, getContext());
        this.s = qcVar;
        this.w = new org.telegram.ui.Components.j5(qcVar, 320L, org.telegram.ui.Components.ds.h, 0);
        qcVar.setTextSize(AndroidUtilities.dp(10.0f));
        qcVar.setTypeface(AndroidUtilities.bold());
        qcVar.setGravity(5);
        qcVar.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i12 = LocaleController.isRTL ? 3 : 5;
        float f10 = this.b;
        addView(qcVar, org.telegram.ui.Components.kb1.h(-1, -1.0f, i12 | 48, f10, 16.66f, f10, this.c));
    }

    public final void d(int i10, boolean z10) {
        q00 q00Var = this.y;
        String string = LocaleController.getString(q00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.r;
        textView.setText(string);
        int i11 = 0;
        boolean z11 = i10 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.y6.r8;
            i11 = q00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i11;
        bi.qc qcVar = this.s;
        if (!z11) {
            qcVar.setEmojiColor(i11);
        }
        if (!z10) {
            this.w.a(this.v, true);
        }
        if (z11 != this.x) {
            this.x = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
            duration.setInterpolator(dsVar).start();
            qcVar.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(dsVar).start();
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
        bi.qc qcVar = this.s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, qcVar.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        qcVar.c(replaceEmoji, z11, true);
    }
}
