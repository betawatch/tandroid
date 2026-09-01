package h0;

import android.graphics.Color;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        this.e = f14;
        this.f = f15;
    }

    public static a a(int i10) {
        l lVar = l.k;
        float e6 = b.e(Color.red(i10));
        float e10 = b.e(Color.green(i10));
        float e11 = b.e(Color.blue(i10));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * e11) + (fArr2[1] * e10) + (fArr2[0] * e6);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * e11) + (fArr3[1] * e10) + (fArr3[0] * e6);
        float[] fArr4 = fArr[2];
        float f12 = (e11 * fArr4[2]) + (e10 * fArr4[1]) + (e6 * fArr4[0]);
        float[][] fArr5 = b.a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = lVar.g;
        float f16 = lVar.i;
        float f17 = lVar.d;
        float f18 = lVar.a;
        float f19 = fArr9[0] * f13;
        float f20 = fArr9[1] * f14;
        float f21 = fArr9[2] * f15;
        float f22 = lVar.h;
        float pow = (float) Math.pow((Math.abs(f19) * f22) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f20) * f22) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f21) * f22) / 100.0d, 0.42d);
        float signum = ((Math.signum(f19) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f20) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f21) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f23 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f24 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f25 = signum2 * 20.0f;
        float v = e2.c.v(signum3, 21.0f, (signum * 20.0f) + f25, 20.0f);
        float f26 = (((signum * 40.0f) + f25) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f24, f23)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f26 * lVar.b) / f18, lVar.j * f17)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f28 = f18 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? atan2 + 360.0f : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.e) * lVar.c) * ((float) Math.sqrt((f24 * f24) + (f23 * f23)))) / (v + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f17) / f28);
        float f29 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f16 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f27;
        return new a(atan2, pow5, pow4, f29, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static a b(float f10, float f11, float f12) {
        l lVar = l.k;
        float f13 = lVar.d;
        Math.sqrt(f10 / 100.0d);
        float f14 = lVar.a + 4.0f;
        float f15 = lVar.i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * lVar.d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public final int c(l lVar) {
        float f10;
        float f11 = this.b;
        double d = f11;
        float f12 = this.c;
        if (d != 0.0d) {
            double d10 = f12;
            if (d10 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d10 / 100.0d));
                float f13 = lVar.f;
                float f14 = lVar.h;
                float pow = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, f13), 0.73d), 1.1111111111111112d);
                double d11 = (this.a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
                float pow2 = lVar.a * ((float) Math.pow(f12 / 100.0d, (1.0d / lVar.d) / lVar.j));
                float f15 = cos * 3846.1538f * lVar.e * lVar.c;
                float f16 = pow2 / lVar.b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float u10 = (((0.305f + f16) * 23.0f) * pow) / (((pow * 108.0f) * sin) + e2.c.u(pow, 11.0f, cos2, f15 * 23.0f));
                float f17 = cos2 * u10;
                float f18 = u10 * sin;
                float f19 = f16 * 460.0f;
                float v = e2.c.v(f18, 288.0f, (451.0f * f17) + f19, 1403.0f);
                float d12 = e2.c.d(f18, 261.0f, f19 - (891.0f * f17), 1403.0f);
                float d13 = e2.c.d(f18, 6300.0f, f19 - (f17 * 220.0f), 1403.0f);
                float f20 = 100.0f / f14;
                float signum = Math.signum(v) * f20 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(v) * 27.13d) / (400.0d - Math.abs(v))), 2.380952380952381d));
                float signum2 = Math.signum(d12) * f20 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d12) * 27.13d) / (400.0d - Math.abs(d12))), 2.380952380952381d));
                float signum3 = Math.signum(d13) * f20 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d13) * 27.13d) / (400.0d - Math.abs(d13))), 2.380952380952381d));
                float[] fArr = lVar.g;
                float f21 = signum / fArr[0];
                float f22 = signum2 / fArr[1];
                float f23 = signum3 / fArr[2];
                float[][] fArr2 = b.b;
                float[] fArr3 = fArr2[0];
                float f24 = (fArr3[2] * f23) + (fArr3[1] * f22) + (fArr3[0] * f21);
                float[] fArr4 = fArr2[1];
                float f25 = (fArr4[2] * f23) + (fArr4[1] * f22) + (fArr4[0] * f21);
                float[] fArr5 = fArr2[2];
                return i0.a.c(f24, f25, (f23 * fArr5[2]) + (f22 * fArr5[1]) + (f21 * fArr5[0]));
            }
        }
        f10 = 0.0f;
        float f132 = lVar.f;
        float f142 = lVar.h;
        float pow3 = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, f132), 0.73d), 1.1111111111111112d);
        double d112 = (this.a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f;
        float pow22 = lVar.a * ((float) Math.pow(f12 / 100.0d, (1.0d / lVar.d) / lVar.j));
        float f152 = cos3 * 3846.1538f * lVar.e * lVar.c;
        float f162 = pow22 / lVar.b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float u102 = (((0.305f + f162) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + e2.c.u(pow3, 11.0f, cos22, f152 * 23.0f));
        float f172 = cos22 * u102;
        float f182 = u102 * sin2;
        float f192 = f162 * 460.0f;
        float v10 = e2.c.v(f182, 288.0f, (451.0f * f172) + f192, 1403.0f);
        float d122 = e2.c.d(f182, 261.0f, f192 - (891.0f * f172), 1403.0f);
        float d132 = e2.c.d(f182, 6300.0f, f192 - (f172 * 220.0f), 1403.0f);
        float f202 = 100.0f / f142;
        float signum4 = Math.signum(v10) * f202 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(v10) * 27.13d) / (400.0d - Math.abs(v10))), 2.380952380952381d));
        float signum22 = Math.signum(d122) * f202 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d122) * 27.13d) / (400.0d - Math.abs(d122))), 2.380952380952381d));
        float signum32 = Math.signum(d132) * f202 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d132) * 27.13d) / (400.0d - Math.abs(d132))), 2.380952380952381d));
        float[] fArr6 = lVar.g;
        float f212 = signum4 / fArr6[0];
        float f222 = signum22 / fArr6[1];
        float f232 = signum32 / fArr6[2];
        float[][] fArr22 = b.b;
        float[] fArr32 = fArr22[0];
        float f242 = (fArr32[2] * f232) + (fArr32[1] * f222) + (fArr32[0] * f212);
        float[] fArr42 = fArr22[1];
        float f252 = (fArr42[2] * f232) + (fArr42[1] * f222) + (fArr42[0] * f212);
        float[] fArr52 = fArr22[2];
        return i0.a.c(f242, f252, (f232 * fArr52[2]) + (f222 * fArr52[1]) + (f212 * fArr52[0]));
    }
}
