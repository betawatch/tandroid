package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c4 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final org.telegram.ui.Components.t9 f;
    public final org.telegram.ui.Components.t9 g;
    public boolean h;
    public int i;
    public float d = 0.0f;
    public float j = 0.0f;

    public c4(int i9, int i10) {
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(6);
        this.f = t9Var;
        org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(8);
        this.g = t9Var2;
        float f10 = i9;
        t9Var.a = f10;
        float f11 = i10;
        t9Var.b = f11;
        t9Var2.a = f10;
        t9Var2.b = f11;
        t9Var.b();
        t9Var2.b();
        int i11 = org.telegram.ui.ActionBar.f6.qg;
        t9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i11, false), 38));
        t9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i11, false), 38));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, float f10, float f11, View view) {
        if (LiteMode.isEnabled(512)) {
            float f12 = (this.a * 0.4f) + 0.8f;
            if (this.e || this.d != 0.0f) {
                canvas.save();
                float interpolation = gr.f.getInterpolation(this.d) * f12;
                canvas.scale(interpolation, interpolation, f10, f11);
                boolean z10 = this.h;
                org.telegram.ui.Components.t9 t9Var = this.f;
                if (!z10) {
                    int i9 = this.i;
                    if (i9 != 1) {
                        float f13 = this.j;
                        if (f13 != 1.0f) {
                            float f14 = f13 + 0.10666667f;
                            this.j = f14;
                            if (f14 > 1.0f) {
                                this.j = 1.0f;
                            }
                            t9Var.d.setColor(i0.a.k(i0.a.d(this.j, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.qg, false), org.telegram.ui.ActionBar.f6.w0(null, this.i != 2 ? org.telegram.ui.ActionBar.f6.sg : org.telegram.ui.ActionBar.f6.pg, false)), 38));
                        }
                    }
                    if (i9 == 1) {
                        float f15 = this.j;
                        if (f15 != 0.0f) {
                            float f16 = f15 - 0.10666667f;
                            this.j = f16;
                            if (f16 < 0.0f) {
                                this.j = 0.0f;
                            }
                        }
                    }
                    t9Var.d.setColor(i0.a.k(i0.a.d(this.j, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.qg, false), org.telegram.ui.ActionBar.f6.w0(null, this.i != 2 ? org.telegram.ui.ActionBar.f6.sg : org.telegram.ui.ActionBar.f6.pg, false)), 38));
                }
                t9Var.e(this.a, 1.0f);
                Paint paint = t9Var.d;
                t9Var.a(f10, f11, canvas, paint);
                float f17 = this.a;
                org.telegram.ui.Components.t9 t9Var2 = this.g;
                t9Var2.e(f17, 1.0f);
                t9Var2.a(f10, f11, canvas, paint);
                canvas.restore();
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final float b() {
        float f10 = (this.a * 0.2f) + 0.9f;
        float interpolation = gr.g.getInterpolation(this.d);
        return e2.c.z(1.0f, interpolation, 1.0f, f10 * interpolation);
    }

    public final void c(double d) {
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

    public final void d(int i9) {
        this.h = true;
        this.f.d.setColor(i9);
    }

    public final void e(View view, boolean z10) {
        if (this.e != z10) {
            view.invalidate();
        }
        this.e = z10;
    }

    public final void f() {
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
