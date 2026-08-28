package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p0 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final k3 f;
    public final k3 g;
    public ValueAnimator j;
    public int k;
    public float d = 0.0f;
    public boolean h = false;
    public float i = 1.0f;

    public p0(int i9, int i10, int i11, int i12) {
        k3 k3Var = new k3(i12 - 1);
        this.f = k3Var;
        k3 k3Var2 = new k3(i12);
        this.g = k3Var2;
        k3Var.a = i9;
        k3Var.b = i10;
        k3Var2.a = i9 - i11;
        k3Var2.b = i10 - i11;
        k3Var.b();
        k3Var2.b();
        k3Var.d.setColor(-1);
        k3Var.d.setAlpha(20);
        k3Var2.d.setColor(-1);
        k3Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = gr.f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.a;
            float f14 = this.i;
            k3 k3Var = this.f;
            k3Var.g(f13, f14);
            Paint paint = k3Var.d;
            k3Var.a(f10, f11, canvas, paint);
            float f15 = this.a;
            float f16 = this.i;
            k3 k3Var2 = this.g;
            k3Var2.g(f15, f16);
            k3Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (this.h && this.k == 0) {
            return;
        }
        int i9 = this.k;
        if (i9 != 0) {
            this.k = i9 - 1;
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
        boolean z10 = this.e;
        if (z10) {
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
        if (z10) {
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
