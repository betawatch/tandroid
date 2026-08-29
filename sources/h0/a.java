package h0;

import android.graphics.Color;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public a(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.a = f9;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
        this.f = f14;
    }

    public static a a(int i10) {
        l lVar = l.k;
        float e10 = b.e(Color.red(i10));
        float e11 = b.e(Color.green(i10));
        float e12 = b.e(Color.blue(i10));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f9 = (fArr2[2] * e12) + (fArr2[1] * e11) + (fArr2[0] * e10);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * e12) + (fArr3[1] * e11) + (fArr3[0] * e10);
        float[] fArr4 = fArr[2];
        float f11 = (e12 * fArr4[2]) + (e11 * fArr4[1]) + (e10 * fArr4[0]);
        float[][] fArr5 = b.a;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f9);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f9);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f9 * fArr8[0]);
        float[] fArr9 = lVar.g;
        float f15 = lVar.i;
        float f16 = lVar.d;
        float f17 = lVar.a;
        float f18 = fArr9[0] * f12;
        float f19 = fArr9[1] * f13;
        float f20 = fArr9[2] * f14;
        float f21 = lVar.h;
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
        float y8 = com.google.android.recaptcha.internal.a.y(signum3, 21.0f, (signum * 20.0f) + f24, 20.0f);
        float f25 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f26 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f25 * lVar.b) / f17, lVar.j * f16)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f27 = f17 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? atan2 + 360.0f : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.e) * lVar.c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (y8 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f16) / f27);
        float f28 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f15 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f26;
        return new a(atan2, pow5, pow4, f28, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static a b(float f9, float f10, float f11) {
        l lVar = l.k;
        float f12 = lVar.d;
        Math.sqrt(f9 / 100.0d);
        float f13 = lVar.a + 4.0f;
        float f14 = lVar.i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(r1))) * lVar.d) / f13);
        float f15 = (1.7f * f9) / ((0.007f * f9) + 1.0f);
        float log = ((float) Math.log((f14 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f9, f15, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public final int c(l lVar) {
        float f9;
        float f10 = this.b;
        double d = f10;
        float f11 = this.c;
        if (d != 0.0d) {
            double d10 = f11;
            if (d10 != 0.0d) {
                f9 = f10 / ((float) Math.sqrt(d10 / 100.0d));
                float f12 = lVar.f;
                float f13 = lVar.h;
                float pow = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
                double d11 = (this.a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
                float pow2 = lVar.a * ((float) Math.pow(f11 / 100.0d, (1.0d / lVar.d) / lVar.j));
                float f14 = cos * 3846.1538f * lVar.e * lVar.c;
                float f15 = pow2 / lVar.b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float x4 = (((0.305f + f15) * 23.0f) * pow) / (((pow * 108.0f) * sin) + com.google.android.recaptcha.internal.a.x(pow, 11.0f, cos2, f14 * 23.0f));
                float f16 = cos2 * x4;
                float f17 = x4 * sin;
                float f18 = f15 * 460.0f;
                float y8 = com.google.android.recaptcha.internal.a.y(f17, 288.0f, (451.0f * f16) + f18, 1403.0f);
                float w10 = com.google.android.recaptcha.internal.a.w(f17, 261.0f, f18 - (891.0f * f16), 1403.0f);
                float w11 = com.google.android.recaptcha.internal.a.w(f17, 6300.0f, f18 - (f16 * 220.0f), 1403.0f);
                float f19 = 100.0f / f13;
                float signum = Math.signum(y8) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(y8) * 27.13d) / (400.0d - Math.abs(y8))), 2.380952380952381d));
                float signum2 = Math.signum(w10) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(w10) * 27.13d) / (400.0d - Math.abs(w10))), 2.380952380952381d));
                float signum3 = Math.signum(w11) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(w11) * 27.13d) / (400.0d - Math.abs(w11))), 2.380952380952381d));
                float[] fArr = lVar.g;
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
        f9 = 0.0f;
        float f122 = lVar.f;
        float f132 = lVar.h;
        float pow3 = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, f122), 0.73d), 1.1111111111111112d);
        double d112 = (this.a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f;
        float pow22 = lVar.a * ((float) Math.pow(f11 / 100.0d, (1.0d / lVar.d) / lVar.j));
        float f142 = cos3 * 3846.1538f * lVar.e * lVar.c;
        float f152 = pow22 / lVar.b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float x42 = (((0.305f + f152) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + com.google.android.recaptcha.internal.a.x(pow3, 11.0f, cos22, f142 * 23.0f));
        float f162 = cos22 * x42;
        float f172 = x42 * sin2;
        float f182 = f152 * 460.0f;
        float y82 = com.google.android.recaptcha.internal.a.y(f172, 288.0f, (451.0f * f162) + f182, 1403.0f);
        float w102 = com.google.android.recaptcha.internal.a.w(f172, 261.0f, f182 - (891.0f * f162), 1403.0f);
        float w112 = com.google.android.recaptcha.internal.a.w(f172, 6300.0f, f182 - (f162 * 220.0f), 1403.0f);
        float f192 = 100.0f / f132;
        float signum4 = Math.signum(y82) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(y82) * 27.13d) / (400.0d - Math.abs(y82))), 2.380952380952381d));
        float signum22 = Math.signum(w102) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(w102) * 27.13d) / (400.0d - Math.abs(w102))), 2.380952380952381d));
        float signum32 = Math.signum(w112) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(w112) * 27.13d) / (400.0d - Math.abs(w112))), 2.380952380952381d));
        float[] fArr6 = lVar.g;
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
