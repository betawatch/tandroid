package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kg0 implements hi.a, tg.a, fi.a {
    public final hi.a a;
    public final Paint b = new Paint(1);
    public RadialGradient c;
    public int d;
    public float e;
    public final /* synthetic */ lg0 f;

    public kg0(lg0 lg0Var, jg0 jg0Var) {
        this.f = lg0Var;
        this.a = jg0Var;
    }

    @Override // fi.a
    public final int a() {
        return j().a();
    }

    @Override // tg.a
    public final vg.f b() {
        return new vg.f(this, this, this);
    }

    @Override // fi.a
    public final void d(float f7, float f10, int i10, Canvas canvas, RectF rectF) {
        float f11;
        int i11;
        Canvas canvas2;
        RectF rectF2;
        lg0 lg0Var = this.f;
        hi.a aVar = this.a;
        float f12 = aVar != null ? lg0Var.l : 0.0f;
        if (f12 < 1.0f) {
            ei.d dVar = lg0Var.b;
            if (dVar == null) {
                dVar = null;
            }
            dVar.d(f7, f10, i10, canvas, rectF);
            i11 = i10;
            canvas2 = canvas;
            rectF2 = rectF;
            float f13 = 1.0f - lg0Var.k;
            if (f13 > 0.0f) {
                canvas2.save();
                float f14 = 1.0f / i11;
                canvas2.scale(f14, f14);
                f11 = f7;
                canvas2.translate(-f11, -f10);
                i(canvas2, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f13, i11 * 2);
                canvas2.restore();
            } else {
                f11 = f7;
            }
        } else {
            f11 = f7;
            i11 = i10;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2.saveLayerAlpha(null, (int) (f12 * 255.0f));
            }
            (aVar instanceof fi.a ? (fi.a) aVar : null).d(f11, f10, i11, canvas2, rectF2);
            if (f12 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // hi.a
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        hi.a aVar = this.a;
        lg0 lg0Var = this.f;
        float f13 = aVar != null ? lg0Var.l : 0.0f;
        if (f13 < 1.0f) {
            boolean z10 = lg0Var.b != null && canvas.isHardwareAccelerated() && ei.r.f().a;
            if (z10) {
                lg0Var.b.e(canvas, f7, f10, f11, f12);
            }
            float f14 = z10 ? 1.0f - lg0Var.k : 1.0f;
            if (f14 > 0.0f) {
                i(canvas, f7, f10, f11, f12, f14, 0.0f);
            }
        }
        if (f13 > 0.0f) {
            if (f13 < 1.0f) {
                canvas.saveLayerAlpha(f7, f10, f11, f12, (int) (f13 * 255.0f));
            }
            this.a.e(canvas, f7, f10, f11, f12);
            if (f13 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // fi.a
    public final int f() {
        return j().f();
    }

    @Override // fi.a
    public final int g() {
        return j().g();
    }

    @Override // fi.a
    public final boolean h() {
        ei.d dVar = this.f.b;
        if (dVar == null) {
            dVar = null;
        }
        hi.a aVar = this.a;
        fi.a aVar2 = aVar instanceof fi.a ? (fi.a) aVar : null;
        if (!ei.r.f().a || dVar == null || dVar.f() <= 1) {
            return false;
        }
        return aVar == null || (aVar2 != null && aVar2.h());
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14) {
        lg0 lg0Var = this.f;
        boolean z10 = lg0Var.j;
        Paint paint = this.b;
        if (!z10) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(f13, lg0Var.i));
            canvas.drawRect(f7 - f14, f10 - f14, f11 + f14, f12 + f14, paint);
            return;
        }
        float f15 = f11 - f7;
        float max = Math.max(1.0f, 0.65f * f15);
        if (this.c == null || this.d != lg0Var.i || this.e != max) {
            this.d = lg0Var.i;
            this.e = max;
            this.c = new RadialGradient(0.0f, 0.0f, max, org.telegram.ui.ActionBar.t6.r1(0.8f, lg0Var.i), lg0Var.i, Shader.TileMode.CLAMP);
        }
        canvas.save();
        canvas.translate((f7 + f11) / 2.0f, (f10 + f12) / 2.0f);
        paint.setShader(this.c);
        paint.setColor(-16777216);
        paint.setAlpha((int) (f13 * 255.0f));
        canvas.drawRect(((f7 - f11) / 2.0f) - f14, ((f10 - f12) / 2.0f) - f14, (f15 / 2.0f) + f14, c3.i0.B(f12, f10, 2.0f, f14), paint);
        canvas.restore();
    }

    public final fi.a j() {
        ei.d dVar = this.f.b;
        if (dVar == null) {
            dVar = null;
        }
        hi.a aVar = this.a;
        fi.a aVar2 = aVar instanceof fi.a ? (fi.a) aVar : null;
        return (aVar2 == null || dVar.f() < aVar2.f()) ? dVar : aVar2;
    }

    @Override // tg.a
    public final /* synthetic */ void c(vg.f fVar) {
    }
}
