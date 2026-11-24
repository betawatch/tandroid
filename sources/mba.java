// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Random;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mba extends View implements tjb {
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
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), kk7.d4, 31);
        float f2 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - gl.L(3.0f);
        int L = gl.L(1.0f) + ((gl.L(1.0f) + measuredWidth) * 7);
        s33 s33Var = s33.g;
        float f3 = this.f;
        float interpolation = s33Var.getInterpolation(f3 > 0.4f ? (f3 - 0.4f) / 0.6f : 0.0f);
        float f4 = (this.n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-de9.f(4.0f, getMeasuredHeight(), L)) * f4);
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            int L2 = ((gl.L(1.0f) + measuredWidth) * i) + gl.L(f2);
            RectF rectF = gl.P;
            float f5 = L2;
            float f6 = L2 + measuredWidth;
            rectF.set(0.0f, f5, measuredWidth, f6);
            canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), paint2);
            rectF.set(gl.L(1.0f) + measuredWidth, f5, de9.w(1.0f, measuredWidth, measuredWidth), f6);
            canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), paint2);
            i++;
            f2 = f2;
        }
        float f7 = f2;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gl.L(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - gl.L(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gl.L(4.0f), this.e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - gl.L(21.0f)) * f4) + gl.L(f7);
        RectF rectF2 = gl.P;
        rectF2.set(getMeasuredWidth() - gl.L(f7), measuredHeight, getMeasuredWidth(), gl.L(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, gl.L(1.5f), gl.L(1.5f), paint);
        float centerY = rectF2.centerY();
        float L3 = gl.L(0.5f) + measuredWidth;
        rectF2.set(L3 - gl.L(8.0f), centerY - gl.L(f7), L3 + gl.L(8.0f), centerY + gl.L(f7));
        canvas.drawRoundRect(rectF2, gl.L(f7), gl.L(f7), paint);
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

    @Override // tjb
    public final void updateColors() {
        try {
            Paint paint = this.b;
            int i = bkb.fg;
            paint.setColor(bm2.o(bkb.w0(null, i, false), 76));
            this.c.setColor(bkb.w0(null, i, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
