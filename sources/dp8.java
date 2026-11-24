// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dp8 implements gx4, jl0, rw4 {
    public final cp8 a;
    public final Paint b = new Paint(1);
    public final Paint c = new Paint();
    public RadialGradient d;
    public int e;
    public float f;
    public final /* synthetic */ ep8 h;

    public dp8(ep8 ep8Var, cp8 cp8Var) {
        this.h = ep8Var;
        this.a = cp8Var;
    }

    @Override // rw4
    public final int a() {
        return j().a();
    }

    @Override // jl0
    public final il0 b() {
        return new il0(this, this, this);
    }

    @Override // rw4
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        float f3;
        int i2;
        Canvas canvas2;
        RectF rectF2;
        ep8 ep8Var = this.h;
        cp8 cp8Var = this.a;
        float f4 = cp8Var != null ? ep8Var.l : 0.0f;
        if (f4 < 1.0f) {
            dw4 dw4Var = ep8Var.b;
            if (dw4Var == null) {
                dw4Var = null;
            }
            dw4Var.d(f, f2, i, canvas, rectF);
            i2 = i;
            canvas2 = canvas;
            rectF2 = rectF;
            float f5 = 1.0f - ep8Var.k;
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
            (ug8.A(cp8Var) ? cp8Var : null).d(f3, f2, i2, canvas2, rectF2);
            if (f4 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // gx4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        cp8 cp8Var = this.a;
        ep8 ep8Var = this.h;
        float f5 = cp8Var != null ? ep8Var.l : 0.0f;
        if (f5 < 1.0f) {
            if (ep8Var.b == null || !canvas.isHardwareAccelerated()) {
                float f6 = ep8Var.k;
                if (f6 > 0.0f) {
                    int p1 = bkb.p1(f6 * 0.5f, -16777216);
                    Paint paint = this.c;
                    paint.setColor(p1);
                    canvas.drawRect(f, f2, f3, f4, paint);
                }
            } else {
                ep8Var.b.e(f, f2, f3, f4, canvas);
            }
            float f7 = 1.0f - ep8Var.k;
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

    @Override // rw4
    public final int f() {
        return j().f();
    }

    @Override // rw4
    public final int g() {
        return j().g();
    }

    @Override // rw4
    public final boolean h() {
        dw4 dw4Var = this.h.b;
        if (dw4Var == null) {
            dw4Var = null;
        }
        cp8 cp8Var = this.a;
        cp8 cp8Var2 = ug8.A(cp8Var) ? cp8Var : null;
        if (dw4Var == null || dw4Var.f() <= 1) {
            return false;
        }
        return cp8Var == null || (cp8Var2 != null && cp8Var2.h());
    }

    public final void i(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        ep8 ep8Var = this.h;
        boolean z = ep8Var.j;
        Paint paint = this.b;
        if (!z) {
            paint.setShader(null);
            paint.setColor(bkb.p1(f5, ep8Var.i));
            canvas.drawRect(f - f6, f2 - f6, f3 + f6, f4 + f6, paint);
            return;
        }
        float f7 = f3 - f;
        float max = Math.max(1.0f, 0.65f * f7);
        if (this.d == null || this.e != ep8Var.i || this.f != max) {
            this.e = ep8Var.i;
            this.f = max;
            this.d = new RadialGradient(0.0f, 0.0f, max, bkb.p1(0.8f, ep8Var.i), ep8Var.i, Shader.TileMode.CLAMP);
        }
        canvas.save();
        canvas.translate((f + f3) / 2.0f, (f2 + f4) / 2.0f);
        paint.setShader(this.d);
        paint.setColor(-16777216);
        paint.setAlpha((int) (255.0f * f5));
        canvas.drawRect(((f - f3) / 2.0f) - f6, ((f2 - f4) / 2.0f) - f6, (f7 / 2.0f) + f6, oo1.z(f4, f2, 2.0f, f6), paint);
        canvas.restore();
    }

    public final rw4 j() {
        dw4 dw4Var = this.h.b;
        if (dw4Var == null) {
            dw4Var = null;
        }
        cp8 cp8Var = this.a;
        cp8 cp8Var2 = ug8.A(cp8Var) ? cp8Var : null;
        return (cp8Var2 == null || dw4Var.f() < cp8Var2.f()) ? dw4Var : cp8Var2;
    }

    @Override // jl0
    public final void c(il0 il0Var) {
    }
}
