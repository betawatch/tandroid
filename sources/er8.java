// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class er8 implements iz4, jm0, ty4 {
    public final dr8 a;
    public final Paint b = new Paint(1);
    public final Paint c = new Paint();
    public RadialGradient d;
    public int e;
    public float f;
    public final /* synthetic */ fr8 h;

    public er8(fr8 fr8Var, dr8 dr8Var) {
        this.h = fr8Var;
        this.a = dr8Var;
    }

    @Override // ty4
    public final int a() {
        return j().a();
    }

    @Override // jm0
    public final im0 b() {
        return new im0(this, this, this);
    }

    @Override // ty4
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        float f3;
        int i2;
        Canvas canvas2;
        RectF rectF2;
        fr8 fr8Var = this.h;
        dr8 dr8Var = this.a;
        float f4 = dr8Var != null ? fr8Var.l : 0.0f;
        if (f4 < 1.0f) {
            fy4 fy4Var = fr8Var.b;
            if (fy4Var == null) {
                fy4Var = null;
            }
            fy4Var.d(f, f2, i, canvas, rectF);
            i2 = i;
            canvas2 = canvas;
            rectF2 = rectF;
            float f5 = 1.0f - fr8Var.k;
            if (f5 > 0.0f) {
                canvas2.save();
                float f6 = 1.0f / i2;
                canvas2.scale(f6, f6);
                f3 = f;
                canvas2.translate(-f3, -f2);
                i(canvas2, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f5, i2 << 1);
                canvas2.restore();
            } else {
                f3 = f;
            }
        } else {
            f3 = f;
            i2 = i;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        if (f4 > 0.0f) {
            if (f4 < 1.0f) {
                canvas2.saveLayerAlpha(null, (int) (f4 * 255.0f));
            }
            (wi8.A(dr8Var) ? dr8Var : null).d(f3, f2, i2, canvas2, rectF2);
            if (f4 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // iz4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        dr8 dr8Var = this.a;
        fr8 fr8Var = this.h;
        float f5 = dr8Var != null ? fr8Var.l : 0.0f;
        if (f5 < 1.0f) {
            if (fr8Var.b == null || !canvas.isHardwareAccelerated()) {
                float f6 = fr8Var.k;
                if (f6 > 0.0f) {
                    int p1 = cmb.p1(f6 * 0.5f, -16777216);
                    Paint paint = this.c;
                    paint.setColor(p1);
                    canvas.drawRect(f, f2, f3, f4, paint);
                }
            } else {
                fr8Var.b.e(f, f2, f3, f4, canvas);
            }
            float f7 = 1.0f - fr8Var.k;
            if (f7 > 0.0f) {
                i(canvas, f, f2, f3, f4, f7, 0.0f);
            }
        }
        if (f5 > 0.0f) {
            if (f5 < 1.0f) {
                canvas.saveLayerAlpha(f, f2, f3, f4, (int) (f5 * 255.0f));
            }
            this.a.e(f, f2, f3, f4, canvas);
            if (f5 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // ty4
    public final int f() {
        return j().f();
    }

    @Override // ty4
    public final int g() {
        return j().g();
    }

    @Override // ty4
    public final boolean h() {
        fy4 fy4Var = this.h.b;
        if (fy4Var == null) {
            fy4Var = null;
        }
        dr8 dr8Var = this.a;
        dr8 dr8Var2 = wi8.A(dr8Var) ? dr8Var : null;
        if (fy4Var == null || fy4Var.f() <= 1) {
            return false;
        }
        return dr8Var == null || (dr8Var2 != null && dr8Var2.h());
    }

    public final void i(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        fr8 fr8Var = this.h;
        boolean z = fr8Var.j;
        Paint paint = this.b;
        if (!z) {
            paint.setShader(null);
            paint.setColor(cmb.p1(f5, fr8Var.i));
            canvas.drawRect(f - f6, f2 - f6, f3 + f6, f4 + f6, paint);
            return;
        }
        float f7 = f3 - f;
        float max = Math.max(1.0f, 0.65f * f7);
        if (this.d == null || this.e != fr8Var.i || this.f != max) {
            this.e = fr8Var.i;
            this.f = max;
            this.d = new RadialGradient(0.0f, 0.0f, max, cmb.p1(0.8f, fr8Var.i), fr8Var.i, Shader.TileMode.CLAMP);
        }
        canvas.save();
        canvas.translate((f + f3) / 2.0f, (f2 + f4) / 2.0f);
        paint.setShader(this.d);
        paint.setColor(-16777216);
        paint.setAlpha((int) (255.0f * f5));
        canvas.drawRect(((f - f3) / 2.0f) - f6, ((f2 - f4) / 2.0f) - f6, (f7 / 2.0f) + f6, aq1.z(f4, f2, 2.0f, f6), paint);
        canvas.restore();
    }

    public final ty4 j() {
        fy4 fy4Var = this.h.b;
        if (fy4Var == null) {
            fy4Var = null;
        }
        dr8 dr8Var = this.a;
        dr8 dr8Var2 = wi8.A(dr8Var) ? dr8Var : null;
        return (dr8Var2 == null || fy4Var.f() < dr8Var2.f()) ? fy4Var : dr8Var2;
    }

    @Override // jm0
    public final void c(im0 im0Var) {
    }
}
