// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Random;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dfa extends View implements snb {
    public Random a;
    public Paint b;
    public Paint c;
    public Paint d;
    public Paint e;
    public float f;
    public float h;
    public float n;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        Paint paint = this.c;
        Paint paint2 = this.b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), jn7.d4, 31);
        float f2 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - hl.L(3.0f);
        int L = hl.L(1.0f) + ((hl.L(1.0f) + measuredWidth) * 7);
        k43 k43Var = k43.g;
        float f3 = this.f;
        float interpolation = k43Var.getInterpolation(f3 > 0.4f ? (f3 - 0.4f) / 0.6f : 0.0f);
        float f4 = (this.n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-uh9.f(4.0f, getMeasuredHeight(), L)) * f4);
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            int L2 = ((hl.L(1.0f) + measuredWidth) * i) + hl.L(f2);
            RectF rectF = hl.P;
            float f5 = L2;
            float f6 = L2 + measuredWidth;
            rectF.set(0.0f, f5, measuredWidth, f6);
            canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), paint2);
            rectF.set(hl.L(1.0f) + measuredWidth, f5, uh9.w(1.0f, measuredWidth, measuredWidth), f6);
            canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), paint2);
            i++;
            f2 = f2;
        }
        float f7 = f2;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), hl.L(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - hl.L(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), hl.L(4.0f), this.e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - hl.L(21.0f)) * f4) + hl.L(f7);
        RectF rectF2 = hl.P;
        rectF2.set(getMeasuredWidth() - hl.L(f7), measuredHeight, getMeasuredWidth(), hl.L(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, hl.L(1.5f), hl.L(1.5f), paint);
        float centerY = rectF2.centerY();
        float L3 = hl.L(0.5f) + measuredWidth;
        rectF2.set(L3 - hl.L(8.0f), centerY - hl.L(f7), L3 + hl.L(8.0f), centerY + hl.L(f7));
        canvas.drawRoundRect(rectF2, hl.L(f7), hl.L(f7), paint);
        float f8 = this.f + 0.016f;
        this.f = f8;
        if (f8 > 1.0f) {
            this.h = this.n;
            float abs = Math.abs(this.a.nextInt() % 1001) / 1000.0f;
            this.n = abs;
            if (abs > this.h) {
                f = abs + 0.3f;
                this.n = f;
            } else {
                f = abs - 0.3f;
                this.n = f;
            }
            this.n = Math.max(0.0f, Math.min(1.0f, f));
            this.f = 0.0f;
        }
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        try {
            Paint paint = this.b;
            int i = aob.gg;
            paint.setColor(vm2.o(aob.w0(null, i, false), 76));
            this.c.setColor(aob.w0(null, i, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
