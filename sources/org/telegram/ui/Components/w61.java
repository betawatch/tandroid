package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class w61 extends Drawable {
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
    public v61 n;
    public long o;
    public String p;
    public float q;

    public w61(boolean z10) {
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Path path = new Path();
        this.c = path;
        this.q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.c.close();
    }

    public final void a() {
        v61 v61Var = this.n;
        if (v61Var != null) {
            v61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.j;
    }

    public final void c(org.telegram.ui.ss0 ss0Var) {
        this.n = ss0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.k) {
            return;
        }
        if (z11 != z10) {
            this.o = 0L;
            this.p = null;
        }
        this.d = z10;
        this.j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0284  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f7;
        Rect bounds = getBounds();
        int width = ((bounds.width() - AndroidUtilities.dp(32.0f)) / 2) + bounds.left;
        int height = ((bounds.height() - AndroidUtilities.dp(32.0f)) / 2) + bounds.top;
        int z10 = this.d ? org.telegram.messenger.w1.z(16.0f, bounds.width() / 4, width) : org.telegram.messenger.w1.C(16.0f, bounds.width() / 4, width);
        canvas.save();
        if (this.e) {
            if (this.f == null) {
                this.f = new Path();
            }
            int i10 = bounds.left + (bounds.top << 8) + (bounds.bottom << 16) + (bounds.right << 24);
            if (this.g != i10) {
                this.f.reset();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(bounds);
                this.f.addOval(rectF, Path.Direction.CCW);
                this.g = i10;
            }
            canvas.clipPath(this.f);
        } else {
            canvas.clipRect(bounds.left, bounds.top, bounds.right, bounds.bottom);
        }
        boolean z11 = this.k;
        TextPaint textPaint = this.b;
        Paint paint = this.a;
        if (z11) {
            float f10 = this.h;
            if (f10 <= 0.7f) {
                paint.setAlpha((int) (Math.min(1.0f, f10 / 0.3f) * 80.0f));
                textPaint.setAlpha((int) (Math.min(1.0f, this.h / 0.3f) * 255.0f));
            } else {
                paint.setAlpha((int) ((1.0f - ((f10 - 0.7f) / 0.3f)) * 80.0f));
                textPaint.setAlpha((int) ((1.0f - ((this.h - 0.7f) / 0.3f)) * 255.0f));
            }
        } else {
            paint.setAlpha((int) (this.i * 80.0f));
            textPaint.setAlpha((int) (this.i * 255.0f));
        }
        canvas.drawCircle(((Math.max(bounds.width(), bounds.height()) / 4) * (this.d ? -1 : 1)) + z10, AndroidUtilities.dp(16.0f) + height, Math.max(bounds.width(), bounds.height()) / 2, paint);
        canvas.restore();
        String str = this.p;
        if (str != null) {
            canvas.drawText(str, (AndroidUtilities.dp(32.0f) * (this.d ? -1 : 1)) + z10, AndroidUtilities.dp(15.0f) + AndroidUtilities.dp(32.0f) + height, textPaint);
        }
        canvas.save();
        float f11 = this.q;
        float f12 = z10;
        float f13 = height;
        canvas.scale(f11, f11, f12, (AndroidUtilities.dp(32.0f) / 2.0f) + f13);
        if (this.d) {
            canvas.rotate(180.0f, f12, (AndroidUtilities.dp(32.0f) / 2) + height);
        }
        canvas.translate(f12, f13);
        float f14 = this.h;
        Path path = this.c;
        if (f14 <= 0.6f) {
            int min = f14 < 0.4f ? Math.min(255, (int) ((f14 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f14 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.k) {
                min = (int) (min * this.i);
            }
            paint.setAlpha(min);
            canvas.drawPath(path, paint);
        }
        canvas.translate(AndroidUtilities.dp(18.0f), 0.0f);
        float f15 = this.h;
        if (f15 >= 0.2f && f15 <= 0.8f) {
            float f16 = f15 - 0.2f;
            int min2 = f16 < 0.4f ? Math.min(255, (int) ((f16 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f16 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.k) {
                min2 = (int) (min2 * this.i);
            }
            paint.setAlpha(min2);
            canvas.drawPath(path, paint);
        }
        canvas.translate(AndroidUtilities.dp(18.0f), 0.0f);
        float f17 = this.h;
        if (f17 >= 0.4f && f17 <= 1.0f) {
            float f18 = f17 - 0.4f;
            int min3 = f18 < 0.4f ? Math.min(255, (int) ((f18 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f18 - 0.4f) / 0.2f)) * 255.0f);
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
        float f19 = this.h;
        if (f19 < 1.0f) {
            float f20 = (j3 / 800.0f) + f19;
            this.h = f20;
            if (this.k) {
                if (f20 >= 1.0f) {
                    this.h = 0.0f;
                    this.j = false;
                    this.o = 0L;
                    this.p = null;
                }
            } else if (f20 >= 1.0f) {
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
        boolean z12 = this.l;
        if (z12) {
            float f21 = this.i;
            if (f21 != 1.0f) {
                this.i = f21 + 0.10666667f;
                a();
                f7 = this.i;
                if (f7 >= 0.0f) {
                    this.i = 0.0f;
                    return;
                } else {
                    if (f7 > 1.0f) {
                        this.i = 1.0f;
                        return;
                    }
                    return;
                }
            }
        }
        if (!z12) {
            float f22 = this.i;
            if (f22 != 0.0f) {
                this.i = f22 - 0.10666667f;
                a();
            }
        }
        f7 = this.i;
        if (f7 >= 0.0f) {
        }
    }

    public final void e(boolean z10) {
        if (this.k != z10) {
            this.k = z10;
            this.p = null;
            this.o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.l = z10;
        a();
    }

    public final void g(long j3) {
        this.o = j3;
        if (j3 >= 1000) {
            this.p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.p = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.setAlpha(i10);
        this.b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
