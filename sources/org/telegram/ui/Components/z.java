package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class z extends ReplacementSpan {
    public final Paint a;
    public final Path b;
    public final Rect c;
    public float d;
    public float e;
    public float f;
    public float h;
    public float n;

    public z() {
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
        org.telegram.messenger.n10.k(this.n, 2.0f, i12, (this.f / 2.0f) + f10, canvas);
        canvas.drawPath(this.b, paint2);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a(paint);
        return (int) Math.ceil(this.f + this.e + this.h);
    }
}
