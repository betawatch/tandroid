// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class of4 extends ReplacementSpan {
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public float e;
    public int f;
    public final int h;
    public boolean n;
    public int r;
    public ylb s;
    public String w;

    public of4(int i) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.w = "NEW";
        this.h = i;
        textPaint.setTypeface(gm.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(gm.L(i < 0 ? 12.0f : i));
    }

    public final void a() {
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(this.w, this.a, gm.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.c.getHeight();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        a();
        if (this.n) {
            this.f = cmb.v0(this.r, this.s);
        }
        int i6 = this.f;
        if (i6 == 0) {
            i6 = paint.getColor();
        }
        Paint paint2 = this.b;
        paint2.setColor(i6);
        int i7 = gm.B(i6) > 0.721f ? -16777216 : -1;
        TextPaint textPaint = this.a;
        textPaint.setColor(i7);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float L = f + gm.L(2.0f);
        float L2 = (i4 - this.e) + gm.L(1.0f);
        RectF rectF = gm.P;
        rectF.set(L, L2, this.d + L, this.e + L2);
        float L3 = gm.L(4.4f);
        rectF.inset(gm.L(-4.0f), gm.L(this.h == 8 ? -3.66f : -2.33f));
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        canvas.save();
        canvas.translate(L, L2);
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (gm.L(10.0f) + this.d);
    }

    public of4() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.w = "NEW";
        textPaint.setTypeface(gm.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(gm.L(10.0f));
    }
}
