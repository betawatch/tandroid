package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vf0 implements ui.a, dh.b, si.a {
    public final ui.a a;
    public final Paint b = new Paint(1);
    public final Paint c = new Paint();
    public RadialGradient d;
    public int e;
    public float f;
    public final /* synthetic */ wf0 h;

    public vf0(wf0 wf0Var, uf0 uf0Var) {
        this.h = wf0Var;
        this.a = uf0Var;
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
        wf0 wf0Var = this.h;
        ui.a aVar = this.a;
        float f13 = aVar != null ? wf0Var.l : 0.0f;
        if (f13 < 1.0f) {
            ri.c cVar = wf0Var.b;
            if (cVar == null) {
                cVar = null;
            }
            cVar.d(f10, f11, i7, canvas, rectF);
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
            float f14 = 1.0f - wf0Var.k;
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
        wf0 wf0Var = this.h;
        boolean z10 = wf0Var.j;
        Paint paint = this.b;
        if (!z10) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(f14, wf0Var.i));
            canvas.drawRect(f10 - f15, f11 - f15, f12 + f15, f13 + f15, paint);
            return;
        }
        float f16 = f12 - f10;
        float max = Math.max(1.0f, 0.65f * f16);
        if (this.d == null || this.e != wf0Var.i || this.f != max) {
            this.e = wf0Var.i;
            this.f = max;
            this.d = new RadialGradient(0.0f, 0.0f, max, org.telegram.ui.ActionBar.n6.r1(0.8f, wf0Var.i), wf0Var.i, Shader.TileMode.CLAMP);
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
    public final void z(float f10, float f11, float f12, float f13, Canvas canvas) {
        ui.a aVar = this.a;
        wf0 wf0Var = this.h;
        float f14 = aVar != null ? wf0Var.l : 0.0f;
        if (f14 < 1.0f) {
            if (wf0Var.b == null || !canvas.isHardwareAccelerated()) {
                float f15 = wf0Var.k;
                if (f15 > 0.0f) {
                    int r12 = org.telegram.ui.ActionBar.n6.r1(f15 * 0.5f, -16777216);
                    Paint paint = this.c;
                    paint.setColor(r12);
                    canvas.drawRect(f10, f11, f12, f13, paint);
                }
            } else {
                wf0Var.b.z(f10, f11, f12, f13, canvas);
            }
            float f16 = 1.0f - wf0Var.k;
            if (f16 > 0.0f) {
                h(canvas, f10, f11, f12, f13, f16, 0.0f);
            }
        }
        if (f14 > 0.0f) {
            if (f14 < 1.0f) {
                canvas.saveLayerAlpha(f10, f11, f12, f13, (int) (f14 * 255.0f));
            }
            this.a.z(f10, f11, f12, f13, canvas);
            if (f14 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // dh.b
    public final /* synthetic */ void c(fh.g gVar) {
    }
}
