package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class im0 extends Drawable {
    public final Paint b;
    public boolean f;
    public int j;
    public boolean m;
    public i2.j0 o;
    public float p;
    public float q;
    public float r;
    public int a = org.telegram.messenger.zs.e4;
    public final Path c = new Path();
    public final RectF d = new RectF();
    public long e = -1;
    public float g = 0.0f;
    public float h = 0.0f;
    public final float[] i = new float[2];
    public int k = 0;
    public boolean l = false;
    public final t5 n = new t5(1.0f, new eb0(this, 22), 0, 350, gr.h);

    public im0() {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.333f));
    }

    public final void a(int i10) {
        Paint paint = this.b;
        paint.setColor(i10);
        this.a = paint.getAlpha();
        paint.setAlpha(org.telegram.messenger.zs.e4);
    }

    public final void b(int i10) {
        c(i10, true, false);
    }

    public final void c(int i10, boolean z10, boolean z11) {
        if (this.k == i10) {
            if (i10 != 2) {
                org.telegram.messenger.i0.r(this.o);
                this.o = null;
                return;
            }
            return;
        }
        if (!z11 && i10 == 2) {
            if (this.o == null) {
                i2.j0 j0Var = new i2.j0(this, i10, z10, 4);
                this.o = j0Var;
                org.telegram.messenger.i0.h3(j0Var, 65L);
                return;
            }
            return;
        }
        i2.j0 j0Var2 = this.o;
        if (j0Var2 != null) {
            org.telegram.messenger.i0.r(j0Var2);
        }
        t5 t5Var = this.n;
        boolean z12 = false;
        if (t5Var.c < 1.0f && z10) {
            c(this.k, false, false);
        }
        if (i10 == 2) {
            this.g = 180.0f;
            this.e = -1L;
        } else if (this.k == 2) {
            if (i10 == 0) {
                this.h = -45.0f;
            } else {
                this.h = 0.0f;
            }
        }
        if (z10) {
            int i11 = this.k;
            this.j = i11;
            this.k = i10;
            if (i11 == 2 && i10 != 2) {
                z12 = true;
            }
            this.l = z12;
            t5Var.e(true, 0.0f);
        } else {
            this.k = i10;
            this.j = i10;
            this.l = false;
            t5Var.e(true, 1.0f);
        }
        invalidateSelf();
    }

    public final float d(float f7) {
        return sc.e.z(0.5f, f7, this.p, this.q);
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
        float f7;
        ?? r23;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        Rect bounds = getBounds();
        this.p = Math.min(bounds.width(), bounds.height());
        this.q = bounds.centerX();
        this.r = bounds.centerY();
        int i10 = this.a;
        if (i10 < 255) {
            float f14 = bounds.left;
            float f15 = bounds.top;
            float f16 = bounds.right;
            float f17 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f14, f15, f16, f17, i10, 31);
        } else {
            canvas2 = canvas;
        }
        float e = this.n.e(false, this.l ? 0.0f : 1.0f);
        int i11 = this.k;
        int i12 = this.j;
        float f18 = i11 == 0 ? i12 == 0 ? 1.0f : e : i12 == 0 ? 1.0f - e : 0.0f;
        int i13 = this.j;
        float f19 = i11 == 1 ? i13 == 1 ? 1.0f : e : i13 == 1 ? 1.0f - e : 0.0f;
        float f20 = i11 == 2 ? this.j == 2 ? 1.0f : e : this.j == 2 ? 1.0f - e : 0.0f;
        Paint paint = this.b;
        if (f18 > 0.0f) {
            boolean z11 = true;
            float T1 = org.telegram.messenger.i0.T1(d(0.25f), d(0.444f), f18);
            float T12 = org.telegram.messenger.i0.T1(e(0.5f), e(0.444f), f18);
            float T13 = org.telegram.messenger.i0.T1(0.0f, this.p * 0.208f, f18);
            r19 = z11;
            if (T13 >= this.p * 0.075f) {
                canvas2.drawCircle(T1, T12, T13, paint);
                r19 = z11;
            }
        } else {
            r19 = 1;
        }
        if (f18 > 0.0f || f19 > 0.0f) {
            canvas2.save();
            f7 = 45.0f;
            canvas2.rotate(f18 * 45.0f, this.q, this.r);
            float d = ((this.j == 2 ? d(0.75f) : d(0.2409f)) * f20) + (d(0.7638f) * f19) + (d(0.914f) * f18);
            float e7 = e(0.5f);
            r23 = 0;
            float d10 = ((this.j == 2 ? d(0.75f) : d(0.2409f)) * f20) + (d(0.2409f) * f19) + (d(0.658f) * f18);
            float e10 = e(0.5f);
            if (w7.z8.a(d, e7, d10, e10) <= this.p * 0.075f) {
                f10 = f20;
                f11 = 0.0f;
                f12 = 0.5f;
                f13 = 0.25f;
            } else {
                f10 = f20;
                f11 = 0.0f;
                f12 = 0.5f;
                f13 = 0.25f;
                canvas2.drawLine(d, e7, d10, e10, paint);
            }
            canvas2.restore();
        } else {
            f7 = 45.0f;
            f11 = 0.0f;
            r23 = 0;
            f13 = 0.25f;
            f10 = f20;
            f12 = 0.5f;
        }
        if (f19 > f11) {
            float T14 = this.j == 2 ? org.telegram.messenger.i0.T1(d(0.75f), d(0.2409f), f19) : d(0.2409f);
            canvas2.save();
            canvas2.rotate(f18 * f7, this.q, this.r);
            float d11 = (d(0.2452f) * f19) + T14;
            float T15 = org.telegram.messenger.i0.T1(e(f12), e(f13), f19);
            float e11 = e(f12);
            float d12 = (d(0.2452f) * f19) + T14;
            float T16 = org.telegram.messenger.i0.T1(e(f12), e(0.75f), f19);
            if (Math.max(w7.z8.a(d11, T15, T14, e11), w7.z8.a(d12, T16, T14, e11)) > this.p * 0.075f) {
                Path path = this.c;
                path.rewind();
                path.moveTo(d11, T15);
                path.lineTo(T14, e11);
                path.lineTo(d12, T16);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f10 > f11) {
            if (this.e < 0 && f10 > 0.8f) {
                this.e = System.currentTimeMillis();
                this.m = this.l;
            }
            if (this.e > 0) {
                float[] fArr = this.i;
                kp.a((System.currentTimeMillis() - this.e) % 5400.0f, fArr);
                float f21 = fArr[r23];
                float f22 = fArr[r19];
                if (this.k != 2 && !this.l) {
                    float max = Math.max(f11, (((float) Math.floor((f21 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f22 = Math.min(f22, this.h + max);
                    f21 = org.telegram.messenger.i0.T1(f22, Math.min(f21, max + this.h), f10);
                }
                float f23 = this.h;
                float f24 = this.g;
                float f25 = f24 + f21;
                float f26 = f24 + f22;
                float f27 = f25 % 360.0f;
                if (f27 < 0.0f) {
                    f27 += 360.0f;
                }
                float f28 = f26 % 360.0f;
                if (f28 < 0.0f) {
                    f28 += 360.0f;
                }
                boolean z12 = (f27 <= f28 ? f23 < f27 || f23 > f28 : f23 < f27 && f23 > f28) ? r23 : r19;
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
                float d13 = d(f13);
                float e12 = e(f13);
                float d14 = d(0.75f);
                float e13 = e(0.75f);
                float f29 = f21;
                RectF rectF = this.d;
                rectF.set(d13, e12, d14, e13);
                canvas2.drawArc(rectF, this.g + f29, f22 - f29, false, paint);
                invalidateSelf();
            }
        }
        if (this.a < 255) {
            canvas.restore();
        }
        if (e < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f7) {
        return sc.e.z(0.5f, f7, this.p, this.r);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
