package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class u10 {
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

    public u10(int i7) {
        this.i = i7;
    }

    public final void a(float f10) {
        int i7 = this.i;
        if (i7 == 0) {
            int i10 = this.j;
            int i11 = org.telegram.ui.ActionBar.k6.Hh;
            if (i10 != org.telegram.ui.ActionBar.k6.x0(null, i11, false) || this.k != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ih, false)) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
                this.j = x02;
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ih, false);
                this.k = x03;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i7 == 1) {
            int i12 = this.j;
            int i13 = org.telegram.ui.ActionBar.k6.Jh;
            if (i12 != org.telegram.ui.ActionBar.k6.x0(null, i13, false) || this.k != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Kh, false)) {
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                this.j = x04;
                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Kh, false);
                this.k = x05;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            if (i7 != 3) {
                return;
            }
            int i14 = this.j;
            int i15 = org.telegram.ui.ActionBar.k6.Wh;
            if (i14 != org.telegram.ui.ActionBar.k6.x0(null, i15, false) || this.k != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xh, false) || this.l != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false)) {
                int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xh, false);
                this.k = x06;
                int x07 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false);
                this.l = x07;
                int x08 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                this.j = x08;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        int L = org.telegram.messenger.g0.L(130.0f);
        float f11 = this.e;
        if (f11 == 0.0f || this.f >= f11) {
            this.e = Utilities.b.nextInt(700) + 500;
            this.f = 0.0f;
            if (this.a == -1.0f) {
                b();
            }
            this.c = this.a;
            this.d = this.b;
            b();
        }
        float f12 = 16L;
        float f13 = (f12 * 0.02f * f10) + (1.0f * f12) + this.f;
        this.f = f13;
        float f14 = this.e;
        if (f13 > f14) {
            this.f = f14;
        }
        float interpolation = xq.g.getInterpolation(this.f / f14);
        float f15 = L;
        float f16 = this.c;
        float f17 = ((((this.a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.b - f18) * interpolation) + f18) * f15) - 200.0f;
        float f20 = (f15 / 400.0f) * (i7 == 3 ? 2.0f : 1.5f);
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f17, f19);
        matrix.postScale(f20, f20, f17 + 200.0f, f19 + 200.0f);
        this.g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i7 = this.i;
        if (i7 == 0) {
            SecureRandom secureRandom = Utilities.b;
            this.a = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.b = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i7 == 3) {
            SecureRandom secureRandom2 = Utilities.b;
            this.a = a8.p0.f(secureRandom2.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.b = (secureRandom2.nextInt(100) * 0.1f) / 100.0f;
        } else {
            SecureRandom secureRandom3 = Utilities.b;
            this.a = com.google.android.recaptcha.internal.a.c(secureRandom3.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = secureRandom3.nextInt(100) / 100.0f;
        }
    }
}
