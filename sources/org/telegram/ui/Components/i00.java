package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i00 {
    public int a;
    public CharSequence b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ l00 h;

    public i00(l00 l00Var, int i10, Spannable spannable, boolean z4) {
        this.h = l00Var;
        this.a = i10;
        this.b = spannable;
        this.g = z4;
    }

    public final int a(boolean z4) {
        int i10;
        int i11;
        CharSequence charSequence = this.b;
        l00 l00Var = this.h;
        int ceil = (int) Math.ceil(qh.e3.g(charSequence, l00Var.b));
        this.c = ceil;
        int i12 = 0;
        if (z4) {
            i10 = ((org.telegram.ui.pw) l00Var.G).a(this.a);
            if (i10 < 0) {
                i10 = 0;
            }
            if (z4) {
                this.d = i10;
            }
        } else {
            i10 = this.d;
        }
        if (i10 > 0) {
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(l00Var.c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && l00Var.n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.b;
        if (TextUtils.equals(this.b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.b = replaceEmoji;
        this.b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.g = false;
    }
}
