package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class z9 extends ReplacementSpan {
    public final String a;
    public final String b;
    public final boolean c;
    public float d;
    public int e;
    public int f;
    public ba h;
    public ba n;
    public final /* synthetic */ ca r;

    public z9(ca caVar, String str, boolean z10, boolean z11) {
        this.r = caVar;
        this.a = str;
        this.b = z10 ? caVar.Q : "";
        this.c = z11;
    }

    public final int a() {
        return Math.round((ca.T.getInterpolation(this.r.J) * (this.f - r0)) + this.e);
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
        ba baVar = this.n;
        if (baVar != null) {
            paint2 = paint;
            i14 = i12;
            canvas2 = canvas;
            baVar.b(canvas2, paint2, this.b, f11, i14);
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
