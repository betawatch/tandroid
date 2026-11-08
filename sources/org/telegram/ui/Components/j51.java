package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j51 extends Drawable {
    public static final int[] r = {10, 7, 26, 16, 10, 25};
    public final Paint a;
    public final TextPaint b;
    public final Path c;
    public boolean d;
    public final boolean e;
    public Path f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public boolean l;
    public long m;
    public i51 n;
    public long o;
    public String p;
    public float q;

    public j51(boolean z9) {
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Path path = new Path();
        this.c = path;
        this.q = 1.0f;
        this.e = z9;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.c.close();
    }

    public final void a() {
        i51 i51Var = this.n;
        if (i51Var != null) {
            i51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.j;
    }

    public final void c(org.telegram.ui.ro0 ro0Var) {
        this.n = ro0Var;
    }

    public final void d(boolean z9) {
        boolean z10 = this.d;
        if (z10 == z9 && this.h >= 1.0f && this.k) {
            return;
        }
        if (z10 != z9) {
            this.o = 0L;
            this.p = null;
        }
        this.d = z9;
        this.j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0273  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f10;
        Rect bounds = getBounds();
        int width = ((bounds.width() - org.telegram.messenger.g0.L(32.0f)) / 2) + bounds.left;
        int height = ((bounds.height() - org.telegram.messenger.g0.L(32.0f)) / 2) + bounds.top;
        int B = this.d ? org.telegram.messenger.k5.B(16.0f, bounds.width() / 4, width) : org.telegram.messenger.k5.C(16.0f, bounds.width() / 4, width);
        canvas.save();
        if (this.e) {
            if (this.f == null) {
                this.f = new Path();
            }
            int i7 = bounds.left + (bounds.top << 8) + (bounds.bottom << 16) + (bounds.right << 24);
            if (this.g != i7) {
                this.f.reset();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(bounds);
                this.f.addOval(rectF, Path.Direction.CCW);
                this.g = i7;
            }
            canvas.clipPath(this.f);
        } else {
            canvas.clipRect(bounds.left, bounds.top, bounds.right, bounds.bottom);
        }
        boolean z9 = this.k;
        TextPaint textPaint = this.b;
        Paint paint = this.a;
        if (z9) {
            float f11 = this.h;
            if (f11 <= 0.7f) {
                paint.setAlpha((int) (Math.min(1.0f, f11 / 0.3f) * 80.0f));
                textPaint.setAlpha((int) (Math.min(1.0f, this.h / 0.3f) * 255.0f));
            } else {
                paint.setAlpha((int) ((1.0f - ((f11 - 0.7f) / 0.3f)) * 80.0f));
                textPaint.setAlpha((int) ((1.0f - ((this.h - 0.7f) / 0.3f)) * 255.0f));
            }
        } else {
            paint.setAlpha((int) (this.i * 80.0f));
            textPaint.setAlpha((int) (this.i * 255.0f));
        }
        canvas.drawCircle(((Math.max(bounds.width(), bounds.height()) / 4) * (this.d ? -1 : 1)) + B, org.telegram.messenger.g0.L(16.0f) + height, Math.max(bounds.width(), bounds.height()) / 2, paint);
        canvas.restore();
        String str = this.p;
        if (str != null) {
            canvas.drawText(str, (org.telegram.messenger.g0.L(32.0f) * (this.d ? -1 : 1)) + B, org.telegram.messenger.g0.L(15.0f) + org.telegram.messenger.g0.L(32.0f) + height, textPaint);
        }
        canvas.save();
        float f12 = this.q;
        float f13 = B;
        float f14 = height;
        canvas.scale(f12, f12, f13, (org.telegram.messenger.g0.L(32.0f) / 2.0f) + f14);
        if (this.d) {
            canvas.rotate(180.0f, f13, (org.telegram.messenger.g0.L(32.0f) / 2) + height);
        }
        canvas.translate(f13, f14);
        float f15 = this.h;
        Path path = this.c;
        if (f15 <= 0.6f) {
            int min = f15 < 0.4f ? Math.min(org.telegram.messenger.qs.e4, (int) ((f15 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f15 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.k) {
                min = (int) (min * this.i);
            }
            paint.setAlpha(min);
            canvas.drawPath(path, paint);
        }
        canvas.translate(org.telegram.messenger.g0.L(18.0f), 0.0f);
        float f16 = this.h;
        if (f16 >= 0.2f && f16 <= 0.8f) {
            float f17 = f16 - 0.2f;
            int min2 = f17 < 0.4f ? Math.min(org.telegram.messenger.qs.e4, (int) ((f17 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f17 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.k) {
                min2 = (int) (min2 * this.i);
            }
            paint.setAlpha(min2);
            canvas.drawPath(path, paint);
        }
        canvas.translate(org.telegram.messenger.g0.L(18.0f), 0.0f);
        float f18 = this.h;
        if (f18 >= 0.4f && f18 <= 1.0f) {
            float f19 = f18 - 0.4f;
            int min3 = f19 < 0.4f ? Math.min(org.telegram.messenger.qs.e4, (int) ((f19 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f19 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.k) {
                min3 = (int) (min3 * this.i);
            }
            paint.setAlpha(min3);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
        if (!this.j) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.m;
        if (j3 > 17) {
            j3 = 17;
        }
        this.m = currentTimeMillis;
        float f20 = this.h;
        if (f20 < 1.0f) {
            float f21 = (j3 / 800.0f) + f20;
            this.h = f21;
            if (this.k) {
                if (f21 >= 1.0f) {
                    this.h = 0.0f;
                    this.j = false;
                    this.o = 0L;
                    this.p = null;
                }
            } else if (f21 >= 1.0f) {
                if (this.l) {
                    this.h = 0.0f;
                } else {
                    this.h = 1.0f;
                }
            }
            a();
        }
        if (this.k) {
            return;
        }
        boolean z10 = this.l;
        if (z10) {
            float f22 = this.i;
            if (f22 != 1.0f) {
                this.i = f22 + 0.10666667f;
                a();
                f10 = this.i;
                if (f10 >= 0.0f) {
                    this.i = 0.0f;
                    return;
                } else {
                    if (f10 > 1.0f) {
                        this.i = 1.0f;
                        return;
                    }
                    return;
                }
            }
        }
        if (!z10) {
            float f23 = this.i;
            if (f23 != 0.0f) {
                this.i = f23 - 0.10666667f;
                a();
            }
        }
        f10 = this.i;
        if (f10 >= 0.0f) {
        }
    }

    public final void e(boolean z9) {
        if (this.k != z9) {
            this.k = z9;
            this.p = null;
            this.o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z9) {
        this.l = z9;
        a();
    }

    public final void g(long j3) {
        this.o = j3;
        if (j3 >= 1000) {
            this.p = org.telegram.messenger.id.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.p = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.a.setAlpha(i7);
        this.b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
