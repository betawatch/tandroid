// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gq3 extends ReplacementSpan {
    public int b;
    public final Paint a = new Paint(1);
    public float c = 3.0f;
    public float d = 3.0f;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int color = paint.getColor();
        Paint paint2 = this.a;
        if (color != 0) {
            paint2.setColor(paint.getColor());
        }
        canvas.drawCircle(f + (gm.N(this.c) / 2.0f), ((i5 - i3) / 2) + this.b, gm.N(this.d) / 2.0f, paint2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return gm.L(this.c);
    }
}
