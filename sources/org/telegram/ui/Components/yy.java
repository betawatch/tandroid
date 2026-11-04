package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yy {
    public int a;
    public CharSequence b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ bz h;

    public yy(bz bzVar, int i3, Spannable spannable, boolean z10) {
        this.h = bzVar;
        this.a = i3;
        this.b = spannable;
        this.g = z10;
    }

    public final int a(boolean z10) {
        int i3;
        int i10;
        CharSequence charSequence = this.b;
        bz bzVar = this.h;
        int ceil = (int) Math.ceil(gi.l3.h(charSequence, bzVar.b));
        this.c = ceil;
        int i11 = 0;
        if (z10) {
            i3 = ((org.telegram.ui.kw) bzVar.K).a(this.a);
            if (i3 < 0) {
                i3 = 0;
            }
            if (z10) {
                this.d = i3;
            }
        } else {
            i3 = this.d;
        }
        if (i3 > 0) {
            i10 = org.telegram.messenger.g0.L(-2.0f) + org.telegram.messenger.g0.L(10.0f) + Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(bzVar.c.measureText(String.format("%d", Integer.valueOf(i3)))));
        } else {
            if (!this.e && bzVar.n) {
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
        this.b = org.telegram.messenger.zi.C5(m10, null, textPaint.getFontMetricsInt(), false);
        this.g = false;
    }
}
