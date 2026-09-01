package oh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
    public final pr h = new pr(0.0f, 0.5f, 0.5f, 1.0f);

    public final void a(org.telegram.ui.Cells.v0 v0Var) {
        this.a = v0Var;
        this.n = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float f11;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        float f12 = -(this.r ? textPaint.getFontMetrics().ascent : textPaint.getFontMetrics().top);
        float f13 = (textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top) * (this.n ? 0.05f : 0.0365f);
        float f14 = f12 - f13;
        if (!this.e) {
            float f15 = this.d + 0.053333335f;
            this.d = f15;
            if (f15 > 1.0f) {
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
            float f16 = measureText / 2.0f;
            float f17 = (i16 * measureText) + f10 + f16;
            if (i16 == this.b) {
                f17 = AndroidUtilities.lerp(f17, e2.c.A(measureText, i16 + 1, f10, f16), this.d);
                float f18 = this.d;
                f11 = AndroidUtilities.lerp(f14, f14 - f16, this.h.getInterpolation(f18 < 0.5f ? f18 / 0.5f : org.telegram.messenger.y3.a(f18, 0.5f, 0.5f, 1.0f)));
            } else {
                if (i16 == this.c) {
                    f17 = AndroidUtilities.lerp(f17, e2.c.A(measureText, i16 - 1, f10, f16), this.d);
                }
                f11 = f14;
            }
            canvas.drawCircle(f17, f11, f13, paint);
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
