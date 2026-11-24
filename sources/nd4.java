// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class nd4 extends ReplacementSpan {
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public float e;
    public int f;
    public final int h;
    public boolean n;
    public int r;
    public wjb s;
    public String w;

    public nd4(int i) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.w = "NEW";
        this.h = i;
        textPaint.setTypeface(gl.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(gl.L(i < 0 ? 12.0f : i));
    }

    public final void a() {
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(this.w, this.a, gl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.c.getHeight();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        a();
        if (this.n) {
            this.f = bkb.v0(this.r, this.s);
        }
        int i6 = this.f;
        if (i6 == 0) {
            i6 = paint.getColor();
        }
        Paint paint2 = this.b;
        paint2.setColor(i6);
        int i7 = gl.B(i6) > 0.721f ? -16777216 : -1;
        TextPaint textPaint = this.a;
        textPaint.setColor(i7);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float L = f + gl.L(2.0f);
        float L2 = (i4 - this.e) + gl.L(1.0f);
        RectF rectF = gl.P;
        rectF.set(L, L2, this.d + L, this.e + L2);
        float L3 = gl.L(4.4f);
        rectF.inset(gl.L(-4.0f), gl.L(this.h == 8 ? -3.66f : -2.33f));
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        canvas.save();
        canvas.translate(L, L2);
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (gl.L(10.0f) + this.d);
    }

    public nd4() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.w = "NEW";
        textPaint.setTypeface(gl.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(gl.L(10.0f));
    }
}
