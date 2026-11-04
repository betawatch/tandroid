package ei;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x9 extends ReplacementSpan {
    public View a;
    public float d;
    public boolean e;
    public long f;
    public boolean n;
    public boolean r;
    public int b = 1;
    public int c = 2;
    public final xq h = new xq(0.0f, 0.5f, 0.5f, 1.0f);

    public static CharSequence a(TextView textView, String str) {
        int i3;
        int i10;
        SpannableStringBuilder spannableStringBuilder = null;
        if (str == null) {
            return null;
        }
        int i11 = 0;
        while (i11 < str.length()) {
            if (str.charAt(i11) == 8230) {
                i10 = 1;
            } else {
                if (str.charAt(i11) == '.' && (i3 = i11 + 2) < str.length() && str.charAt(i11 + 1) == '.' && str.charAt(i3) == '.') {
                    i10 = 3;
                }
                i11++;
            }
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            x9 x9Var = new x9();
            x9Var.a = textView;
            x9Var.n = false;
            spannableStringBuilder.setSpan(x9Var, i11, i11 + i10, 33);
            i11 += i10 - 1;
            i11++;
        }
        return spannableStringBuilder == null ? str : spannableStringBuilder;
    }

    public final void b(org.telegram.ui.Cells.t0 t0Var) {
        this.a = t0Var;
        this.n = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
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
                f17 = org.telegram.messenger.g0.T1(f17, t4.c.c(measureText, i15 + 1, f10, f16), this.d);
                float f18 = this.d;
                f11 = org.telegram.messenger.g0.T1(f14, f14 - f16, this.h.getInterpolation(f18 < 0.5f ? f18 / 0.5f : org.telegram.messenger.k5.y(f18, 0.5f, 0.5f, 1.0f)));
            } else {
                if (i15 == this.c) {
                    f17 = org.telegram.messenger.g0.T1(f17, t4.c.c(measureText, i15 - 1, f10, f16), this.d);
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
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
