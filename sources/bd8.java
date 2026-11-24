// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bd8 extends bya {
    public boolean a = false;
    public final Paint b = new Paint(1);
    public final int c = y6c.t0;
    public long d = 0;
    public boolean e = false;
    public final RectF f = new RectF();
    public float g;
    public final boolean h;
    public final wjb i;

    public bd8(wjb wjbVar, boolean z) {
        this.h = z;
        this.i = wjbVar;
    }

    @Override // bya
    public final void c(boolean z) {
        this.a = z;
    }

    @Override // bya
    public final void d() {
        this.d = System.currentTimeMillis();
        this.e = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L = gl.L(10.0f);
        int L2 = ((gl.L(18.0f) - L) / 2) + getBounds().top;
        if (!this.a) {
            L2 += gl.L(1.0f);
        }
        int i = L2;
        boolean z = this.h;
        int v0 = bkb.v0(z ? bkb.o9 : bkb.oa, this.i);
        Paint paint = this.b;
        paint.setColor(v0);
        RectF rectF = this.f;
        rectF.set(0.0f, i, L, i + L);
        float f = this.g;
        float f2 = 0.5f;
        int e = (int) (f < 0.5f ? de9.e(f, 0.5f, 1.0f, 35.0f) : ((f - 0.5f) * 35.0f) / 0.5f);
        int i2 = 0;
        while (i2 < 3) {
            float L3 = gl.L(9.2f) + (gl.L(5.0f) * i2);
            float L4 = gl.L(5.0f);
            float f3 = f2;
            float f4 = this.g;
            float f5 = L3 - (L4 * f4);
            if (i2 == 2) {
                paint.setAlpha(Math.min(kk7.d4, (int) ((f4 * 255.0f) / f3)));
            } else if (i2 != 0) {
                paint.setAlpha(kk7.d4);
            } else if (f4 > f3) {
                paint.setAlpha((int) ((1.0f - ((f4 - f3) / f3)) * 255.0f));
            } else {
                paint.setAlpha(kk7.d4);
            }
            canvas.drawCircle(f5, (L / 2) + i, gl.L(1.2f), paint);
            i2++;
            f2 = f3;
        }
        paint.setAlpha(kk7.d4);
        canvas.drawArc(rectF, e, 360 - (e << 1), true, paint);
        paint.setColor(bkb.w0(null, z ? bkb.c6 : bkb.r8, false));
        canvas.drawCircle(gl.L(4.0f), ((L / 2) + i) - gl.L(2.0f), gl.L(1.0f), paint);
        f();
    }

    @Override // bya
    public final void e() {
        this.g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (kk7.f(this.c).g()) {
                gl.d3(new w88(this, (byte) 12), 100L);
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
        return gl.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gl.L(20.0f);
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
