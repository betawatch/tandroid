// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class df8 extends e0b {
    public boolean a = false;
    public final Paint b = new Paint(1);
    public final int c = z8c.t0;
    public long d = 0;
    public boolean e = false;
    public final RectF f = new RectF();
    public float g;
    public final boolean h;
    public final ylb i;

    public df8(ylb ylbVar, boolean z) {
        this.h = z;
        this.i = ylbVar;
    }

    @Override // e0b
    public final void c(boolean z) {
        this.a = z;
    }

    @Override // e0b
    public final void d() {
        this.d = System.currentTimeMillis();
        this.e = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L = gm.L(10.0f);
        int L2 = ((gm.L(18.0f) - L) / 2) + getBounds().top;
        if (!this.a) {
            L2 += gm.L(1.0f);
        }
        int i = L2;
        boolean z = this.h;
        int v0 = cmb.v0(z ? cmb.o9 : cmb.oa, this.i);
        Paint paint = this.b;
        paint.setColor(v0);
        RectF rectF = this.f;
        rectF.set(0.0f, i, L, i + L);
        float f = this.g;
        float f2 = 0.5f;
        int e = (int) (f < 0.5f ? hg9.e(f, 0.5f, 1.0f, 35.0f) : ((f - 0.5f) * 35.0f) / 0.5f);
        int i2 = 0;
        while (i2 < 3) {
            float L3 = gm.L(9.2f) + (gm.L(5.0f) * i2);
            float L4 = gm.L(5.0f);
            float f3 = f2;
            float f4 = this.g;
            float f5 = L3 - (L4 * f4);
            if (i2 == 2) {
                paint.setAlpha(Math.min(nm7.d4, (int) ((f4 * 255.0f) / f3)));
            } else if (i2 != 0) {
                paint.setAlpha(nm7.d4);
            } else if (f4 > f3) {
                paint.setAlpha((int) ((1.0f - ((f4 - f3) / f3)) * 255.0f));
            } else {
                paint.setAlpha(nm7.d4);
            }
            canvas.drawCircle(f5, (L / 2) + i, gm.L(1.2f), paint);
            i2++;
            f2 = f3;
        }
        paint.setAlpha(nm7.d4);
        canvas.drawArc(rectF, e, 360 - (e << 1), true, paint);
        paint.setColor(cmb.w0(null, z ? cmb.c6 : cmb.r8, false));
        canvas.drawCircle(gm.L(4.0f), ((L / 2) + i) - gm.L(2.0f), gm.L(1.0f), paint);
        f();
    }

    @Override // e0b
    public final void e() {
        this.g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (nm7.f(this.c).g()) {
                gm.d3(new q78(this, (byte) 19), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (j > 50) {
                j = 50;
            }
            float f = this.g;
            if (f >= 1.0f) {
                f = 0.0f;
                this.g = 0.0f;
            }
            float f2 = (j / 300.0f) + f;
            this.g = f2;
            if (f2 > 1.0f) {
                this.g = 1.0f;
            }
            a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gm.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gm.L(20.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
