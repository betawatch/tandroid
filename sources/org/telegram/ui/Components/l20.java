package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l20 {
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

    public l20(int i10) {
        this.i = i10;
    }

    public final void a(float f7) {
        int i10 = this.i;
        if (i10 == 0) {
            int i11 = this.j;
            int i12 = org.telegram.ui.ActionBar.t6.Hh;
            if (i11 != org.telegram.ui.ActionBar.t6.x0(null, i12, false) || this.k != org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ih, false)) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
                this.j = x02;
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ih, false);
                this.k = x03;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.j;
            int i14 = org.telegram.ui.ActionBar.t6.Jh;
            if (i13 != org.telegram.ui.ActionBar.t6.x0(null, i14, false) || this.k != org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Kh, false)) {
                int x04 = org.telegram.ui.ActionBar.t6.x0(null, i14, false);
                this.j = x04;
                int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Kh, false);
                this.k = x05;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            if (i10 != 3) {
                return;
            }
            int i15 = this.j;
            int i16 = org.telegram.ui.ActionBar.t6.Wh;
            if (i15 != org.telegram.ui.ActionBar.t6.x0(null, i16, false) || this.k != org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xh, false) || this.l != org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yh, false)) {
                int x06 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xh, false);
                this.k = x06;
                int x07 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yh, false);
                this.l = x07;
                int x08 = org.telegram.ui.ActionBar.t6.x0(null, i16, false);
                this.j = x08;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        int L = org.telegram.messenger.i0.L(130.0f);
        float f10 = this.e;
        if (f10 == 0.0f || this.f >= f10) {
            this.e = Utilities.b.nextInt(700) + 500;
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
        float interpolation = gr.g.getInterpolation(this.f / f13);
        float f14 = L;
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
            SecureRandom secureRandom = Utilities.b;
            this.a = a1.g.A(secureRandom.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.b = a1.g.A(secureRandom.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            SecureRandom secureRandom2 = Utilities.b;
            this.a = a1.g.A(secureRandom2.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.b = (secureRandom2.nextInt(100) * 0.1f) / 100.0f;
        } else {
            SecureRandom secureRandom3 = Utilities.b;
            this.a = a1.g.c(secureRandom3.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = secureRandom3.nextInt(100) / 100.0f;
        }
    }
}
