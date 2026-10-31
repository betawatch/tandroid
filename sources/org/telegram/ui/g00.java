package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class g00 extends ReplacementSpan {
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public float e;
    public int f;
    public final int h;
    public boolean n;
    public int r;
    public org.telegram.ui.ActionBar.p6 s;
    public CharSequence w;

    public g00(int i10) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.w = "NEW";
        this.h = i10;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(org.telegram.messenger.i0.L(i10 < 0 ? 12.0f : i10));
    }

    public final void a() {
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(this.w, this.a, org.telegram.messenger.i0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.c.getHeight();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        a();
        if (this.n) {
            this.f = org.telegram.ui.ActionBar.t6.w0(this.r, this.s);
        }
        int i15 = this.f;
        if (i15 == 0) {
            i15 = paint.getColor();
        }
        Paint paint2 = this.b;
        paint2.setColor(i15);
        int i16 = org.telegram.messenger.i0.B(i15) > 0.721f ? -16777216 : -1;
        TextPaint textPaint = this.a;
        textPaint.setColor(i16);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float L = f7 + org.telegram.messenger.i0.L(2.0f);
        float L2 = (i13 - this.e) + org.telegram.messenger.i0.L(1.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(L, L2, this.d + L, this.e + L2);
        float L3 = org.telegram.messenger.i0.L(4.4f);
        rectF.inset(org.telegram.messenger.i0.L(-4.0f), org.telegram.messenger.i0.L(this.h == 8 ? -3.66f : -2.33f));
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        canvas.save();
        canvas.translate(L, L2);
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.i0.L(10.0f) + this.d);
    }

    public g00() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.w = "NEW";
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(org.telegram.messenger.i0.L(10.0f));
    }
}
