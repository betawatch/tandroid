package org.telegram.ui.Components.voip;

import java.util.Random;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.u9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l3 extends u9 {
    public final void g(float f10, float f11) {
        if (!LiteMode.isEnabled(this.r)) {
            return;
        }
        int i10 = 0;
        while (true) {
            float f12 = i10;
            float f13 = this.n;
            if (f12 >= f13) {
                return;
            }
            float[] fArr = this.i;
            float f14 = fArr[i10];
            float[] fArr2 = this.j;
            float f15 = fArr2[i10];
            float f16 = (f15 * f10 * 8.2f * 1.0f) + (0.8f * f15) + f14;
            fArr[i10] = f16;
            if (f16 >= 1.0f) {
                fArr[i10] = 0.0f;
                float[] fArr3 = this.g;
                this.e[i10] = fArr3[i10];
                float[] fArr4 = this.h;
                this.f[i10] = fArr4[i10];
                if (f11 < 1.0f) {
                    float f17 = 360.0f / f13;
                    float f18 = this.b;
                    float f19 = this.a;
                    Random random = this.m;
                    fArr3[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f18 - f19) * f11) + f19;
                    fArr4[i10] = ((((random.nextInt() * f11) % 100.0f) / 100.0f) * 0.05f * f17) + (f17 * f12);
                    fArr2[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
                } else {
                    c(fArr3, fArr4, i10);
                }
            }
            i10++;
        }
    }
}
