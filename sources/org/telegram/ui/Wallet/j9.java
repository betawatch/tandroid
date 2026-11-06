package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class j9 extends ReplacementSpan {
    public final String a;
    public final String b;
    public final boolean c;
    public float d;
    public int e;
    public int f;
    public l9 h;
    public l9 n;
    public final /* synthetic */ m9 r;

    public j9(m9 m9Var, String str, boolean z9, boolean z10) {
        this.r = m9Var;
        this.a = str;
        this.b = z9 ? m9Var.P : "";
        this.c = z10;
    }

    public final int a() {
        return Math.round((m9.S.getInterpolation(this.r.I) * (this.f - r0)) + this.e);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i14;
        float textSize = paint.getTextSize();
        if (this.c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f11 = f10 - this.d;
        l9 l9Var = this.n;
        if (l9Var != null) {
            paint2 = paint;
            i14 = i12;
            canvas2 = canvas;
            l9Var.b(canvas2, paint2, this.b, f11, i14);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i14 = i12;
        }
        this.h.b(canvas2, paint2, this.a, f11, i14);
        paint2.setTextSize(textSize);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
