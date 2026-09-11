package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xm0 extends Drawable {
    public final Paint b;
    public boolean f;
    public int j;
    public boolean m;
    public i2.g0 o;
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
    public final e6 n = new e6(1.0f, new cc0(this, 21), 0, 350, pr.h);

    public xm0() {
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

    public final void c(int i10, boolean z10, boolean z11) {
        if (this.k == i10) {
            if (i10 != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.o);
                this.o = null;
                return;
            }
            return;
        }
        if (!z11 && i10 == 2) {
            if (this.o == null) {
                i2.g0 g0Var = new i2.g0(this, i10, z10, 2);
                this.o = g0Var;
                AndroidUtilities.runOnUIThread(g0Var, 65L);
                return;
            }
            return;
        }
        i2.g0 g0Var2 = this.o;
        if (g0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(g0Var2);
        }
        e6 e6Var = this.n;
        boolean z12 = false;
        if (e6Var.c < 1.0f && z10) {
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
            e6Var.d(0.0f, true);
        } else {
            this.k = i10;
            this.j = i10;
            this.l = false;
            e6Var.d(1.0f, true);
        }
        invalidateSelf();
    }

    public final float d(float f7) {
        return com.google.android.gms.internal.vision.e2.b(0.5f, f7, this.p, this.q);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        char c10;
        float f7;
        char c11;
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
        float d = this.n.d(this.l ? 0.0f : 1.0f, false);
        int i11 = this.k;
        int i12 = this.j;
        float f18 = i11 == 0 ? i12 == 0 ? 1.0f : d : i12 == 0 ? 1.0f - d : 0.0f;
        int i13 = this.j;
        float f19 = i11 == 1 ? i13 == 1 ? 1.0f : d : i13 == 1 ? 1.0f - d : 0.0f;
        float f20 = i11 == 2 ? this.j == 2 ? 1.0f : d : this.j == 2 ? 1.0f - d : 0.0f;
        Paint paint = this.b;
        if (f18 > 0.0f) {
            c10 = 1;
            float lerp = AndroidUtilities.lerp(d(0.25f), d(0.444f), f18);
            float lerp2 = AndroidUtilities.lerp(e(0.5f), e(0.444f), f18);
            float lerp3 = AndroidUtilities.lerp(0.0f, this.p * 0.208f, f18);
            if (lerp3 >= this.p * 0.075f) {
                canvas2.drawCircle(lerp, lerp2, lerp3, paint);
            }
        } else {
            c10 = 1;
        }
        if (f18 > 0.0f || f19 > 0.0f) {
            canvas2.save();
            f7 = 45.0f;
            canvas2.rotate(f18 * 45.0f, this.q, this.r);
            float d10 = ((this.j == 2 ? d(0.75f) : d(0.2409f)) * f20) + (d(0.7638f) * f19) + (d(0.914f) * f18);
            float e7 = e(0.5f);
            c11 = 0;
            float d11 = ((this.j == 2 ? d(0.75f) : d(0.2409f)) * f20) + (d(0.2409f) * f19) + (d(0.658f) * f18);
            float e10 = e(0.5f);
            if (v7.z6.a(d10, e7, d11, e10) <= this.p * 0.075f) {
                f10 = f20;
                f11 = 0.5f;
                f12 = 0.25f;
                f13 = 0.0f;
            } else {
                f10 = f20;
                f11 = 0.5f;
                f12 = 0.25f;
                f13 = 0.0f;
                canvas2.drawLine(d10, e7, d11, e10, paint);
            }
            canvas2.restore();
        } else {
            f10 = f20;
            f11 = 0.5f;
            f12 = 0.25f;
            f13 = 0.0f;
            f7 = 45.0f;
            c11 = 0;
        }
        if (f19 > f13) {
            float lerp4 = this.j == 2 ? AndroidUtilities.lerp(d(0.75f), d(0.2409f), f19) : d(0.2409f);
            canvas2.save();
            canvas2.rotate(f18 * f7, this.q, this.r);
            float d12 = (d(0.2452f) * f19) + lerp4;
            float lerp5 = AndroidUtilities.lerp(e(f11), e(f12), f19);
            float e11 = e(f11);
            float d13 = (d(0.2452f) * f19) + lerp4;
            float lerp6 = AndroidUtilities.lerp(e(f11), e(0.75f), f19);
            if (Math.max(v7.z6.a(d12, lerp5, lerp4, e11), v7.z6.a(d13, lerp6, lerp4, e11)) > this.p * 0.075f) {
                Path path = this.c;
                path.rewind();
                path.moveTo(d12, lerp5);
                path.lineTo(lerp4, e11);
                path.lineTo(d13, lerp6);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f10 > f13) {
            if (this.e < 0 && f10 > 0.8f) {
                this.e = System.currentTimeMillis();
                this.m = this.l;
            }
            if (this.e > 0) {
                float[] fArr = this.i;
                sp.a(fArr, (System.currentTimeMillis() - this.e) % 5400.0f);
                float f21 = fArr[c11];
                float f22 = fArr[c10];
                if (this.k != 2 && !this.l) {
                    float max = Math.max(0.0f, (((float) Math.floor((f21 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f22 = Math.min(f22, this.h + max);
                    f21 = AndroidUtilities.lerp(f22, Math.min(f21, max + this.h), f10);
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
                boolean z11 = f27 <= f28 ? !(f23 < f27 || f23 > f28) : !(f23 < f27 && f23 > f28);
                boolean z12 = this.l;
                if (z12 && !this.m) {
                    this.m = z12;
                    this.f = z11;
                }
                if (!this.f || z11) {
                    z10 = false;
                } else {
                    z10 = false;
                    this.f = false;
                }
                if (z12 && z11 && !this.f) {
                    this.l = z10;
                }
                float d14 = d(f12);
                float e12 = e(f12);
                float d15 = d(0.75f);
                float e13 = e(0.75f);
                float f29 = f21;
                RectF rectF = this.d;
                rectF.set(d14, e12, d15, e13);
                canvas2.drawArc(rectF, this.g + f29, f22 - f29, false, paint);
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

    public final float e(float f7) {
        return com.google.android.gms.internal.vision.e2.b(0.5f, f7, this.p, this.r);
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
