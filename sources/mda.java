// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Random;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mda extends View implements vlb {
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
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), nm7.d4, 31);
        float f2 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - gm.L(3.0f);
        int L = gm.L(1.0f) + ((gm.L(1.0f) + measuredWidth) * 7);
        d53 d53Var = d53.g;
        float f3 = this.f;
        float interpolation = d53Var.getInterpolation(f3 > 0.4f ? (f3 - 0.4f) / 0.6f : 0.0f);
        float f4 = (this.n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-hg9.f(4.0f, getMeasuredHeight(), L)) * f4);
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            int L2 = ((gm.L(1.0f) + measuredWidth) * i) + gm.L(f2);
            RectF rectF = gm.P;
            float f5 = L2;
            float f6 = L2 + measuredWidth;
            rectF.set(0.0f, f5, measuredWidth, f6);
            canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), paint2);
            rectF.set(gm.L(1.0f) + measuredWidth, f5, hg9.v(1.0f, measuredWidth, measuredWidth), f6);
            canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), paint2);
            i++;
            f2 = f2;
        }
        float f7 = f2;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gm.L(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - gm.L(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gm.L(4.0f), this.e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - gm.L(21.0f)) * f4) + gm.L(f7);
        RectF rectF2 = gm.P;
        rectF2.set(getMeasuredWidth() - gm.L(f7), measuredHeight, getMeasuredWidth(), gm.L(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, gm.L(1.5f), gm.L(1.5f), paint);
        float centerY = rectF2.centerY();
        float L3 = gm.L(0.5f) + measuredWidth;
        rectF2.set(L3 - gm.L(8.0f), centerY - gm.L(f7), L3 + gm.L(8.0f), centerY + gm.L(f7));
        canvas.drawRoundRect(rectF2, gm.L(f7), gm.L(f7), paint);
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

    @Override // vlb
    public final void updateColors() {
        try {
            Paint paint = this.b;
            int i = cmb.fg;
            paint.setColor(on2.p(cmb.w0(null, i, false), 76));
            this.c.setColor(cmb.w0(null, i, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
