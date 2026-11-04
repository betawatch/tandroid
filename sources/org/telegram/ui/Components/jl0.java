package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jl0 extends Drawable {
    public final Paint b;
    public boolean f;
    public int j;
    public boolean m;
    public ci.c8 o;
    public float p;
    public float q;
    public float r;
    public int a = org.telegram.messenger.hs.e4;
    public final Path c = new Path();
    public final RectF d = new RectF();
    public long e = -1;
    public float g = 0.0f;
    public float h = 0.0f;
    public final float[] i = new float[2];
    public int k = 0;
    public boolean l = false;
    public final u5 n = new u5(1.0f, new jb0(this, 19), 0, 350, xq.h);

    public jl0() {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.333f));
    }

    public final void a(int i3) {
        Paint paint = this.b;
        paint.setColor(i3);
        this.a = paint.getAlpha();
        paint.setAlpha(org.telegram.messenger.hs.e4);
    }

    public final void b(int i3) {
        c(i3, true, false);
    }

    public final void c(int i3, boolean z10, boolean z11) {
        if (this.k == i3) {
            if (i3 != 2) {
                org.telegram.messenger.g0.r(this.o);
                this.o = null;
                return;
            }
            return;
        }
        if (!z11 && i3 == 2) {
            if (this.o == null) {
                ci.c8 c8Var = new ci.c8(this, i3, z10, 5);
                this.o = c8Var;
                org.telegram.messenger.g0.i3(c8Var, 65L);
                return;
            }
            return;
        }
        ci.c8 c8Var2 = this.o;
        if (c8Var2 != null) {
            org.telegram.messenger.g0.r(c8Var2);
        }
        u5 u5Var = this.n;
        boolean z12 = false;
        if (u5Var.c < 1.0f && z10) {
            c(this.k, false, false);
        }
        if (i3 == 2) {
            this.g = 180.0f;
            this.e = -1L;
        } else if (this.k == 2) {
            if (i3 == 0) {
                this.h = -45.0f;
            } else {
                this.h = 0.0f;
            }
        }
        if (z10) {
            int i10 = this.k;
            this.j = i10;
            this.k = i3;
            if (i10 == 2 && i3 != 2) {
                z12 = true;
            }
            this.l = z12;
            u5Var.e(true, 0.0f);
        } else {
            this.k = i3;
            this.j = i3;
            this.l = false;
            u5Var.e(true, 1.0f);
        }
        invalidateSelf();
    }

    public final float d(float f10) {
        return a1.g.D(0.5f, f10, this.p, this.q);
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
        boolean z10;
        Rect bounds = getBounds();
        this.p = Math.min(bounds.width(), bounds.height());
        this.q = bounds.centerX();
        this.r = bounds.centerY();
        int i3 = this.a;
        if (i3 < 255) {
            float f15 = bounds.left;
            float f16 = bounds.top;
            float f17 = bounds.right;
            float f18 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f15, f16, f17, f18, i3, 31);
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
            boolean z11 = true;
            float T1 = org.telegram.messenger.g0.T1(d(0.25f), d(0.444f), f19);
            float T12 = org.telegram.messenger.g0.T1(e(0.5f), e(0.444f), f19);
            float T13 = org.telegram.messenger.g0.T1(0.0f, this.p * 0.208f, f19);
            r19 = z11;
            if (T13 >= this.p * 0.075f) {
                canvas2.drawCircle(T1, T12, T13, paint);
                r19 = z11;
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
            float d10 = ((this.j == 2 ? d(0.75f) : d(0.2409f)) * f21) + (d(0.2409f) * f20) + (d(0.658f) * f19);
            float e12 = e(0.5f);
            if (a7.h.a(d, e11, d10, e12) <= this.p * 0.075f) {
                f11 = f21;
                f12 = 0.0f;
                f13 = 0.5f;
                f14 = 0.25f;
            } else {
                f11 = f21;
                f12 = 0.0f;
                f13 = 0.5f;
                f14 = 0.25f;
                canvas2.drawLine(d, e11, d10, e12, paint);
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
            float d11 = (d(0.2452f) * f20) + T14;
            float T15 = org.telegram.messenger.g0.T1(e(f13), e(f14), f20);
            float e13 = e(f13);
            float d12 = (d(0.2452f) * f20) + T14;
            float T16 = org.telegram.messenger.g0.T1(e(f13), e(0.75f), f20);
            if (Math.max(a7.h.a(d11, T15, T14, e13), a7.h.a(d12, T16, T14, e13)) > this.p * 0.075f) {
                Path path = this.c;
                path.rewind();
                path.moveTo(d11, T15);
                path.lineTo(T14, e13);
                path.lineTo(d12, T16);
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
                boolean z12 = (f28 <= f29 ? f24 < f28 || f24 > f29 : f24 < f28 && f24 > f29) ? r23 : r19;
                boolean z13 = this.l;
                if (z13 && !this.m) {
                    this.m = z13;
                    this.f = z12;
                }
                if (!this.f || z12) {
                    z10 = r23;
                } else {
                    z10 = r23;
                    this.f = z10;
                }
                if (z13 && z12 && !this.f) {
                    this.l = z10;
                }
                float d13 = d(f14);
                float e14 = e(f14);
                float d14 = d(0.75f);
                float e15 = e(0.75f);
                float f30 = f22;
                RectF rectF = this.d;
                rectF.set(d13, e14, d14, e15);
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
        return a1.g.D(0.5f, f10, this.p, this.r);
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
    public final void setAlpha(int i3) {
        this.a = i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
