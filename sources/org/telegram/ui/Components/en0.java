package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class en0 extends Drawable {
    public final Paint b;
    public boolean f;
    public int j;
    public boolean m;
    public lh.n6 o;
    public float p;
    public float q;
    public float r;
    public int a = 255;
    public final Path c = new Path();
    public final RectF d = new RectF();
    public long e = -1;
    public float g = 0.0f;
    public float h = 0.0f;
    public final float[] i = new float[2];
    public int k = 0;
    public boolean l = false;
    public final z5 n = new z5(1.0f, new dc0(this, 21), 0, 350, mr.h);

    public en0() {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.333f));
    }

    public final void a(int i10) {
        Paint paint = this.b;
        paint.setColor(i10);
        this.a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i10) {
        c(i10, true, false);
    }

    public final void c(int i10, boolean z4, boolean z10) {
        if (this.k == i10) {
            if (i10 != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.o);
                this.o = null;
                return;
            }
            return;
        }
        if (!z10 && i10 == 2) {
            if (this.o == null) {
                lh.n6 n6Var = new lh.n6(this, i10, z4);
                this.o = n6Var;
                AndroidUtilities.runOnUIThread(n6Var, 65L);
                return;
            }
            return;
        }
        lh.n6 n6Var2 = this.o;
        if (n6Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(n6Var2);
        }
        z5 z5Var = this.n;
        boolean z11 = false;
        if (z5Var.c < 1.0f && z4) {
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
        if (z4) {
            int i11 = this.k;
            this.j = i11;
            this.k = i10;
            if (i11 == 2 && i10 != 2) {
                z11 = true;
            }
            this.l = z11;
            z5Var.d(0.0f, true);
        } else {
            this.k = i10;
            this.j = i10;
            this.l = false;
            z5Var.d(1.0f, true);
        }
        invalidateSelf();
    }

    public final float d(float f10) {
        return org.telegram.ui.ai.c(0.5f, f10, this.p, this.q);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        char c3;
        float f10;
        char c10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z4;
        Rect bounds = getBounds();
        this.p = Math.min(bounds.width(), bounds.height());
        this.q = bounds.centerX();
        this.r = bounds.centerY();
        int i10 = this.a;
        if (i10 < 255) {
            float f15 = bounds.left;
            float f16 = bounds.top;
            float f17 = bounds.right;
            float f18 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f15, f16, f17, f18, i10, 31);
        } else {
            canvas2 = canvas;
        }
        float d = this.n.d(this.l ? 0.0f : 1.0f, false);
        int i11 = this.k;
        int i12 = this.j;
        float f19 = i11 == 0 ? i12 == 0 ? 1.0f : d : i12 == 0 ? 1.0f - d : 0.0f;
        int i13 = this.j;
        float f20 = i11 == 1 ? i13 == 1 ? 1.0f : d : i13 == 1 ? 1.0f - d : 0.0f;
        float f21 = i11 == 2 ? this.j == 2 ? 1.0f : d : this.j == 2 ? 1.0f - d : 0.0f;
        Paint paint = this.b;
        if (f19 > 0.0f) {
            c3 = 1;
            float lerp = AndroidUtilities.lerp(d(0.25f), d(0.444f), f19);
            float lerp2 = AndroidUtilities.lerp(e(0.5f), e(0.444f), f19);
            float lerp3 = AndroidUtilities.lerp(0.0f, this.p * 0.208f, f19);
            if (lerp3 >= this.p * 0.075f) {
                canvas2.drawCircle(lerp, lerp2, lerp3, paint);
            }
        } else {
            c3 = 1;
        }
        if (f19 > 0.0f || f20 > 0.0f) {
            canvas2.save();
            f10 = 45.0f;
            canvas2.rotate(f19 * 45.0f, this.q, this.r);
            float d10 = ((this.j == 2 ? d(0.75f) : d(0.2409f)) * f21) + (d(0.7638f) * f20) + (d(0.914f) * f19);
            float e = e(0.5f);
            c10 = 0;
            float d11 = ((this.j == 2 ? d(0.75f) : d(0.2409f)) * f21) + (d(0.2409f) * f20) + (d(0.658f) * f19);
            float e6 = e(0.5f);
            if (k7.n6.a(d10, e, d11, e6) <= this.p * 0.075f) {
                f11 = f21;
                f12 = 0.5f;
                f13 = 0.25f;
                f14 = 0.0f;
            } else {
                f11 = f21;
                f12 = 0.5f;
                f13 = 0.25f;
                f14 = 0.0f;
                canvas2.drawLine(d10, e, d11, e6, paint);
            }
            canvas2.restore();
        } else {
            f11 = f21;
            f12 = 0.5f;
            f13 = 0.25f;
            f14 = 0.0f;
            f10 = 45.0f;
            c10 = 0;
        }
        if (f20 > f14) {
            float lerp4 = this.j == 2 ? AndroidUtilities.lerp(d(0.75f), d(0.2409f), f20) : d(0.2409f);
            canvas2.save();
            canvas2.rotate(f19 * f10, this.q, this.r);
            float d12 = (d(0.2452f) * f20) + lerp4;
            float lerp5 = AndroidUtilities.lerp(e(f12), e(f13), f20);
            float e10 = e(f12);
            float d13 = (d(0.2452f) * f20) + lerp4;
            float lerp6 = AndroidUtilities.lerp(e(f12), e(0.75f), f20);
            if (Math.max(k7.n6.a(d12, lerp5, lerp4, e10), k7.n6.a(d13, lerp6, lerp4, e10)) > this.p * 0.075f) {
                Path path = this.c;
                path.rewind();
                path.moveTo(d12, lerp5);
                path.lineTo(lerp4, e10);
                path.lineTo(d13, lerp6);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f11 > f14) {
            if (this.e < 0 && f11 > 0.8f) {
                this.e = System.currentTimeMillis();
                this.m = this.l;
            }
            if (this.e > 0) {
                float[] fArr = this.i;
                qp.a(fArr, (System.currentTimeMillis() - this.e) % 5400.0f);
                float f22 = fArr[c10];
                float f23 = fArr[c3];
                if (this.k != 2 && !this.l) {
                    float max = Math.max(0.0f, (((float) Math.floor((f22 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f23 = Math.min(f23, this.h + max);
                    f22 = AndroidUtilities.lerp(f23, Math.min(f22, max + this.h), f11);
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
                boolean z10 = f28 <= f29 ? !(f24 < f28 || f24 > f29) : !(f24 < f28 && f24 > f29);
                boolean z11 = this.l;
                if (z11 && !this.m) {
                    this.m = z11;
                    this.f = z10;
                }
                if (!this.f || z10) {
                    z4 = false;
                } else {
                    z4 = false;
                    this.f = false;
                }
                if (z11 && z10 && !this.f) {
                    this.l = z4;
                }
                float d14 = d(f13);
                float e11 = e(f13);
                float d15 = d(0.75f);
                float e12 = e(0.75f);
                float f30 = f22;
                RectF rectF = this.d;
                rectF.set(d14, e11, d15, e12);
                canvas2.drawArc(rectF, this.g + f30, f23 - f30, false, paint);
                invalidateSelf();
            }
        }
        if (this.a < 255) {
            canvas.restore();
        }
        if (d < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f10) {
        return org.telegram.ui.ai.c(0.5f, f10, this.p, this.r);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
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
