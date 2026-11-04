package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b0 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final r2 f;
    public final r2 g;
    public ValueAnimator j;
    public int k;
    public float d = 0.0f;
    public boolean h = false;
    public float i = 1.0f;

    public b0(int i3, int i10, int i11, int i12) {
        r2 r2Var = new r2(i12 - 1);
        this.f = r2Var;
        r2 r2Var2 = new r2(i12);
        this.g = r2Var2;
        r2Var.a = i3;
        r2Var.b = i10;
        r2Var2.a = i3 - i11;
        r2Var2.b = i10 - i11;
        r2Var.b();
        r2Var2.b();
        r2Var.d.setColor(-1);
        r2Var.d.setAlpha(20);
        r2Var2.d.setColor(-1);
        r2Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = xq.f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.a;
            float f14 = this.i;
            r2 r2Var = this.f;
            r2Var.g(f13, f14);
            Paint paint = r2Var.d;
            r2Var.a(f10, f11, canvas, paint);
            float f15 = this.a;
            float f16 = this.i;
            r2 r2Var2 = this.g;
            r2Var2.g(f15, f16);
            r2Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (this.h && this.k == 0) {
            return;
        }
        int i3 = this.k;
        if (i3 != 0) {
            this.k = i3 - 1;
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
