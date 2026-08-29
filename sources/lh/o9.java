package lh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o9 extends ReplacementSpan {
    public View a;
    public float d;
    public boolean e;
    public long f;
    public boolean n;
    public boolean r;
    public int b = 1;
    public int c = 2;
    public final jr h = new jr(0.0f, 0.5f, 0.5f, 1.0f);

    public final void a(org.telegram.ui.Cells.v0 v0Var) {
        this.a = v0Var;
        this.n = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        float f10;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        float f11 = -(this.r ? textPaint.getFontMetrics().ascent : textPaint.getFontMetrics().top);
        float f12 = (textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top) * (this.n ? 0.05f : 0.0365f);
        float f13 = f11 - f12;
        if (!this.e) {
            float f14 = this.d + 0.053333335f;
            this.d = f14;
            if (f14 > 1.0f) {
                this.d = 0.0f;
                int i15 = this.b - 1;
                this.b = i15;
                this.c--;
                if (i15 < 0) {
                    this.b = 1;
                    this.c = 2;
                    this.e = true;
                    this.f = System.currentTimeMillis();
                }
            }
        } else if (System.currentTimeMillis() - this.f > 1000) {
            this.e = false;
        }
        for (int i16 = 0; i16 < 3; i16++) {
            float f15 = measureText / 2.0f;
            float f16 = (i16 * measureText) + f9 + f15;
            if (i16 == this.b) {
                f16 = AndroidUtilities.lerp(f16, com.google.android.recaptcha.internal.a.d(measureText, i16 + 1, f9, f15), this.d);
                float f17 = this.d;
                f10 = AndroidUtilities.lerp(f13, f13 - f15, this.h.getInterpolation(f17 < 0.5f ? f17 / 0.5f : org.telegram.messenger.x3.a(f17, 0.5f, 0.5f, 1.0f)));
            } else {
                if (i16 == this.c) {
                    f16 = AndroidUtilities.lerp(f16, com.google.android.recaptcha.internal.a.d(measureText, i16 - 1, f9, f15), this.d);
                }
                f10 = f13;
            }
            canvas.drawCircle(f16, f10, f12, paint);
        }
        View view = this.a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
