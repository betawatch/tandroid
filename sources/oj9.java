// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oj9 extends bya {
    public float d;
    public final Paint f;
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public int e = 1;

    public oj9(boolean z) {
        if (z) {
            this.f = new Paint(1);
        }
    }

    @Override // bya
    public final void b(int i) {
        Paint paint = this.f;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override // bya
    public final void c(boolean z) {
        this.a = z;
    }

    @Override // bya
    public final void d() {
        this.b = System.currentTimeMillis();
        this.c = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f;
        if (paint == null) {
            paint = bkb.b2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        canvas.drawCircle(gl.L(6.0f), gl.L(this.a ? 8.0f : 9.0f), gl.L(4.0f), paint);
        if (this.c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.b;
            this.b = currentTimeMillis;
            if (j > 50) {
                j = 50;
            }
            float f = this.d;
            int i = this.e;
            float f2 = ((i * j) / 400.0f) + f;
            this.d = f2;
            if (i > 0 && f2 >= 1.0f) {
                this.e = -1;
                this.d = 1.0f;
            } else if (i < 0 && f2 <= 0.0f) {
                this.e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override // bya
    public final void e() {
        this.c = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gl.L(10.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gl.L(12.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
