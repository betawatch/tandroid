// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o6a extends e0b {
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public float d;
    public final Paint e;

    public o6a(boolean z) {
        if (z) {
            Paint paint = new Paint(1);
            this.e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(gm.L(2.0f));
        }
    }

    @Override // e0b
    public final void b(int i) {
        Paint paint = this.e;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override // e0b
    public final void c(boolean z) {
        this.a = z;
    }

    @Override // e0b
    public final void d() {
        this.b = System.currentTimeMillis();
        this.c = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.e;
        if (paint == null) {
            paint = cmb.c2;
        }
        Paint paint2 = paint;
        int i = 0;
        while (i < 3) {
            if (i == 0) {
                paint2.setAlpha((int) (this.d * 255.0f));
            } else if (i == 2) {
                paint2.setAlpha((int) ((1.0f - this.d) * 255.0f));
            } else {
                paint2.setAlpha(nm7.d4);
            }
            float L = (gm.L(5.0f) * i) + (gm.L(5.0f) * this.d);
            float f = 8.0f;
            Canvas canvas2 = canvas;
            canvas2.drawLine(L, gm.L(this.a ? 3.0f : 4.0f), L + gm.L(4.0f), gm.L(this.a ? 7.0f : 8.0f), paint2);
            float L2 = gm.L(this.a ? 11.0f : 12.0f);
            float L3 = L + gm.L(4.0f);
            if (this.a) {
                f = 7.0f;
            }
            canvas2.drawLine(L, L2, L3, gm.L(f), paint2);
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

    @Override // e0b
    public final void e() {
        this.c = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gm.L(14.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gm.L(18.0f);
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
