package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b40 {
    public float c;
    public float d;
    public float e;
    public float f;
    public Shader g;
    public final int i;
    public float a = -1.0f;
    public float b = -1.0f;
    public final Matrix h = new Matrix();

    public b40(int i7) {
        this.i = i7;
    }

    public final void a() {
        int i7 = this.i;
        if (c40.s1(i7)) {
            this.a = a8.p0.f(Utilities.b.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.b = 1.0f;
        } else if (i7 == 1) {
            SecureRandom secureRandom = Utilities.b;
            this.a = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.b = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            SecureRandom secureRandom2 = Utilities.b;
            this.a = com.google.android.recaptcha.internal.a.c(secureRandom2.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = secureRandom2.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i7, int i10, int i11, long j3, float f10) {
        if (this.g == null) {
            return;
        }
        float f11 = this.e;
        if (f11 == 0.0f || this.f >= f11) {
            this.e = Utilities.b.nextInt(org.telegram.messenger.qs.e3) + 1500;
            this.f = 0.0f;
            if (this.a == -1.0f) {
                a();
            }
            this.c = this.a;
            this.d = this.b;
            a();
        }
        float f12 = j3;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f10) + (f12 * 1.0f) + this.f;
        this.f = f14;
        float f15 = this.e;
        if (f14 > f15) {
            this.f = f15;
        }
        float interpolation = org.telegram.ui.Components.xq.g.getInterpolation(this.f / f15);
        float f16 = i11;
        float f17 = this.c;
        float f18 = (((((this.a - f17) * interpolation) + f17) * f16) + i10) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.b - f19) * interpolation) + f19) * f16) + i7) - 200.0f;
        int i12 = this.i;
        if (!c40.s1(i12)) {
            f13 = i12 == 1 ? 4.0f : 2.5f;
        }
        float L = (org.telegram.messenger.g0.L(122.0f) / 400.0f) * f13;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(L, L, f18 + 200.0f, f20 + 200.0f);
        this.g.setLocalMatrix(matrix);
    }
}
