package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class fl0 extends Drawable {
    public final Paint b;
    public boolean f;
    public int j;
    public boolean m;
    public bi.c9 o;
    public float p;
    public float q;
    public float r;
    public int a = org.telegram.messenger.qs.e4;
    public final Path c = new Path();
    public final RectF d = new RectF();
    public long e = -1;
    public float g = 0.0f;
    public float h = 0.0f;
    public final float[] i = new float[2];
    public int k = 0;
    public boolean l = false;
    public final w5 n = new w5(1.0f, new ob0(this, 17), 0, 350, xq.h);

    public fl0() {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.333f));
    }

    public final void a(int i7) {
        Paint paint = this.b;
        paint.setColor(i7);
        this.a = paint.getAlpha();
        paint.setAlpha(org.telegram.messenger.qs.e4);
    }

    public final void b(int i7) {
        c(i7, true, false);
    }

    public final void c(int i7, boolean z9, boolean z10) {
        if (this.k == i7) {
            if (i7 != 2) {
                org.telegram.messenger.g0.r(this.o);
                this.o = null;
                return;
            }
            return;
        }
        if (!z10 && i7 == 2) {
            if (this.o == null) {
                bi.c9 c9Var = new bi.c9(this, i7, z9, 5);
                this.o = c9Var;
                org.telegram.messenger.g0.i3(c9Var, 65L);
                return;
            }
            return;
        }
        bi.c9 c9Var2 = this.o;
        if (c9Var2 != null) {
            org.telegram.messenger.g0.r(c9Var2);
        }
        w5 w5Var = this.n;
        boolean z11 = false;
        if (w5Var.c < 1.0f && z9) {
            c(this.k, false, false);
        }
        if (i7 == 2) {
            this.g = 180.0f;
            this.e = -1L;
        } else if (this.k == 2) {
            if (i7 == 0) {
                this.h = -45.0f;
            } else {
                this.h = 0.0f;
            }
        }
        if (z9) {
            int i10 = this.k;
            this.j = i10;
            this.k = i7;
            if (i10 == 2 && i7 != 2) {
                z11 = true;
            }
            this.l = z11;
            w5Var.e(true, 0.0f);
        } else {
            this.k = i7;
            this.j = i7;
            this.l = false;
            w5Var.e(true, 1.0f);
        }
        invalidateSelf();
    }

    public final float d(float f10) {
        return com.google.android.recaptcha.internal.a.v(0.5f, f10, this.p, this.q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        ?? r19;
        float f10;
        ?? r23;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z9;
        Rect bounds = getBounds();
        this.p = Math.min(bounds.width(), bounds.height());
        this.q = bounds.centerX();
        this.r = bounds.centerY();
        int i7 = this.a;
        if (i7 < 255) {
            float f15 = bounds.left;
            float f16 = bounds.top;
            float f17 = bounds.right;
            float f18 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f15, f16, f17, f18, i7, 31);
        } else {
            canvas2 = canvas;
        }
        float e10 = this.n.e(false, this.l ? 0.0f : 1.0f);
        int i10 = this.k;
        int i11 = this.j;
        float f19 = i10 == 0 ? i11 == 0 ? 1.0f : e10 : i11 == 0 ? 1.0f - e10 : 0.0f;
        int i12 = this.j;
        float f20 = i10 == 1 ? i12 == 1 ? 1.0f : e10 : i12 == 1 ? 1.0f - e10 : 0.0f;
        float f21 = i10 == 2 ? this.j == 2 ? 1.0f : e10 : this.j == 2 ? 1.0f - e10 : 0.0f;
        Paint paint = this.b;
        if (f19 > 0.0f) {
            boolean z10 = true;
            float T1 = org.telegram.messenger.g0.T1(d(0.25f), d(0.444f), f19);
            float T12 = org.telegram.messenger.g0.T1(e(0.5f), e(0.444f), f19);
            float T13 = org.telegram.messenger.g0.T1(0.0f, this.p * 0.208f, f19);
            r19 = z10;
            if (T13 >= this.p * 0.075f) {
                canvas2.drawCircle(T1, T12, T13, paint);
                r19 = z10;
            }
        } else {
            r19 = 1;
        }
        if (f19 > 0.0f || f20 > 0.0f) {
            canvas2.save();
            f10 = 45.0f;
            canvas2.rotate(f19 * 45.0f, this.q, this.r);
            float d = ((this.j == 2 ? d(0.75f) : d(0.2409f)) * f21) + (d(0.7638f) * f20) + (d(0.914f) * f19);
            float e11 = e(0.5f);
            r23 = 0;
            float d2 = ((this.j == 2 ? d(0.75f) : d(0.2409f)) * f21) + (d(0.2409f) * f20) + (d(0.658f) * f19);
            float e12 = e(0.5f);
            if (a8.r9.a(d, e11, d2, e12) <= this.p * 0.075f) {
                f11 = f21;
                f12 = 0.0f;
                f13 = 0.5f;
                f14 = 0.25f;
            } else {
                f11 = f21;
                f12 = 0.0f;
                f13 = 0.5f;
                f14 = 0.25f;
                canvas2.drawLine(d, e11, d2, e12, paint);
            }
            canvas2.restore();
        } else {
            f10 = 45.0f;
            f12 = 0.0f;
            r23 = 0;
            f14 = 0.25f;
            f11 = f21;
            f13 = 0.5f;
        }
        if (f20 > f12) {
            float T14 = this.j == 2 ? org.telegram.messenger.g0.T1(d(0.75f), d(0.2409f), f20) : d(0.2409f);
            canvas2.save();
            canvas2.rotate(f19 * f10, this.q, this.r);
            float d10 = (d(0.2452f) * f20) + T14;
            float T15 = org.telegram.messenger.g0.T1(e(f13), e(f14), f20);
            float e13 = e(f13);
            float d11 = (d(0.2452f) * f20) + T14;
            float T16 = org.telegram.messenger.g0.T1(e(f13), e(0.75f), f20);
            if (Math.max(a8.r9.a(d10, T15, T14, e13), a8.r9.a(d11, T16, T14, e13)) > this.p * 0.075f) {
                Path path = this.c;
                path.rewind();
                path.moveTo(d10, T15);
                path.lineTo(T14, e13);
                path.lineTo(d11, T16);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f11 > f12) {
            if (this.e < 0 && f11 > 0.8f) {
                this.e = System.currentTimeMillis();
                this.m = this.l;
            }
            if (this.e > 0) {
                float[] fArr = this.i;
                cp.a((System.currentTimeMillis() - this.e) % 5400.0f, fArr);
                float f22 = fArr[r23];
                float f23 = fArr[r19];
                if (this.k != 2 && !this.l) {
                    float max = Math.max(f12, (((float) Math.floor((f22 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f23 = Math.min(f23, this.h + max);
                    f22 = org.telegram.messenger.g0.T1(f23, Math.min(f22, max + this.h), f11);
                }
                float f24 = this.h;
                float f25 = this.g;
                float f26 = f25 + f22;
                float f27 = f25 + f23;
                float f28 = f26 % 360.0f;
                if (f28 < 0.0f) {
                    f28 += 360.0f;
                }
                float f29 = f27 % 360.0f;
                if (f29 < 0.0f) {
                    f29 += 360.0f;
                }
                boolean z11 = (f28 <= f29 ? f24 < f28 || f24 > f29 : f24 < f28 && f24 > f29) ? r23 : r19;
                boolean z12 = this.l;
                if (z12 && !this.m) {
                    this.m = z12;
                    this.f = z11;
                }
                if (!this.f || z11) {
                    z9 = r23;
                } else {
                    z9 = r23;
                    this.f = z9;
                }
                if (z12 && z11 && !this.f) {
                    this.l = z9;
                }
                float d12 = d(f14);
                float e14 = e(f14);
                float d13 = d(0.75f);
                float e15 = e(0.75f);
                float f30 = f22;
                RectF rectF = this.d;
                rectF.set(d12, e14, d13, e15);
                canvas2.drawArc(rectF, this.g + f30, f23 - f30, false, paint);
                invalidateSelf();
            }
        }
        if (this.a < 255) {
            canvas.restore();
        }
        if (e10 < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f10) {
        return com.google.android.recaptcha.internal.a.v(0.5f, f10, this.p, this.r);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.a = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
