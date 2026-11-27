// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class lf4 extends ReplacementSpan {
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public float e;
    public int f;
    public final int h;
    public boolean n;
    public int r;
    public vnb s;
    public String w;

    public lf4(int i) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.w = "NEW";
        this.h = i;
        textPaint.setTypeface(hl.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(hl.L(i < 0 ? 12.0f : i));
    }

    public final void a() {
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(this.w, this.a, hl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.c.getHeight();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        a();
        if (this.n) {
            this.f = aob.v0(this.r, this.s);
        }
        int i6 = this.f;
        if (i6 == 0) {
            i6 = paint.getColor();
        }
        Paint paint2 = this.b;
        paint2.setColor(i6);
        int i7 = hl.B(i6) > 0.721f ? -16777216 : -1;
        TextPaint textPaint = this.a;
        textPaint.setColor(i7);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float L = f + hl.L(2.0f);
        float L2 = (i4 - this.e) + hl.L(1.0f);
        RectF rectF = hl.P;
        rectF.set(L, L2, this.d + L, this.e + L2);
        float L3 = hl.L(4.4f);
        rectF.inset(hl.L(-4.0f), hl.L(this.h == 8 ? -3.66f : -2.33f));
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        canvas.save();
        canvas.translate(L, L2);
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (hl.L(10.0f) + this.d);
    }

    public lf4() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.w = "NEW";
        textPaint.setTypeface(hl.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(hl.L(10.0f));
    }
}
