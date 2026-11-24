// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hfc {
    public static final hfc k;
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
        float c = (float) ((ny2.c() * 63.66197723675813d) / 100.0d);
        float[] fArr = ny2.c;
        float f = fArr[0];
        float[][] fArr2 = ny2.a;
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float B = yjb.B((float) Math.exp(((-c) - 42.0f) / 92.0f), 0.2777778f, 1.0f, 1.0f);
        double d = B;
        if (d > 1.0d) {
            B = 1.0f;
        } else if (d < 0.0d) {
            B = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * B) + 1.0f) - B, (((100.0f / f7) * B) + 1.0f) - B, (((100.0f / f8) * B) + 1.0f) - B};
        float f9 = 1.0f / ((5.0f * c) + 1.0f);
        float C = yjb.C(f9, f9, f9, f9);
        float f10 = 1.0f - C;
        float cbrt = (0.1f * f10 * f10 * ((float) Math.cbrt(c * 5.0d))) + (C * c);
        float c2 = ny2.c() / fArr[1];
        double d2 = c2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f8) / 100.0d, 0.42d)};
        float f11 = fArr7[0];
        float f12 = (f11 * 400.0f) / (f11 + 27.13f);
        float f13 = fArr7[1];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[2];
        float[] fArr8 = {f12, f14, (400.0f * f15) / (f15 + 27.13f)};
        k = new hfc(c2, yjb.z(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], pow), pow, pow, 0.69f, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public hfc(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f = f;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.g = fArr;
        this.h = f7;
        this.i = f8;
        this.j = f9;
    }
}
