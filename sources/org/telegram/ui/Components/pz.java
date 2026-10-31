package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pz {
    public int a;
    public CharSequence b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ tz h;

    public pz(tz tzVar, int i10, Spannable spannable, boolean z10) {
        this.h = tzVar;
        this.a = i10;
        this.b = spannable;
        this.g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.b;
        tz tzVar = this.h;
        int ceil = (int) Math.ceil(vh.p2.g(charSequence, tzVar.b));
        this.c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.rx) tzVar.J).a(this.a);
            if (i10 < 0) {
                i10 = 0;
            }
            if (z10) {
                this.d = i10;
            }
        } else {
            i10 = this.d;
        }
        if (i10 > 0) {
            i11 = org.telegram.messenger.i0.L(-2.0f) + org.telegram.messenger.i0.L(10.0f) + Math.max(org.telegram.messenger.i0.L(7.333f), (int) Math.ceil(tzVar.c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && tzVar.n) {
                i12 = org.telegram.messenger.i0.L(12.333f);
            }
            i11 = i12;
        }
        return Math.max(org.telegram.messenger.i0.L(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.b;
        if (TextUtils.equals(this.b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.b = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.b = m10;
        this.b = org.telegram.messenger.jj.A5(m10, null, textPaint.getFontMetricsInt(), false);
        this.g = false;
    }
}
