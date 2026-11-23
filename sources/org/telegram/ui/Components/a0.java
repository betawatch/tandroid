package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a0 extends ReplacementSpan {
    public final Paint a;
    public final Path b;
    public final Rect c;
    public float d;
    public float e;
    public float f;
    public float h;
    public float n;

    public a0() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        this.c = new Rect();
        this.d = -1.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    public final void a(Paint paint) {
        float textSize = paint.getTextSize();
        if (textSize == this.d) {
            return;
        }
        this.d = textSize;
        this.e = 0.62f * textSize;
        this.f = 0.1f * textSize;
        this.h = textSize * 0.3f;
        paint.getTextBounds("x", 0, 1, this.c);
        this.n = r3.height();
        float f10 = this.e;
        float f11 = 0.475f * f10;
        float f12 = f10 * 0.46f;
        Path path = this.b;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(this.e, 0.0f);
        path.moveTo(this.e - f11, -f12);
        path.lineTo(this.e, 0.0f);
        path.lineTo(this.e - f11, f12);
        this.a.setStrokeWidth(this.f);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a(paint);
        int color = paint.getColor();
        Paint paint2 = this.a;
        paint2.setColor(color);
        canvas.save();
        org.telegram.messenger.o10.k(this.n, 2.0f, i12, (this.f / 2.0f) + f10, canvas);
        canvas.drawPath(this.b, paint2);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a(paint);
        return (int) Math.ceil(this.f + this.e + this.h);
    }
}
