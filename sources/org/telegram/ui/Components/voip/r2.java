package org.telegram.ui.Components.voip;

import java.util.Random;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r2 extends q9 {
    public final void g(float f10, float f11) {
        if (!lc.e(this.r)) {
            return;
        }
        int i3 = 0;
        while (true) {
            float f12 = i3;
            float f13 = this.n;
            if (f12 >= f13) {
                return;
            }
            float[] fArr = this.i;
            float f14 = fArr[i3];
            float[] fArr2 = this.j;
            float f15 = fArr2[i3];
            float f16 = (f15 * f10 * 8.2f * 1.0f) + (0.8f * f15) + f14;
            fArr[i3] = f16;
            if (f16 >= 1.0f) {
                fArr[i3] = 0.0f;
                float[] fArr3 = this.g;
                this.e[i3] = fArr3[i3];
                float[] fArr4 = this.h;
                this.f[i3] = fArr4[i3];
                if (f11 < 1.0f) {
                    float f17 = 360.0f / f13;
                    float f18 = this.b;
                    float f19 = this.a;
                    Random random = this.m;
                    fArr3[i3] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f18 - f19) * f11) + f19;
                    fArr4[i3] = ((((random.nextInt() * f11) % 100.0f) / 100.0f) * 0.05f * f17) + (f17 * f12);
                    fArr2[i3] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
                } else {
                    c(fArr3, fArr4, i3);
                }
            }
            i3++;
        }
    }
}
