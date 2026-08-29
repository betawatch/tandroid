package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q0 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final n3 f;
    public final n3 g;
    public ValueAnimator j;
    public int k;
    public float d = 0.0f;
    public boolean h = false;
    public float i = 1.0f;

    public q0(int i10, int i11, int i12, int i13) {
        n3 n3Var = new n3(i13 - 1);
        this.f = n3Var;
        n3 n3Var2 = new n3(i13);
        this.g = n3Var2;
        n3Var.a = i10;
        n3Var.b = i11;
        n3Var2.a = i10 - i12;
        n3Var2.b = i11 - i12;
        n3Var.b();
        n3Var2.b();
        n3Var.d.setColor(-1);
        n3Var.d.setAlpha(20);
        n3Var2.d.setColor(-1);
        n3Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f9, float f10, View view) {
        float f11 = (this.a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = jr.f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f9, f10);
            float f12 = this.a;
            float f13 = this.i;
            n3 n3Var = this.f;
            n3Var.g(f12, f13);
            Paint paint = n3Var.d;
            n3Var.a(f9, f10, canvas, paint);
            float f14 = this.a;
            float f15 = this.i;
            n3 n3Var2 = this.g;
            n3Var2.g(f14, f15);
            n3Var2.a(f9, f10, canvas, paint);
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
        float f9 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.e) {
            f9 = 0.0f;
        }
        if (f9 > 1.0f) {
            f10 = 1.0f;
        } else if (f9 >= 0.0f) {
            f10 = f9;
        }
        this.b = f10;
        this.c = (f10 - this.a) / 200.0f;
    }

    public final void c() {
        float f9 = this.b;
        float f10 = this.a;
        if (f9 != f10) {
            float f11 = this.c;
            float f12 = (16.0f * f11) + f10;
            this.a = f12;
            if (f11 > 0.0f) {
                if (f12 > f9) {
                    this.a = f9;
                }
            } else if (f12 < f9) {
                this.a = f9;
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
