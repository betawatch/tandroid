package org.telegram.ui.Components.voip;

import java.util.Random;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k3 extends t9 {
    public final void g(float f10, float f11) {
        if (!LiteMode.isEnabled(this.r)) {
            return;
        }
        int i9 = 0;
        while (true) {
            float f12 = i9;
            float f13 = this.n;
            if (f12 >= f13) {
                return;
            }
            float[] fArr = this.i;
            float f14 = fArr[i9];
            float[] fArr2 = this.j;
            float f15 = fArr2[i9];
            float f16 = (f15 * f10 * 8.2f * 1.0f) + (0.8f * f15) + f14;
            fArr[i9] = f16;
            if (f16 >= 1.0f) {
                fArr[i9] = 0.0f;
                float[] fArr3 = this.g;
                this.e[i9] = fArr3[i9];
                float[] fArr4 = this.h;
                this.f[i9] = fArr4[i9];
                if (f11 < 1.0f) {
                    float f17 = 360.0f / f13;
                    float f18 = this.b;
                    float f19 = this.a;
                    Random random = this.m;
                    fArr3[i9] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f18 - f19) * f11) + f19;
                    fArr4[i9] = ((((random.nextInt() * f11) % 100.0f) / 100.0f) * 0.05f * f17) + (f17 * f12);
                    fArr2[i9] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
                } else {
                    c(fArr3, fArr4, i9);
                }
            }
            i9++;
        }
    }
}
