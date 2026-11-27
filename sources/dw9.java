// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dw9 extends Drawable {
    public final Paint b;
    public boolean f;
    public byte j;
    public boolean m;
    public wr6 o;
    public float p;
    public float q;
    public float r;
    public int a = jn7.d4;
    public final Path c = new Path();
    public final RectF d = new RectF();
    public long e = -1;
    public float g = 0.0f;
    public float h = 0.0f;
    public final float[] i = new float[2];
    public byte k = 0;
    public boolean l = false;
    public final mm n = new mm(1.0f, new v59(this, 27), 0, 350, k43.h);

    public dw9() {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.L(1.333f));
    }

    public final void a(int i) {
        Paint paint = this.b;
        paint.setColor(i);
        this.a = paint.getAlpha();
        paint.setAlpha(jn7.d4);
    }

    public final void b(int i) {
        c(i, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i, boolean z, boolean z2) {
        if (this.k == i) {
            if (i != 2) {
                hl.r(this.o);
                this.o = null;
                return;
            }
            return;
        }
        if (!z2 && i == 2) {
            if (this.o == null) {
                wr6 wr6Var = new wr6(this, i, z);
                this.o = wr6Var;
                hl.d3(wr6Var, 65L);
                return;
            }
            return;
        }
        wr6 wr6Var2 = this.o;
        if (wr6Var2 != null) {
            hl.r(wr6Var2);
        }
        mm mmVar = this.n;
        boolean z3 = false;
        if (mmVar.c < 1.0f && z) {
            c(this.k, false, false);
        }
        if (i == 2) {
            this.g = 180.0f;
            this.e = -1L;
        } else if (this.k == 2) {
            if (i == 0) {
                this.h = -45.0f;
            } else {
                this.h = 0.0f;
            }
        }
        if (z) {
            byte b = this.k;
            this.j = b;
            this.k = i;
            if (b == 2 && i != 2) {
                z3 = true;
            }
            this.l = z3;
            mmVar.e(true, 0.0f);
        } else {
            this.k = i;
            this.j = i;
            this.l = false;
            mmVar.e(true, 1.0f);
        }
        invalidateSelf();
    }

    public final float d(float f) {
        return qu6.B(0.5f, f, this.p, this.q);
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
        float f;
        ?? r23;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z;
        Rect bounds = getBounds();
        this.p = Math.min(bounds.width(), bounds.height());
        this.q = bounds.centerX();
        this.r = bounds.centerY();
        int i = this.a;
        if (i < 255) {
            float f6 = bounds.left;
            float f7 = bounds.top;
            float f8 = bounds.right;
            float f9 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f6, f7, f8, f9, i, 31);
        } else {
            canvas2 = canvas;
        }
        float e = this.n.e(false, this.l ? 0.0f : 1.0f);
        byte b = this.k;
        byte b2 = this.j;
        float f10 = b == 0 ? b2 == 0 ? 1.0f : e : b2 == 0 ? 1.0f - e : 0.0f;
        float f11 = b == 1 ? b2 == 1 ? 1.0f : e : b2 == 1 ? 1.0f - e : 0.0f;
        float f12 = b == 2 ? b2 == 2 ? 1.0f : e : b2 == 2 ? 1.0f - e : 0.0f;
        Paint paint = this.b;
        if (f10 > 0.0f) {
            boolean z2 = true;
            float R1 = hl.R1(d(0.25f), d(0.444f), f10);
            float R12 = hl.R1(e(0.5f), e(0.444f), f10);
            float R13 = hl.R1(0.0f, this.p * 0.208f, f10);
            r19 = z2;
            if (R13 >= this.p * 0.075f) {
                canvas2.drawCircle(R1, R12, R13, paint);
                r19 = z2;
            }
        } else {
            r19 = 1;
        }
        if (f10 > 0.0f || f11 > 0.0f) {
            canvas2.save();
            f = 45.0f;
            canvas2.rotate(f10 * 45.0f, this.q, this.r);
            float d = ((this.j == 2 ? d(0.75f) : d(0.2409f)) * f12) + (d(0.7638f) * f11) + (d(0.914f) * f10);
            float e2 = e(0.5f);
            r23 = 0;
            float d2 = ((this.j == 2 ? d(0.75f) : d(0.2409f)) * f12) + (d(0.2409f) * f11) + (d(0.658f) * f10);
            float e3 = e(0.5f);
            if (dte.a(d, e2, d2, e3) <= this.p * 0.075f) {
                f2 = f12;
                f3 = 0.0f;
                f4 = 0.5f;
                f5 = 0.25f;
            } else {
                f2 = f12;
                f3 = 0.0f;
                f4 = 0.5f;
                f5 = 0.25f;
                canvas2.drawLine(d, e2, d2, e3, paint);
            }
            canvas2.restore();
        } else {
            f = 45.0f;
            f3 = 0.0f;
            r23 = 0;
            f5 = 0.25f;
            f2 = f12;
            f4 = 0.5f;
        }
        if (f11 > f3) {
            float R14 = this.j == 2 ? hl.R1(d(0.75f), d(0.2409f), f11) : d(0.2409f);
            canvas2.save();
            canvas2.rotate(f10 * f, this.q, this.r);
            float d3 = (d(0.2452f) * f11) + R14;
            float R15 = hl.R1(e(f4), e(f5), f11);
            float e4 = e(f4);
            float d4 = (d(0.2452f) * f11) + R14;
            float R16 = hl.R1(e(f4), e(0.75f), f11);
            if (Math.max(dte.a(d3, R15, R14, e4), dte.a(d4, R16, R14, e4)) > this.p * 0.075f) {
                Path path = this.c;
                path.rewind();
                path.moveTo(d3, R15);
                path.lineTo(R14, e4);
                path.lineTo(d4, R16);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f2 > f3) {
            long j = this.e;
            if (j < 0 && f2 > 0.8f) {
                j = System.currentTimeMillis();
                this.e = j;
                this.m = this.l;
            }
            if (j > 0) {
                float[] fArr = this.i;
                di2.a((System.currentTimeMillis() - this.e) % 5400.0f, fArr);
                float f13 = fArr[r23];
                float f14 = fArr[r19];
                if (this.k != 2 && !this.l) {
                    float max = Math.max(f3, (((float) Math.floor((f13 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f14 = Math.min(f14, this.h + max);
                    f13 = hl.R1(f14, Math.min(f13, max + this.h), f2);
                }
                float f15 = this.h;
                float f16 = this.g;
                float f17 = f16 + f13;
                float f18 = f16 + f14;
                float f19 = f17 % 360.0f;
                if (f19 < 0.0f) {
                    f19 += 360.0f;
                }
                float f20 = f18 % 360.0f;
                if (f20 < 0.0f) {
                    f20 += 360.0f;
                }
                boolean z3 = (f19 <= f20 ? f15 < f19 || f15 > f20 : f15 < f19 && f15 > f20) ? r23 : r19;
                boolean z4 = this.l;
                if (z4 && !this.m) {
                    this.m = z4;
                    this.f = z3;
                }
                boolean z5 = this.f;
                if (!z5 || z3) {
                    z = r23;
                } else {
                    z = r23;
                    this.f = z;
                    z5 = z;
                }
                if (z4 && z3 && !z5) {
                    this.l = z;
                }
                float d5 = d(f5);
                float e5 = e(f5);
                float d6 = d(0.75f);
                float e6 = e(0.75f);
                float f21 = f13;
                RectF rectF = this.d;
                rectF.set(d5, e5, d6, e6);
                canvas2.drawArc(rectF, this.g + f21, f14 - f21, false, paint);
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

    public final float e(float f) {
        return qu6.B(0.5f, f, this.p, this.r);
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
        this.a = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
