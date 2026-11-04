package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jf0 implements si.a, eh.b, qi.a {
    public final si.a a;
    public final Paint b = new Paint(1);
    public RadialGradient c;
    public int d;
    public float e;
    public final /* synthetic */ kf0 f;

    public jf0(kf0 kf0Var, if0 if0Var) {
        this.f = kf0Var;
        this.a = if0Var;
    }

    @Override // qi.a
    public final int a() {
        return i().a();
    }

    @Override // eh.b
    public final gh.g b() {
        return new gh.g(this, this, this);
    }

    @Override // qi.a
    public final void c(float f10, float f11, int i3, Canvas canvas, RectF rectF) {
        float f12;
        int i10;
        Canvas canvas2;
        RectF rectF2;
        kf0 kf0Var = this.f;
        si.a aVar = this.a;
        float f13 = aVar != null ? kf0Var.l : 0.0f;
        if (f13 < 1.0f) {
            pi.c cVar = kf0Var.b;
            if (cVar == null) {
                cVar = null;
            }
            cVar.c(f10, f11, i3, canvas, rectF);
            i10 = i3;
            canvas2 = canvas;
            rectF2 = rectF;
            float f14 = 1.0f - kf0Var.k;
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
            i10 = i3;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        if (f13 > 0.0f) {
            if (f13 < 1.0f) {
                canvas2.saveLayerAlpha(null, (int) (f13 * 255.0f));
            }
            (aVar instanceof qi.a ? (qi.a) aVar : null).c(f12, f11, i10, canvas2, rectF2);
            if (f13 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // qi.a
    public final int e() {
        return i().e();
    }

    @Override // qi.a
    public final int f() {
        return i().f();
    }

    @Override // qi.a
    public final boolean g() {
        pi.c cVar = this.f.b;
        if (cVar == null) {
            cVar = null;
        }
        si.a aVar = this.a;
        qi.a aVar2 = aVar instanceof qi.a ? (qi.a) aVar : null;
        if (!pi.q.f().a || cVar == null || cVar.e() <= 1) {
            return false;
        }
        return aVar == null || (aVar2 != null && aVar2.g());
    }

    public final void h(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15) {
        kf0 kf0Var = this.f;
        boolean z10 = kf0Var.j;
        Paint paint = this.b;
        if (!z10) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(f14, kf0Var.i));
            canvas.drawRect(f10 - f15, f11 - f15, f12 + f15, f13 + f15, paint);
            return;
        }
        float f16 = f12 - f10;
        float max = Math.max(1.0f, 0.65f * f16);
        if (this.c == null || this.d != kf0Var.i || this.e != max) {
            this.d = kf0Var.i;
            this.e = max;
            this.c = new RadialGradient(0.0f, 0.0f, max, org.telegram.ui.ActionBar.k6.r1(0.8f, kf0Var.i), kf0Var.i, Shader.TileMode.CLAMP);
        }
        canvas.save();
        canvas.translate((f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
        paint.setShader(this.c);
        paint.setColor(-16777216);
        paint.setAlpha((int) (f14 * 255.0f));
        canvas.drawRect(((f10 - f12) / 2.0f) - f15, ((f11 - f13) / 2.0f) - f15, (f16 / 2.0f) + f15, com.google.android.recaptcha.internal.a.z(f13, f11, 2.0f, f15), paint);
        canvas.restore();
    }

    public final qi.a i() {
        pi.c cVar = this.f.b;
        if (cVar == null) {
            cVar = null;
        }
        si.a aVar = this.a;
        qi.a aVar2 = aVar instanceof qi.a ? (qi.a) aVar : null;
        return (aVar2 == null || cVar.e() < aVar2.e()) ? cVar : aVar2;
    }

    @Override // si.a
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        si.a aVar = this.a;
        kf0 kf0Var = this.f;
        float f14 = aVar != null ? kf0Var.l : 0.0f;
        if (f14 < 1.0f) {
            boolean z10 = kf0Var.b != null && canvas.isHardwareAccelerated() && pi.q.f().a;
            if (z10) {
                kf0Var.b.l(canvas, f10, f11, f12, f13);
            }
            float f15 = z10 ? 1.0f - kf0Var.k : 1.0f;
            if (f15 > 0.0f) {
                h(canvas, f10, f11, f12, f13, f15, 0.0f);
            }
        }
        if (f14 > 0.0f) {
            if (f14 < 1.0f) {
                canvas.saveLayerAlpha(f10, f11, f12, f13, (int) (f14 * 255.0f));
            }
            this.a.l(canvas, f10, f11, f12, f13);
            if (f14 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // eh.b
    public final /* synthetic */ void d(gh.g gVar) {
    }
}
