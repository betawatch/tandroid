package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b0 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final t2 f;
    public final t2 g;
    public ValueAnimator j;
    public int k;
    public float d = 0.0f;
    public boolean h = false;
    public float i = 1.0f;

    public b0(int i10, int i11, int i12, int i13) {
        t2 t2Var = new t2(i13 - 1);
        this.f = t2Var;
        t2 t2Var2 = new t2(i13);
        this.g = t2Var2;
        t2Var.a = i10;
        t2Var.b = i11;
        t2Var2.a = i10 - i12;
        t2Var2.b = i11 - i12;
        t2Var.b();
        t2Var2.b();
        t2Var.d.setColor(-1);
        t2Var.d.setAlpha(20);
        t2Var2.d.setColor(-1);
        t2Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = gr.f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.a;
            float f13 = this.i;
            t2 t2Var = this.f;
            t2Var.g(f12, f13);
            Paint paint = t2Var.d;
            t2Var.a(f7, f10, canvas, paint);
            float f14 = this.a;
            float f15 = this.i;
            t2 t2Var2 = this.g;
            t2Var2.g(f14, f15);
            t2Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (this.h && this.k == 0) {
            return;
        }
        int i10 = this.k;
        if (i10 != 0) {
            this.k = i10 - 1;
        }
        if (this.d != 0.0f) {
            view.invalidate();
        }
    }

    public final void b(double d) {
        float f7 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.e) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f10 = 1.0f;
        } else if (f7 >= 0.0f) {
            f10 = f7;
        }
        this.b = f10;
        this.c = (f10 - this.a) / 200.0f;
    }

    public final void c() {
        float f7 = this.b;
        float f10 = this.a;
        if (f7 != f10) {
            float f11 = this.c;
            float f12 = (16.0f * f11) + f10;
            this.a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.a = f7;
                }
            } else if (f12 < f7) {
                this.a = f7;
            }
        }
        boolean z10 = this.e;
        if (z10) {
            float f13 = this.d;
            if (f13 != 1.0f) {
                float f14 = f13 + 0.045714285f;
                this.d = f14;
                if (f14 > 1.0f) {
                    this.d = 1.0f;
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        float f15 = this.d;
        if (f15 != 0.0f) {
            float f16 = f15 - 0.045714285f;
            this.d = f16;
            if (f16 < 0.0f) {
                this.d = 0.0f;
            }
        }
    }
}
