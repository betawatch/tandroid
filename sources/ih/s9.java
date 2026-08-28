package ih;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s9 extends ReplacementSpan {
    public View a;
    public float d;
    public boolean e;
    public long f;
    public boolean n;
    public boolean r;
    public int b = 1;
    public int c = 2;
    public final gr h = new gr(0.0f, 0.5f, 0.5f, 1.0f);

    public final void a(org.telegram.ui.Cells.w0 w0Var) {
        this.a = w0Var;
        this.n = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
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
                int i14 = this.b - 1;
                this.b = i14;
                this.c--;
                if (i14 < 0) {
                    this.b = 1;
                    this.c = 2;
                    this.e = true;
                    this.f = System.currentTimeMillis();
                }
            }
        } else if (System.currentTimeMillis() - this.f > 1000) {
            this.e = false;
        }
        for (int i15 = 0; i15 < 3; i15++) {
            float f16 = measureText / 2.0f;
            float f17 = (i15 * measureText) + f10 + f16;
            if (i15 == this.b) {
                f17 = AndroidUtilities.lerp(f17, aa.d.w(measureText, i15 + 1, f10, f16), this.d);
                float f18 = this.d;
                f11 = AndroidUtilities.lerp(f14, f14 - f16, this.h.getInterpolation(f18 < 0.5f ? f18 / 0.5f : org.telegram.messenger.l0.a(f18, 0.5f, 0.5f, 1.0f)));
            } else {
                if (i15 == this.c) {
                    f17 = AndroidUtilities.lerp(f17, aa.d.w(measureText, i15 - 1, f10, f16), this.d);
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
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
