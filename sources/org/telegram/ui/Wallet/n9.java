package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n9 extends ReplacementSpan {
    public final String a;
    public final String b;
    public final boolean c;
    public float d;
    public int e;
    public int f;
    public p9 h;
    public p9 n;
    public final /* synthetic */ q9 r;

    public n9(q9 q9Var, String str, boolean z10, boolean z11) {
        this.r = q9Var;
        this.a = str;
        this.b = z10 ? q9Var.P : "";
        this.c = z11;
    }

    public final int a() {
        return Math.round((q9.S.getInterpolation(this.r.I) * (this.f - r0)) + this.e);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i15;
        float textSize = paint.getTextSize();
        if (this.c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f10 = f7 - this.d;
        p9 p9Var = this.n;
        if (p9Var != null) {
            paint2 = paint;
            i15 = i13;
            canvas2 = canvas;
            p9Var.b(canvas2, paint2, this.b, f10, i15);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i15 = i13;
        }
        this.h.b(canvas2, paint2, this.a, f10, i15);
        paint2.setTextSize(textSize);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
