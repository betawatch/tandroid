// default package

import java.util.Random;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class coc extends gk0 {
    public final void g(float f, float f2) {
        if (!i86.e(this.r)) {
            return;
        }
        int i = 0;
        while (true) {
            float f3 = i;
            float f4 = this.n;
            if (f3 >= f4) {
                return;
            }
            float[] fArr = this.i;
            float f5 = fArr[i];
            float[] fArr2 = this.j;
            float f6 = fArr2[i];
            float f7 = (f6 * f * 8.2f * 1.0f) + (0.8f * f6) + f5;
            fArr[i] = f7;
            if (f7 >= 1.0f) {
                fArr[i] = 0.0f;
                float[] fArr3 = this.g;
                this.e[i] = fArr3[i];
                float[] fArr4 = this.h;
                this.f[i] = fArr4[i];
                if (f2 < 1.0f) {
                    float f8 = 360.0f / f4;
                    float f9 = this.b;
                    float f10 = this.a;
                    Random random = this.m;
                    fArr3[i] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f9 - f10) * f2) + f10;
                    fArr4[i] = ((((random.nextInt() * f2) % 100.0f) / 100.0f) * 0.05f * f8) + (f8 * f3);
                    fArr2[i] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
                } else {
                    c(fArr3, fArr4, i);
                }
            }
            i++;
        }
    }
}
