package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class bz {
    public int a;
    public CharSequence b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ ez h;

    public bz(ez ezVar, int i7, Spannable spannable, boolean z9) {
        this.h = ezVar;
        this.a = i7;
        this.b = spannable;
        this.g = z9;
    }

    public final int a(boolean z9) {
        int i7;
        int i10;
        CharSequence charSequence = this.b;
        ez ezVar = this.h;
        int ceil = (int) Math.ceil(fi.m3.h(charSequence, ezVar.b));
        this.c = ceil;
        int i11 = 0;
        if (z9) {
            i7 = ((org.telegram.ui.nw) ezVar.J).a(this.a);
            if (i7 < 0) {
                i7 = 0;
            }
            if (z9) {
                this.d = i7;
            }
        } else {
            i7 = this.d;
        }
        if (i7 > 0) {
            i10 = org.telegram.messenger.g0.L(-2.0f) + org.telegram.messenger.g0.L(10.0f) + Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(ezVar.c.measureText(String.format("%d", Integer.valueOf(i7)))));
        } else {
            if (!this.e && ezVar.n) {
                i11 = org.telegram.messenger.g0.L(12.333f);
            }
            i10 = i11;
        }
        return Math.max(org.telegram.messenger.g0.L(16.0f), ceil + i10);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.b;
        if (TextUtils.equals(this.b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.b = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.b = m10;
        this.b = org.telegram.messenger.ij.C5(m10, null, textPaint.getFontMetricsInt(), false);
        this.g = false;
    }
}
