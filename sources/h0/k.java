package h0;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class k {
    public static final k k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float j3 = (float) ((b.j() * 63.66197723675813d) / 100.0d);
        float[] fArr = b.c;
        float f7 = fArr[0];
        float[][] fArr2 = b.a;
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f7;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f7);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f7 * fArr5[0]);
        float f17 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float B = e2.B((float) Math.exp(((-j3) - 42.0f) / 92.0f), 0.2777778f, 1.0f, 1.0f);
        double d = B;
        if (d > 1.0d) {
            B = 1.0f;
        } else if (d < 0.0d) {
            B = 0.0f;
        }
        float f18 = 1.0f / ((5.0f * j3) + 1.0f);
        float C = e2.C(f18, f18, f18, f18);
        float f19 = 1.0f - C;
        float cbrt = (0.1f * f19 * f19 * ((float) Math.cbrt(j3 * 5.0d))) + (C * j3);
        float j10 = b.j() / fArr[1];
        double d10 = j10;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f20 = fArr6[0];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr6[1];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr6[2];
        float[] fArr7 = {f21, f23, (400.0f * f24) / (f24 + 27.13f)};
        k = new k(j10, e2.A(fArr7[2], 0.05f, (fArr7[0] * 2.0f) + fArr7[1], pow), pow, pow, f17, 1.0f, new float[]{(((100.0f / f14) * B) + 1.0f) - B, (((100.0f / f15) * B) + 1.0f) - B, (((100.0f / f16) * B) + 1.0f) - B}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public k(float f7, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f = f7;
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        this.e = f14;
        this.g = fArr;
        this.h = f15;
        this.i = f16;
        this.j = f17;
    }
}
