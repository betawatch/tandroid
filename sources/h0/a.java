package h0;

import android.graphics.Color;
import c3.h0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public a(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.a = f7;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
        this.f = f14;
    }

    public static a a(int i10) {
        k kVar = k.k;
        float e = b.e(Color.red(i10));
        float e10 = b.e(Color.green(i10));
        float e11 = b.e(Color.blue(i10));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f7 = (fArr2[2] * e11) + (fArr2[1] * e10) + (fArr2[0] * e);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * e11) + (fArr3[1] * e10) + (fArr3[0] * e);
        float[] fArr4 = fArr[2];
        float f11 = (e11 * fArr4[2]) + (e10 * fArr4[1]) + (e * fArr4[0]);
        float[][] fArr5 = b.a;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f7);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f7);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f7 * fArr8[0]);
        float[] fArr9 = kVar.g;
        float f15 = kVar.i;
        float f16 = kVar.d;
        float f17 = kVar.a;
        float f18 = fArr9[0] * f12;
        float f19 = fArr9[1] * f13;
        float f20 = fArr9[2] * f14;
        float f21 = kVar.h;
        float pow = (float) Math.pow((Math.abs(f18) * f21) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f19) * f21) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f20) * f21) / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f22 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f23 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float x9 = h0.x(signum3, 21.0f, (signum * 20.0f) + f24, 20.0f);
        float f25 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f26 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f25 * kVar.b) / f17, kVar.j * f16)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f27 = f17 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? atan2 + 360.0f : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.e) * kVar.c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (x9 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f16) / f27);
        float f28 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f15 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f26;
        return new a(atan2, pow5, pow4, f28, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static a b(float f7, float f10, float f11) {
        k kVar = k.k;
        float f12 = kVar.d;
        Math.sqrt(f7 / 100.0d);
        float f13 = kVar.a + 4.0f;
        float f14 = kVar.i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(r1))) * kVar.d) / f13);
        float f15 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float log = ((float) Math.log((f14 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f7, f15, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public final int c(k kVar) {
        float f7;
        float f10 = this.b;
        double d = f10;
        float f11 = this.c;
        if (d != 0.0d) {
            double d10 = f11;
            if (d10 != 0.0d) {
                f7 = f10 / ((float) Math.sqrt(d10 / 100.0d));
                float f12 = kVar.f;
                float f13 = kVar.h;
                float pow = (float) Math.pow(f7 / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
                double d11 = (this.a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
                float pow2 = kVar.a * ((float) Math.pow(f11 / 100.0d, (1.0d / kVar.d) / kVar.j));
                float f14 = cos * 3846.1538f * kVar.e * kVar.c;
                float f15 = pow2 / kVar.b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float u10 = (((0.305f + f15) * 23.0f) * pow) / (((pow * 108.0f) * sin) + h0.u(pow, 11.0f, cos2, f14 * 23.0f));
                float f16 = cos2 * u10;
                float f17 = u10 * sin;
                float f18 = f15 * 460.0f;
                float x9 = h0.x(f17, 288.0f, (451.0f * f16) + f18, 1403.0f);
                float f19 = h0.f(f17, 261.0f, f18 - (891.0f * f16), 1403.0f);
                float f20 = h0.f(f17, 6300.0f, f18 - (f16 * 220.0f), 1403.0f);
                float f21 = 100.0f / f13;
                float signum = Math.signum(x9) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(x9) * 27.13d) / (400.0d - Math.abs(x9))), 2.380952380952381d));
                float signum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float signum3 = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float[] fArr = kVar.g;
                float f22 = signum / fArr[0];
                float f23 = signum2 / fArr[1];
                float f24 = signum3 / fArr[2];
                float[][] fArr2 = b.b;
                float[] fArr3 = fArr2[0];
                float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
                float[] fArr4 = fArr2[1];
                float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
                float[] fArr5 = fArr2[2];
                return i0.a.e(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
            }
        }
        f7 = 0.0f;
        float f122 = kVar.f;
        float f132 = kVar.h;
        float pow3 = (float) Math.pow(f7 / Math.pow(1.64d - Math.pow(0.29d, f122), 0.73d), 1.1111111111111112d);
        double d112 = (this.a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f;
        float pow22 = kVar.a * ((float) Math.pow(f11 / 100.0d, (1.0d / kVar.d) / kVar.j));
        float f142 = cos3 * 3846.1538f * kVar.e * kVar.c;
        float f152 = pow22 / kVar.b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float u102 = (((0.305f + f152) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + h0.u(pow3, 11.0f, cos22, f142 * 23.0f));
        float f162 = cos22 * u102;
        float f172 = u102 * sin2;
        float f182 = f152 * 460.0f;
        float x92 = h0.x(f172, 288.0f, (451.0f * f162) + f182, 1403.0f);
        float f192 = h0.f(f172, 261.0f, f182 - (891.0f * f162), 1403.0f);
        float f202 = h0.f(f172, 6300.0f, f182 - (f162 * 220.0f), 1403.0f);
        float f212 = 100.0f / f132;
        float signum4 = Math.signum(x92) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(x92) * 27.13d) / (400.0d - Math.abs(x92))), 2.380952380952381d));
        float signum22 = Math.signum(f192) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float signum32 = Math.signum(f202) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float[] fArr6 = kVar.g;
        float f222 = signum4 / fArr6[0];
        float f232 = signum22 / fArr6[1];
        float f242 = signum32 / fArr6[2];
        float[][] fArr22 = b.b;
        float[] fArr32 = fArr22[0];
        float f252 = (fArr32[2] * f242) + (fArr32[1] * f232) + (fArr32[0] * f222);
        float[] fArr42 = fArr22[1];
        float f262 = (fArr42[2] * f242) + (fArr42[1] * f232) + (fArr42[0] * f222);
        float[] fArr52 = fArr22[2];
        return i0.a.e(f252, f262, (f242 * fArr52[2]) + (f232 * fArr52[1]) + (f222 * fArr52[0]));
    }
}
