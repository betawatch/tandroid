// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gd0 extends Drawable {
    public final Paint a;
    public boolean b;
    public long c;
    public float d;
    public float e;
    public int f;
    public final boolean g;
    public final DecelerateInterpolator h;
    public int i;
    public int j;
    public float k;
    public short l;

    public gd0(boolean z) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.i = -1;
        this.j = -9079435;
        this.k = 300.0f;
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(hl.L(2.0f));
        paint2.setColor(-65536);
        this.g = z;
    }

    public final void a(int i) {
        this.i = i;
        invalidateSelf();
    }

    public final void b(int i) {
        this.j = i;
        invalidateSelf();
    }

    public final void c(boolean z, float f) {
        this.c = 0L;
        float f2 = this.e;
        if (f2 == 1.0f) {
            this.b = true;
        } else if (f2 == 0.0f) {
            this.b = false;
        }
        this.c = 0L;
        if (z) {
            float f3 = this.k;
            if (f2 < f) {
                this.f = (int) (f2 * f3);
            } else {
                this.f = (int) ((1.0f - f2) * f3);
            }
            this.c = System.currentTimeMillis();
            this.d = f;
        } else {
            this.e = f;
            this.d = f;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.e != this.d) {
            if (this.c != 0) {
                int currentTimeMillis = this.f + ((int) (System.currentTimeMillis() - this.c));
                this.f = currentTimeMillis;
                float f = currentTimeMillis;
                float f2 = this.k;
                if (f >= f2) {
                    this.e = this.d;
                } else {
                    float f3 = this.e;
                    float f4 = this.d;
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    float f5 = f / f2;
                    if (f3 < f4) {
                        this.e = decelerateInterpolator.getInterpolation(f5) * this.d;
                    } else {
                        this.e = 1.0f - decelerateInterpolator.getInterpolation(f5);
                    }
                }
            }
            this.c = System.currentTimeMillis();
            invalidateSelf();
        }
        int f6 = vm2.f(this.e, this.i, this.j);
        Paint paint = this.a;
        paint.setColor(f6);
        canvas.save();
        canvas.translate(hl.L(24.0f) / 2.0f, hl.L(24.0f) / 2.0f);
        short s = this.l;
        if (s != 0) {
            canvas.rotate(s);
        }
        float f7 = this.e;
        canvas.translate(-hl.L(0.66f), 0.0f);
        float f8 = this.e;
        boolean z = this.b;
        if (this.g) {
            canvas.rotate((f8 * (z ? -180 : jn7.J2)) + 135.0f);
            f7 = 1.0f;
        } else {
            canvas.rotate(f8 * (z ? -225 : 135));
        }
        float f9 = 1.0f - f7;
        canvas.drawLine(hl.L(hl.R1(-6.75f, -8.0f, f7)), 0.0f, hl.L(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f9), 0.0f, paint);
        float L = hl.L(-0.25f);
        float L2 = hl.L(hl.R1(7.0f, 8.0f, f7)) - ((paint.getStrokeWidth() / 4.0f) * f9);
        float L3 = hl.L(hl.R1(-7.25f, 0.0f, f7));
        canvas.drawLine(L3, -L, 0.0f, -L2, paint);
        canvas.drawLine(L3, L, 0.0f, L2, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
