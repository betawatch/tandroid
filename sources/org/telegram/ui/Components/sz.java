package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sz {
    public int a;
    public CharSequence b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ vz h;

    public sz(vz vzVar, int i9, Spannable spannable, boolean z10) {
        this.h = vzVar;
        this.a = i9;
        this.b = spannable;
        this.g = z10;
    }

    public final int a(boolean z10) {
        int i9;
        int i10;
        CharSequence charSequence = this.b;
        vz vzVar = this.h;
        int ceil = (int) Math.ceil(kh.x3.g(charSequence, vzVar.b));
        this.c = ceil;
        int i11 = 0;
        if (z10) {
            i9 = ((org.telegram.ui.dw) vzVar.F).a(this.a);
            if (i9 < 0) {
                i9 = 0;
            }
            if (z10) {
                this.d = i9;
            }
        } else {
            i9 = this.d;
        }
        if (i9 > 0) {
            i10 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(vzVar.c.measureText(String.format("%d", Integer.valueOf(i9)))));
        } else {
            if (!this.e && vzVar.n) {
                i11 = AndroidUtilities.dp(12.333f);
            }
            i10 = i11;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i10);
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
