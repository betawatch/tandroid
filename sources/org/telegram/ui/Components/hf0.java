package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class hf0 implements ri.a, dh.b, pi.a {
    public final ri.a a;
    public final Paint b = new Paint(1);
    public final Paint c = new Paint();
    public RadialGradient d;
    public int e;
    public float f;
    public final /* synthetic */ if0 h;

    public hf0(if0 if0Var, gf0 gf0Var) {
        this.h = if0Var;
        this.a = gf0Var;
    }

    @Override // pi.a
    public final int a() {
        return j().a();
    }

    @Override // dh.b
    public final fh.g b() {
        return new fh.g(this, this, this);
    }

    @Override // pi.a
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        float f12;
        int i10;
        Canvas canvas2;
        RectF rectF2;
        if0 if0Var = this.h;
        ri.a aVar = this.a;
        float f13 = aVar != null ? if0Var.l : 0.0f;
        if (f13 < 1.0f) {
            oi.c cVar = if0Var.b;
            if (cVar == null) {
                cVar = null;
            }
            cVar.d(f10, f11, i7, canvas, rectF);
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
            float f14 = 1.0f - if0Var.k;
            if (f14 > 0.0f) {
                canvas2.save();
                float f15 = 1.0f / i10;
                canvas2.scale(f15, f15);
                f12 = f10;
                canvas2.translate(-f12, -f11);
                i(canvas2, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f14, i10 * 2);
                canvas2.restore();
            } else {
                f12 = f10;
            }
        } else {
            f12 = f10;
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        if (f13 > 0.0f) {
            if (f13 < 1.0f) {
                canvas2.saveLayerAlpha(null, (int) (f13 * 255.0f));
            }
            (aVar instanceof pi.a ? (pi.a) aVar : null).d(f12, f11, i10, canvas2, rectF2);
            if (f13 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // ri.a
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        ri.a aVar = this.a;
        if0 if0Var = this.h;
        float f14 = aVar != null ? if0Var.l : 0.0f;
        if (f14 < 1.0f) {
            if (if0Var.b == null || !canvas.isHardwareAccelerated()) {
                float f15 = if0Var.k;
                if (f15 > 0.0f) {
                    int r12 = org.telegram.ui.ActionBar.k6.r1(f15 * 0.5f, -16777216);
                    Paint paint = this.c;
                    paint.setColor(r12);
                    canvas.drawRect(f10, f11, f12, f13, paint);
                }
            } else {
                if0Var.b.e(canvas, f10, f11, f12, f13);
            }
            float f16 = 1.0f - if0Var.k;
            if (f16 > 0.0f) {
                i(canvas, f10, f11, f12, f13, f16, 0.0f);
            }
        }
        if (f14 > 0.0f) {
            if (f14 < 1.0f) {
                canvas.saveLayerAlpha(f10, f11, f12, f13, (int) (f14 * 255.0f));
            }
            this.a.e(canvas, f10, f11, f12, f13);
            if (f14 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // pi.a
    public final int f() {
        return j().f();
    }

    @Override // pi.a
    public final int g() {
        return j().g();
    }

    @Override // pi.a
    public final boolean h() {
        oi.c cVar = this.h.b;
        if (cVar == null) {
            cVar = null;
        }
        ri.a aVar = this.a;
        pi.a aVar2 = aVar instanceof pi.a ? (pi.a) aVar : null;
        if (cVar == null || cVar.f() <= 1) {
            return false;
        }
        return aVar == null || (aVar2 != null && aVar2.h());
    }

    public final void i(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15) {
        if0 if0Var = this.h;
        boolean z9 = if0Var.j;
        Paint paint = this.b;
        if (!z9) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(f14, if0Var.i));
            canvas.drawRect(f10 - f15, f11 - f15, f12 + f15, f13 + f15, paint);
            return;
        }
        float f16 = f12 - f10;
        float max = Math.max(1.0f, 0.65f * f16);
        if (this.d == null || this.e != if0Var.i || this.f != max) {
            this.e = if0Var.i;
            this.f = max;
            this.d = new RadialGradient(0.0f, 0.0f, max, org.telegram.ui.ActionBar.k6.r1(0.8f, if0Var.i), if0Var.i, Shader.TileMode.CLAMP);
        }
        canvas.save();
        canvas.translate((f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
        paint.setShader(this.d);
        paint.setColor(-16777216);
        paint.setAlpha((int) (f14 * 255.0f));
        canvas.drawRect(((f10 - f12) / 2.0f) - f15, ((f11 - f13) / 2.0f) - f15, (f16 / 2.0f) + f15, com.google.android.recaptcha.internal.a.A(f13, f11, 2.0f, f15), paint);
        canvas.restore();
    }

    public final pi.a j() {
        oi.c cVar = this.h.b;
        if (cVar == null) {
            cVar = null;
        }
        ri.a aVar = this.a;
        pi.a aVar2 = aVar instanceof pi.a ? (pi.a) aVar : null;
        return (aVar2 == null || cVar.f() < aVar2.f()) ? cVar : aVar2;
    }

    @Override // dh.b
    public final /* synthetic */ void c(fh.g gVar) {
    }
}
