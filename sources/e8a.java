// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class e8a extends d2b {
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public float d;
    public final Paint e;

    public e8a(boolean z) {
        if (z) {
            Paint paint = new Paint(1);
            this.e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(hl.L(2.0f));
        }
    }

    @Override // d2b
    public final void b(int i) {
        Paint paint = this.e;
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
        Paint paint = this.e;
        if (paint == null) {
            paint = aob.d2;
        }
        Paint paint2 = paint;
        int i = 0;
        while (i < 3) {
            if (i == 0) {
                paint2.setAlpha((int) (this.d * 255.0f));
            } else if (i == 2) {
                paint2.setAlpha((int) ((1.0f - this.d) * 255.0f));
            } else {
                paint2.setAlpha(jn7.d4);
            }
            float L = (hl.L(5.0f) * i) + (hl.L(5.0f) * this.d);
            float f = 8.0f;
            Canvas canvas2 = canvas;
            canvas2.drawLine(L, hl.L(this.a ? 3.0f : 4.0f), L + hl.L(4.0f), hl.L(this.a ? 7.0f : 8.0f), paint2);
            float L2 = hl.L(this.a ? 11.0f : 12.0f);
            float L3 = L + hl.L(4.0f);
            if (this.a) {
                f = 7.0f;
            }
            canvas2.drawLine(L, L2, L3, hl.L(f), paint2);
            i++;
            canvas = canvas2;
        }
        if (!this.c) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.b;
        this.b = currentTimeMillis;
        if (j > 50) {
            j = 50;
        }
        this.d = (j / 500.0f) + this.d;
        while (true) {
            float f2 = this.d;
            if (f2 <= 1.0f) {
                a();
                return;
            }
            this.d = f2 - 1.0f;
        }
    }

    @Override // d2b
    public final void e() {
        this.c = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(14.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(18.0f);
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
