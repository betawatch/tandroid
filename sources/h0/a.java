package h0;

import android.graphics.Color;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        float e7 = b.e(Color.red(i10));
        float e10 = b.e(Color.green(i10));
        float e11 = b.e(Color.blue(i10));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f7 = (fArr2[2] * e11) + (fArr2[1] * e10) + (fArr2[0] * e7);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * e11) + (fArr3[1] * e10) + (fArr3[0] * e7);
        float[] fArr4 = fArr[2];
        float f11 = (e11 * fArr4[2]) + (e10 * fArr4[1]) + (e7 * fArr4[0]);
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
        float x10 = e2.x(signum3, 21.0f, (signum * 20.0f) + f24, 20.0f);
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
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? atan2 + 360.0f : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.e) * kVar.c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (x10 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
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
                float w10 = (((0.305f + f15) * 23.0f) * pow) / (((pow * 108.0f) * sin) + e2.w(pow, 11.0f, cos2, f14 * 23.0f));
                float f16 = cos2 * w10;
                float f17 = w10 * sin;
                float f18 = f15 * 460.0f;
                float x10 = e2.x(f17, 288.0f, (451.0f * f16) + f18, 1403.0f);
                float u10 = e2.u(f17, 261.0f, f18 - (891.0f * f16), 1403.0f);
                float u11 = e2.u(f17, 6300.0f, f18 - (f16 * 220.0f), 1403.0f);
                float f19 = 100.0f / f13;
                float signum = Math.signum(x10) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(x10) * 27.13d) / (400.0d - Math.abs(x10))), 2.380952380952381d));
                float signum2 = Math.signum(u10) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(u10) * 27.13d) / (400.0d - Math.abs(u10))), 2.380952380952381d));
                float signum3 = Math.signum(u11) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(u11) * 27.13d) / (400.0d - Math.abs(u11))), 2.380952380952381d));
                float[] fArr = kVar.g;
                float f20 = signum / fArr[0];
                float f21 = signum2 / fArr[1];
                float f22 = signum3 / fArr[2];
                float[][] fArr2 = b.b;
                float[] fArr3 = fArr2[0];
                float f23 = (fArr3[2] * f22) + (fArr3[1] * f21) + (fArr3[0] * f20);
                float[] fArr4 = fArr2[1];
                float f24 = (fArr4[2] * f22) + (fArr4[1] * f21) + (fArr4[0] * f20);
                float[] fArr5 = fArr2[2];
                return i0.a.c(f23, f24, (f22 * fArr5[2]) + (f21 * fArr5[1]) + (f20 * fArr5[0]));
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
        float w102 = (((0.305f + f152) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + e2.w(pow3, 11.0f, cos22, f142 * 23.0f));
        float f162 = cos22 * w102;
        float f172 = w102 * sin2;
        float f182 = f152 * 460.0f;
        float x102 = e2.x(f172, 288.0f, (451.0f * f162) + f182, 1403.0f);
        float u102 = e2.u(f172, 261.0f, f182 - (891.0f * f162), 1403.0f);
        float u112 = e2.u(f172, 6300.0f, f182 - (f162 * 220.0f), 1403.0f);
        float f192 = 100.0f / f132;
        float signum4 = Math.signum(x102) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(x102) * 27.13d) / (400.0d - Math.abs(x102))), 2.380952380952381d));
        float signum22 = Math.signum(u102) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(u102) * 27.13d) / (400.0d - Math.abs(u102))), 2.380952380952381d));
        float signum32 = Math.signum(u112) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(u112) * 27.13d) / (400.0d - Math.abs(u112))), 2.380952380952381d));
        float[] fArr6 = kVar.g;
        float f202 = signum4 / fArr6[0];
        float f212 = signum22 / fArr6[1];
        float f222 = signum32 / fArr6[2];
        float[][] fArr22 = b.b;
        float[] fArr32 = fArr22[0];
        float f232 = (fArr32[2] * f222) + (fArr32[1] * f212) + (fArr32[0] * f202);
        float[] fArr42 = fArr22[1];
        float f242 = (fArr42[2] * f222) + (fArr42[1] * f212) + (fArr42[0] * f202);
        float[] fArr52 = fArr22[2];
        return i0.a.c(f232, f242, (f222 * fArr52[2]) + (f212 * fArr52[1]) + (f202 * fArr52[0]));
    }
}
