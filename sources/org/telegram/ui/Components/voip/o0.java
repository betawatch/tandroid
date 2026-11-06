package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class o0 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final c3 f;
    public final c3 g;
    public ValueAnimator j;
    public int k;
    public float d = 0.0f;
    public boolean h = false;
    public float i = 1.0f;

    public o0(int i7, int i10, int i11, int i12) {
        c3 c3Var = new c3(i12 - 1);
        this.f = c3Var;
        c3 c3Var2 = new c3(i12);
        this.g = c3Var2;
        c3Var.a = i7;
        c3Var.b = i10;
        c3Var2.a = i7 - i11;
        c3Var2.b = i10 - i11;
        c3Var.b();
        c3Var2.b();
        c3Var.d.setColor(-1);
        c3Var.d.setAlpha(20);
        c3Var2.d.setColor(-1);
        c3Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = xq.f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.a;
            float f14 = this.i;
            c3 c3Var = this.f;
            c3Var.g(f13, f14);
            Paint paint = c3Var.d;
            c3Var.a(f10, f11, canvas, paint);
            float f15 = this.a;
            float f16 = this.i;
            c3 c3Var2 = this.g;
            c3Var2.g(f15, f16);
            c3Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (this.h && this.k == 0) {
            return;
        }
        int i7 = this.k;
        if (i7 != 0) {
            this.k = i7 - 1;
        }
        if (this.d != 0.0f) {
            view.invalidate();
        }
    }

    public final void b(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.b = f11;
        this.c = (f11 - this.a) / 200.0f;
    }

    public final void c() {
        float f10 = this.b;
        float f11 = this.a;
        if (f10 != f11) {
            float f12 = this.c;
            float f13 = (16.0f * f12) + f11;
            this.a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.a = f10;
                }
            } else if (f13 < f10) {
                this.a = f10;
            }
        }
        boolean z9 = this.e;
        if (z9) {
            float f14 = this.d;
            if (f14 != 1.0f) {
                float f15 = f14 + 0.045714285f;
                this.d = f15;
                if (f15 > 1.0f) {
                    this.d = 1.0f;
                    return;
                }
                return;
            }
        }
        if (z9) {
            return;
        }
        float f16 = this.d;
        if (f16 != 0.0f) {
            float f17 = f16 - 0.045714285f;
            this.d = f17;
            if (f17 < 0.0f) {
                this.d = 0.0f;
            }
        }
    }
}
