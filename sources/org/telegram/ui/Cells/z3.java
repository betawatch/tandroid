package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z3 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final org.telegram.ui.Components.s9 f;
    public final org.telegram.ui.Components.s9 g;
    public boolean h;
    public int i;
    public float d = 0.0f;
    public float j = 0.0f;

    public z3(int i10, int i11) {
        org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9(6);
        this.f = s9Var;
        org.telegram.ui.Components.s9 s9Var2 = new org.telegram.ui.Components.s9(8);
        this.g = s9Var2;
        float f10 = i10;
        s9Var.a = f10;
        float f11 = i11;
        s9Var.b = f11;
        s9Var2.a = f10;
        s9Var2.b = f11;
        s9Var.b();
        s9Var2.b();
        int i12 = org.telegram.ui.ActionBar.g6.qg;
        s9Var.d.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 38));
        s9Var2.d.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 38));
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
                float interpolation = er.f.getInterpolation(this.d) * f12;
                canvas.scale(interpolation, interpolation, f10, f11);
                boolean z10 = this.h;
                org.telegram.ui.Components.s9 s9Var = this.f;
                if (!z10) {
                    int i10 = this.i;
                    if (i10 != 1) {
                        float f13 = this.j;
                        if (f13 != 1.0f) {
                            float f14 = f13 + 0.10666667f;
                            this.j = f14;
                            if (f14 > 1.0f) {
                                this.j = 1.0f;
                            }
                            s9Var.d.setColor(i0.b.k(i0.b.d(this.j, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qg, false), org.telegram.ui.ActionBar.g6.w0(null, this.i != 2 ? org.telegram.ui.ActionBar.g6.sg : org.telegram.ui.ActionBar.g6.pg, false)), 38));
                        }
                    }
                    if (i10 == 1) {
                        float f15 = this.j;
                        if (f15 != 0.0f) {
                            float f16 = f15 - 0.10666667f;
                            this.j = f16;
                            if (f16 < 0.0f) {
                                this.j = 0.0f;
                            }
                        }
                    }
                    s9Var.d.setColor(i0.b.k(i0.b.d(this.j, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qg, false), org.telegram.ui.ActionBar.g6.w0(null, this.i != 2 ? org.telegram.ui.ActionBar.g6.sg : org.telegram.ui.ActionBar.g6.pg, false)), 38));
                }
                s9Var.e(this.a, 1.0f);
                Paint paint = s9Var.d;
                s9Var.a(f10, f11, canvas, paint);
                float f17 = this.a;
                org.telegram.ui.Components.s9 s9Var2 = this.g;
                s9Var2.e(f17, 1.0f);
                s9Var2.a(f10, f11, canvas, paint);
                canvas.restore();
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final float b() {
        float f10 = (this.a * 0.2f) + 0.9f;
        float interpolation = er.g.getInterpolation(this.d);
        return com.google.android.recaptcha.internal.a.z(1.0f, interpolation, 1.0f, f10 * interpolation);
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
