package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mz {
    public int a;
    public CharSequence b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ pz h;

    public mz(pz pzVar, int i7, Spannable spannable, boolean z10) {
        this.h = pzVar;
        this.a = i7;
        this.b = spannable;
        this.g = z10;
    }

    public final int a(boolean z10) {
        int i7;
        int i10;
        CharSequence charSequence = this.b;
        pz pzVar = this.h;
        int ceil = (int) Math.ceil(hi.m3.h(charSequence, pzVar.b));
        this.c = ceil;
        int i11 = 0;
        if (z10) {
            i7 = ((org.telegram.ui.tw) pzVar.K).a(this.a);
            if (i7 < 0) {
                i7 = 0;
            }
            if (z10) {
                this.d = i7;
            }
        } else {
            i7 = this.d;
        }
        if (i7 > 0) {
            i10 = org.telegram.messenger.g0.L(-2.0f) + org.telegram.messenger.g0.L(10.0f) + Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(pzVar.c.measureText(String.format("%d", Integer.valueOf(i7)))));
        } else {
            if (!this.e && pzVar.n) {
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
        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.b = m10;
        this.b = org.telegram.messenger.fj.B5(m10, null, textPaint.getFontMetricsInt(), false);
        this.g = false;
    }
}
