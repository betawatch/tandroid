package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b4 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final org.telegram.ui.Components.z9 f;
    public final org.telegram.ui.Components.z9 g;
    public boolean h;
    public int i;
    public float d = 0.0f;
    public float j = 0.0f;

    public b4(int i10, int i11) {
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(6);
        this.f = z9Var;
        org.telegram.ui.Components.z9 z9Var2 = new org.telegram.ui.Components.z9(8);
        this.g = z9Var2;
        float f7 = i10;
        z9Var.a = f7;
        float f10 = i11;
        z9Var.b = f10;
        z9Var2.a = f7;
        z9Var2.b = f10;
        z9Var.b();
        z9Var2.b();
        int i12 = org.telegram.ui.ActionBar.j6.qg;
        z9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 38));
        z9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 38));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, float f7, float f10, View view) {
        if (LiteMode.isEnabled(512)) {
            float f11 = (this.a * 0.4f) + 0.8f;
            if (this.e || this.d != 0.0f) {
                canvas.save();
                float interpolation = qr.f.getInterpolation(this.d) * f11;
                canvas.scale(interpolation, interpolation, f7, f10);
                boolean z10 = this.h;
                org.telegram.ui.Components.z9 z9Var = this.f;
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
                            z9Var.d.setColor(i0.a.k(i0.a.d(this.j, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qg, false), org.telegram.ui.ActionBar.j6.w0(null, this.i != 2 ? org.telegram.ui.ActionBar.j6.sg : org.telegram.ui.ActionBar.j6.pg, false)), 38));
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
                    z9Var.d.setColor(i0.a.k(i0.a.d(this.j, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qg, false), org.telegram.ui.ActionBar.j6.w0(null, this.i != 2 ? org.telegram.ui.ActionBar.j6.sg : org.telegram.ui.ActionBar.j6.pg, false)), 38));
                }
                z9Var.e(this.a, 1.0f);
                Paint paint = z9Var.d;
                z9Var.a(f7, f10, canvas, paint);
                float f16 = this.a;
                org.telegram.ui.Components.z9 z9Var2 = this.g;
                z9Var2.e(f16, 1.0f);
                z9Var2.a(f7, f10, canvas, paint);
                canvas.restore();
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final float b() {
        float f7 = (this.a * 0.2f) + 0.9f;
        float interpolation = qr.g.getInterpolation(this.d);
        return com.google.android.gms.internal.vision.e2.z(1.0f, interpolation, 1.0f, f7 * interpolation);
    }

    public final void c(double d) {
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
