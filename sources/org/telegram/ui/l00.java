package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class l00 extends ReplacementSpan {
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public float e;
    public int f;
    public final int h;
    public CharSequence n;

    public l00(int i9) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.n = "NEW";
        this.h = i9;
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(AndroidUtilities.dp(i9 < 0 ? 12.0f : i9));
    }

    public final void a() {
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(this.n, this.a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.c.getHeight();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a();
        int i14 = this.f;
        if (i14 == 0) {
            i14 = paint.getColor();
        }
        Paint paint2 = this.b;
        paint2.setColor(i14);
        int i15 = AndroidUtilities.computePerceivedBrightness(i14) > 0.721f ? -16777216 : -1;
        TextPaint textPaint = this.a;
        textPaint.setColor(i15);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float dp = f10 + AndroidUtilities.dp(2.0f);
        float dp2 = (i12 - this.e) + AndroidUtilities.dp(1.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp, dp2, this.d + dp, this.e + dp2);
        float dp3 = AndroidUtilities.dp(4.4f);
        rectF.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(this.h == 8 ? -3.66f : -2.33f));
        canvas.drawRoundRect(rectF, dp3, dp3, paint2);
        canvas.save();
        canvas.translate(dp, dp2);
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(10.0f) + this.d);
    }

    public l00() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.n = "NEW";
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(AndroidUtilities.dp(10.0f));
    }
}
