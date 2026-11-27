// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cn9 extends d2b {
    public float d;
    public final Paint f;
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public int e = 1;

    public cn9(boolean z) {
        if (z) {
            this.f = new Paint(1);
        }
    }

    @Override // d2b
    public final void b(int i) {
        Paint paint = this.f;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override // d2b
    public final void c(boolean z) {
        this.a = z;
    }

    @Override // d2b
    public final void d() {
        this.b = System.currentTimeMillis();
        this.c = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f;
        if (paint == null) {
            paint = aob.c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        canvas.drawCircle(hl.L(6.0f), hl.L(this.a ? 8.0f : 9.0f), hl.L(4.0f), paint);
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

    @Override // d2b
    public final void e() {
        this.c = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(10.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(12.0f);
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
