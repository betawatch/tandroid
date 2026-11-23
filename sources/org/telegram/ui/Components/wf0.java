package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class wf0 implements ui.a, dh.b, si.a {
    public final ui.a a;
    public final Paint b = new Paint(1);
    public final Paint c = new Paint();
    public RadialGradient d;
    public int e;
    public float f;
    public final /* synthetic */ xf0 h;

    public wf0(xf0 xf0Var, vf0 vf0Var) {
        this.h = xf0Var;
        this.a = vf0Var;
    }

    @Override // si.a
    public final int a() {
        return i().a();
    }

    @Override // dh.b
    public final fh.g b() {
        return new fh.g(this, this, this);
    }

    @Override // si.a
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        float f12;
        int i10;
        Canvas canvas2;
        RectF rectF2;
        xf0 xf0Var = this.h;
        ui.a aVar = this.a;
        float f13 = aVar != null ? xf0Var.l : 0.0f;
        if (f13 < 1.0f) {
            ri.c cVar = xf0Var.b;
            if (cVar == null) {
                cVar = null;
            }
            cVar.d(f10, f11, i7, canvas, rectF);
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
            float f14 = 1.0f - xf0Var.k;
            if (f14 > 0.0f) {
                canvas2.save();
                float f15 = 1.0f / i10;
                canvas2.scale(f15, f15);
                f12 = f10;
                canvas2.translate(-f12, -f11);
                h(canvas2, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f14, i10 * 2);
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
            (aVar instanceof si.a ? (si.a) aVar : null).d(f12, f11, i10, canvas2, rectF2);
            if (f13 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // si.a
    public final int e() {
        return i().e();
    }

    @Override // si.a
    public final int f() {
        return i().f();
    }

    @Override // si.a
    public final boolean g() {
        ri.c cVar = this.h.b;
        if (cVar == null) {
            cVar = null;
        }
        ui.a aVar = this.a;
        si.a aVar2 = aVar instanceof si.a ? (si.a) aVar : null;
        if (cVar == null || cVar.e() <= 1) {
            return false;
        }
        return aVar == null || (aVar2 != null && aVar2.g());
    }

    public final void h(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15) {
        xf0 xf0Var = this.h;
        boolean z10 = xf0Var.j;
        Paint paint = this.b;
        if (!z10) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.m6.r1(f14, xf0Var.i));
            canvas.drawRect(f10 - f15, f11 - f15, f12 + f15, f13 + f15, paint);
            return;
        }
        float f16 = f12 - f10;
        float max = Math.max(1.0f, 0.65f * f16);
        if (this.d == null || this.e != xf0Var.i || this.f != max) {
            this.e = xf0Var.i;
            this.f = max;
            this.d = new RadialGradient(0.0f, 0.0f, max, org.telegram.ui.ActionBar.m6.r1(0.8f, xf0Var.i), xf0Var.i, Shader.TileMode.CLAMP);
        }
        canvas.save();
        canvas.translate((f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
        paint.setShader(this.d);
        paint.setColor(-16777216);
        paint.setAlpha((int) (f14 * 255.0f));
        canvas.drawRect(((f10 - f12) / 2.0f) - f15, ((f11 - f13) / 2.0f) - f15, (f16 / 2.0f) + f15, com.google.android.gms.internal.vision.e2.A(f13, f11, 2.0f, f15), paint);
        canvas.restore();
    }

    public final si.a i() {
        ri.c cVar = this.h.b;
        if (cVar == null) {
            cVar = null;
        }
        ui.a aVar = this.a;
        si.a aVar2 = aVar instanceof si.a ? (si.a) aVar : null;
        return (aVar2 == null || cVar.e() < aVar2.e()) ? cVar : aVar2;
    }

    @Override // ui.a
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        ui.a aVar = this.a;
        xf0 xf0Var = this.h;
        float f14 = aVar != null ? xf0Var.l : 0.0f;
        if (f14 < 1.0f) {
            if (xf0Var.b == null || !canvas.isHardwareAccelerated()) {
                float f15 = xf0Var.k;
                if (f15 > 0.0f) {
                    int r12 = org.telegram.ui.ActionBar.m6.r1(f15 * 0.5f, -16777216);
                    Paint paint = this.c;
                    paint.setColor(r12);
                    canvas.drawRect(f10, f11, f12, f13, paint);
                }
            } else {
                xf0Var.b.o(f10, f11, f12, f13, canvas);
            }
            float f16 = 1.0f - xf0Var.k;
            if (f16 > 0.0f) {
                h(canvas, f10, f11, f12, f13, f16, 0.0f);
            }
        }
        if (f14 > 0.0f) {
            if (f14 < 1.0f) {
                canvas.saveLayerAlpha(f10, f11, f12, f13, (int) (f14 * 255.0f));
            }
            this.a.o(f10, f11, f12, f13, canvas);
            if (f14 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // dh.b
    public final /* synthetic */ void c(fh.g gVar) {
    }
}
