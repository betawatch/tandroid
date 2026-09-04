package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e30 {
    public float c;
    public float d;
    public float e;
    public float f;
    public RadialGradient g;
    public final int i;
    public int j;
    public int k;
    public int l;
    public float a = -1.0f;
    public float b = -1.0f;
    public final Matrix h = new Matrix();

    public e30(int i10) {
        this.i = i10;
    }

    public final void a(float f7) {
        int i10 = this.i;
        if (i10 == 0) {
            int i11 = this.j;
            int i12 = org.telegram.ui.ActionBar.j6.Tg;
            if (i11 != org.telegram.ui.ActionBar.j6.w0(null, i12, false) || this.k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ug, false)) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
                this.j = w02;
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ug, false);
                this.k = w03;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.j;
            int i14 = org.telegram.ui.ActionBar.j6.Vg;
            if (i13 != org.telegram.ui.ActionBar.j6.w0(null, i14, false) || this.k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wg, false)) {
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                this.j = w04;
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wg, false);
                this.k = w05;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            if (i10 != 3) {
                return;
            }
            int i15 = this.j;
            int i16 = org.telegram.ui.ActionBar.j6.ih;
            if (i15 != org.telegram.ui.ActionBar.j6.w0(null, i16, false) || this.k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jh, false) || this.l != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false)) {
                int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jh, false);
                this.k = w06;
                int w07 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false);
                this.l = w07;
                int w08 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                this.j = w08;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f10 = this.e;
        if (f10 == 0.0f || this.f >= f10) {
            this.e = Utilities.random.nextInt(700) + 500;
            this.f = 0.0f;
            if (this.a == -1.0f) {
                b();
            }
            this.c = this.a;
            this.d = this.b;
            b();
        }
        float f11 = 16L;
        float f12 = (f11 * 0.02f * f7) + (1.0f * f11) + this.f;
        this.f = f12;
        float f13 = this.e;
        if (f12 > f13) {
            this.f = f13;
        }
        float interpolation = pr.g.getInterpolation(this.f / f13);
        float f14 = dp;
        float f15 = this.c;
        float f16 = ((((this.a - f15) * interpolation) + f15) * f14) - 200.0f;
        float f17 = this.d;
        float f18 = ((((this.b - f17) * interpolation) + f17) * f14) - 200.0f;
        float f19 = (f14 / 400.0f) * (i10 == 3 ? 2.0f : 1.5f);
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f16, f18);
        matrix.postScale(f19, f19, f16 + 200.0f, f18 + 200.0f);
        this.g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.i;
        if (i10 == 0) {
            this.a = a4.a.A(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.b = a4.a.A(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.a = a4.a.A(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.a = a4.a.e(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
