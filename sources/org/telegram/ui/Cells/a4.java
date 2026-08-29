package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a4 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final org.telegram.ui.Components.y9 f;
    public final org.telegram.ui.Components.y9 g;
    public boolean h;
    public int i;
    public float d = 0.0f;
    public float j = 0.0f;

    public a4(int i10, int i11) {
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(6);
        this.f = y9Var;
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(8);
        this.g = y9Var2;
        float f9 = i10;
        y9Var.a = f9;
        float f10 = i11;
        y9Var.b = f10;
        y9Var2.a = f9;
        y9Var2.b = f10;
        y9Var.b();
        y9Var2.b();
        int i12 = org.telegram.ui.ActionBar.g6.qg;
        y9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 38));
        y9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 38));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, float f9, float f10, View view) {
        if (LiteMode.isEnabled(512)) {
            float f11 = (this.a * 0.4f) + 0.8f;
            if (this.e || this.d != 0.0f) {
                canvas.save();
                float interpolation = jr.f.getInterpolation(this.d) * f11;
                canvas.scale(interpolation, interpolation, f9, f10);
                boolean z10 = this.h;
                org.telegram.ui.Components.y9 y9Var = this.f;
                if (!z10) {
                    int i10 = this.i;
                    if (i10 != 1) {
                        float f12 = this.j;
                        if (f12 != 1.0f) {
                            float f13 = f12 + 0.10666667f;
                            this.j = f13;
                            if (f13 > 1.0f) {
                                this.j = 1.0f;
                            }
                            y9Var.d.setColor(i0.a.k(i0.a.d(this.j, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qg, false), org.telegram.ui.ActionBar.g6.w0(null, this.i != 2 ? org.telegram.ui.ActionBar.g6.sg : org.telegram.ui.ActionBar.g6.pg, false)), 38));
                        }
                    }
                    if (i10 == 1) {
                        float f14 = this.j;
                        if (f14 != 0.0f) {
                            float f15 = f14 - 0.10666667f;
                            this.j = f15;
                            if (f15 < 0.0f) {
                                this.j = 0.0f;
                            }
                        }
                    }
                    y9Var.d.setColor(i0.a.k(i0.a.d(this.j, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qg, false), org.telegram.ui.ActionBar.g6.w0(null, this.i != 2 ? org.telegram.ui.ActionBar.g6.sg : org.telegram.ui.ActionBar.g6.pg, false)), 38));
                }
                y9Var.e(this.a, 1.0f);
                Paint paint = y9Var.d;
                y9Var.a(f9, f10, canvas, paint);
                float f16 = this.a;
                org.telegram.ui.Components.y9 y9Var2 = this.g;
                y9Var2.e(f16, 1.0f);
                y9Var2.a(f9, f10, canvas, paint);
                canvas.restore();
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final float b() {
        float f9 = (this.a * 0.2f) + 0.9f;
        float interpolation = jr.g.getInterpolation(this.d);
        return com.google.android.recaptcha.internal.a.z(1.0f, interpolation, 1.0f, f9 * interpolation);
    }

    public final void c(double d) {
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

    public final void d(int i10) {
        this.h = true;
        this.f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.e != z10) {
            view.invalidate();
        }
        this.e = z10;
    }

    public final void f() {
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
