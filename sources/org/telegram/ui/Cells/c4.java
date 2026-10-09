package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c4 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final org.telegram.ui.Components.da f;
    public final org.telegram.ui.Components.da g;
    public boolean h;
    public int i;
    public float d = 0.0f;
    public float j = 0.0f;

    public c4(int i10, int i11) {
        org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(6);
        this.f = daVar;
        org.telegram.ui.Components.da daVar2 = new org.telegram.ui.Components.da(8);
        this.g = daVar2;
        float f7 = i10;
        daVar.a = f7;
        float f10 = i11;
        daVar.b = f10;
        daVar2.a = f7;
        daVar2.b = f10;
        daVar.b();
        daVar2.b();
        int i12 = org.telegram.ui.ActionBar.i6.qg;
        daVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, i12, false), 38));
        daVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, i12, false), 38));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, float f7, float f10, View view) {
        if (LiteMode.isEnabled(512)) {
            float f11 = (this.a * 0.4f) + 0.8f;
            if (this.e || this.d != 0.0f) {
                canvas.save();
                float interpolation = hs.f.getInterpolation(this.d) * f11;
                canvas.scale(interpolation, interpolation, f7, f10);
                boolean z10 = this.h;
                org.telegram.ui.Components.da daVar = this.f;
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
                            daVar.d.setColor(i0.a.k(i0.a.d(this.j, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.qg, false), org.telegram.ui.ActionBar.i6.x0(null, this.i != 2 ? org.telegram.ui.ActionBar.i6.sg : org.telegram.ui.ActionBar.i6.pg, false)), 38));
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
                    daVar.d.setColor(i0.a.k(i0.a.d(this.j, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.qg, false), org.telegram.ui.ActionBar.i6.x0(null, this.i != 2 ? org.telegram.ui.ActionBar.i6.sg : org.telegram.ui.ActionBar.i6.pg, false)), 38));
                }
                daVar.e(this.a, 1.0f);
                Paint paint = daVar.d;
                daVar.a(f7, f10, canvas, paint);
                float f16 = this.a;
                org.telegram.ui.Components.da daVar2 = this.g;
                daVar2.e(f16, 1.0f);
                daVar2.a(f7, f10, canvas, paint);
                canvas.restore();
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final float b() {
        float f7 = (this.a * 0.2f) + 0.9f;
        float interpolation = hs.g.getInterpolation(this.d);
        return com.google.android.gms.internal.vision.e2.y(1.0f, interpolation, 1.0f, f7 * interpolation);
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
