// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class ana {
    public static final float[][] a;
    public static final cyb b;

    static {
        float[][] fArr = {new float[]{83.33f, 24.0f, 27.33f, 0.22f, 68.66f, 75.33f, 25.33f, 0.21f, 0.0f, 86.0f, 25.33f, 0.12f, -68.66f, 75.33f, 25.33f, 0.21f, -82.66f, 13.66f, 27.33f, 0.22f, -80.0f, -33.33f, 20.0f, 0.24f, -46.5f, -63.16f, 27.0f, 0.21f, 1.0f, -82.66f, 20.0f, 0.15f, 46.5f, -63.16f, 27.0f, 0.21f, 80.0f, -33.33f, 19.33f, 0.24f, 115.66f, -63.0f, 20.0f, 0.15f, 134.0f, -10.66f, 20.0f, 0.18f, 118.66f, 55.66f, 20.0f, 0.15f, 124.33f, 98.33f, 20.0f, 0.11f, -128.0f, 98.33f, 20.0f, 0.11f, -108.0f, 55.66f, 20.0f, 0.15f, -123.33f, -10.66f, 20.0f, 0.18f, -116.0f, -63.33f, 20.0f, 0.15f}, new float[]{27.33f, -57.66f, 20.0f, 0.12f, 59.0f, -32.0f, 19.33f, 0.22f, 77.0f, 4.33f, 22.66f, 0.2f, 100.0f, 40.33f, 18.0f, 0.12f, 58.66f, 59.0f, 20.0f, 0.18f, 73.33f, 100.33f, 22.66f, 0.15f, 75.0f, 155.0f, 22.0f, 0.11f, -27.33f, -57.33f, 20.0f, 0.12f, -59.0f, -32.33f, 19.33f, 0.2f, -77.0f, 4.66f, 23.33f, 0.2f, -98.66f, 41.0f, 18.66f, 0.12f, -58.0f, 59.33f, 19.33f, 0.18f, -73.33f, 100.0f, 22.0f, 0.15f, -75.66f, 155.0f, 22.0f, 0.11f}, new float[]{-0.83f, -52.16f, 12.33f, 0.2f, 26.66f, -40.33f, 16.0f, 0.2f, 44.16f, -20.5f, 12.33f, 0.2f, 53.0f, 7.33f, 16.0f, 0.2f, 31.0f, 23.66f, 14.66f, 0.2f, 0.0f, 32.0f, 13.33f, 0.2f, -29.0f, 23.66f, 14.0f, 0.2f, -53.0f, 7.33f, 16.0f, 0.2f, -44.5f, -20.16f, 12.33f, 0.2f, -27.33f, -40.33f, 16.0f, 0.2f, 43.66f, 50.0f, 14.66f, 0.2f, -41.66f, 48.0f, 14.66f, 0.2f}, new float[]{-0.16f, -103.5f, 20.33f, 0.15f, 39.66f, -77.33f, 26.66f, 0.15f, 70.66f, -46.33f, 21.33f, 0.15f, 84.5f, -3.83f, 29.66f, 0.15f, 65.33f, 56.33f, 24.66f, 0.15f, 0.0f, 67.66f, 24.66f, 0.15f, -65.66f, 56.66f, 24.66f, 0.15f, -85.0f, -4.0f, 29.33f, 0.15f, -70.66f, -46.33f, 21.33f, 0.15f, -40.33f, -77.66f, 26.66f, 0.15f, 62.66f, -109.66f, 21.33f, 0.11f, 103.166f, -67.5f, 20.33f, 0.11f, 110.33f, 37.66f, 20.66f, 0.11f, 94.166f, 91.16f, 20.33f, 0.11f, 38.83f, 91.16f, 20.33f, 0.11f, 0.0f, 112.5f, 20.33f, 0.11f, -38.83f, 91.16f, 20.33f, 0.11f, -94.166f, 91.16f, 20.33f, 0.11f, -110.33f, 37.66f, 20.66f, 0.11f, -103.166f, -67.5f, 20.33f, 0.11f, -62.66f, -109.66f, 21.33f, 0.11f}};
        a = fArr;
        short s = 0;
        for (float[] fArr2 : fArr) {
            s = (short) Math.max((int) s, fArr2.length / 4);
        }
        b = new cyb(s);
    }

    public static void a(Canvas canvas, int i, Drawable drawable, float f, float f2, float f3, float f4) {
        if (f3 <= 0.0f) {
            return;
        }
        int i2 = 0;
        while (true) {
            float[] fArr = a[i];
            if (i2 >= fArr.length) {
                return;
            }
            float f5 = fArr[i2];
            float f6 = fArr[i2 + 1];
            float f7 = fArr[i2 + 2];
            float f8 = fArr[i2 + 3];
            if (f < f2 && i == 0) {
                f6 = f5;
                f5 = f6;
            }
            float f9 = f5 * f4;
            float f10 = f6 * f4;
            float f11 = f7 * f4;
            drawable.setBounds((int) (gl.L(f9) - (gl.L(f11) / 2.0f)), (int) (gl.L(f10) - (gl.L(f11) / 2.0f)), (int) ((gl.L(f11) / 2.0f) + gl.L(f9)), (int) ((gl.L(f11) / 2.0f) + gl.L(f10)));
            drawable.setAlpha((int) Utilities.i(f3 * 255.0f * f8, 255.0f, 0.0f));
            drawable.draw(canvas);
            i2 += 4;
        }
    }

    public static void b(Canvas canvas, int i, Paint paint, Bitmap bitmap, float f, float f2, float f3) {
        cyb cybVar;
        if (f3 <= 0.0f) {
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            cybVar = b;
            if (i3 >= cybVar.b) {
                break;
            }
            cyb.d((float[]) cybVar.d, i3, 0.0f, 0.0f, width, height);
            i3++;
        }
        while (true) {
            float[] fArr = a[i];
            if (i2 >= fArr.length) {
                s4.b(canvas, cybVar, fArr.length / 4, paint);
                return;
            }
            float f4 = fArr[i2];
            float f5 = fArr[i2 + 1];
            float f6 = fArr[i2 + 2];
            float f7 = fArr[i2 + 3];
            if (f < f2 && i == 0) {
                f5 = f4;
                f4 = f5;
            }
            float f8 = f4 * 1.0f;
            float f9 = f5 * 1.0f;
            float f10 = f6 * 1.0f;
            int i4 = i2 / 4;
            cyb.d((float[]) cybVar.c, i4, gl.L(f8) - (gl.L(f10) / 2.0f), gl.L(f9) - (gl.L(f10) / 2.0f), (gl.L(f10) / 2.0f) + gl.L(f8), (gl.L(f10) / 2.0f) + gl.L(f9));
            cybVar.s(i4, bm2.o(-1, (int) (255.0f * f3 * f7)));
            i2 += 4;
        }
    }

    public static void c(Canvas canvas, tl tlVar, int i, float f, float f2, RectF rectF, float f3) {
        float f4;
        float f5;
        float f6;
        float f7 = f2;
        if (f7 > 0.0f) {
            float l = Utilities.l(((f7 >= 0.85f ? 1.0f : f7 / 0.85f) - 0.2f) / 0.8f);
            float f8 = rectF.left;
            float f9 = rectF.top;
            float width = rectF.width();
            float height = rectF.height();
            float f10 = (width / 2.0f) + f8;
            float f11 = (height / 2.0f) + f9;
            float N = gl.N(96.0f);
            float min = Math.min(f8, (i - N) / 2.0f);
            float f12 = oo1.f(f, N, 2.0f, f9);
            float max = Math.max(width, N);
            float max2 = Math.max(height, N);
            float f13 = max / 2.0f;
            float f14 = min + f13;
            float f15 = max2 / 2.0f;
            float f16 = f12 + f15;
            float N2 = gl.N(24.0f);
            float N3 = gl.N(16.0f);
            float N4 = gl.N(12.0f);
            float N5 = gl.N(8.0f);
            float f17 = N2 * 2.0f;
            float f18 = f17 * 2.0f;
            float f19 = (f17 + f13) * (-0.5f);
            float f20 = (N3 + f15) * (-0.9396926f);
            float f21 = f12 + max2;
            float f22 = min - N3;
            float f23 = max2 / 4.0f;
            float f24 = (f16 - f23) - N5;
            float f25 = min + max;
            float f26 = f25 + N3;
            float f27 = f16 + f23 + N5;
            float f28 = min - f17;
            float f29 = f25 + f17;
            float f30 = f14 + f19;
            float f31 = (f12 - f17) + N4;
            float f32 = f14 - f19;
            float f33 = (f21 + f17) - N4;
            float f34 = f28 - N5;
            float f35 = f16 + f20;
            float f36 = f29 + N5;
            float f37 = f16 - f20;
            int i2 = 0;
            float f38 = 1.0f;
            float[] fArr = {f14, f12 - N2, 20.0f, f14, f21 + N2, 20.0f, f22, f24, 23.0f, f26, f24, 18.0f, f22, f27, 24.0f, f26 - gl.N(4.0f), f27, 24.0f, f28, f16, 19.0f, f29, f16, 19.0f, f30, f31, 17.0f, f32, f31, 17.0f, f30, f33, 20.0f, f32, f33, 20.0f, f34, f35, 20.0f, f36, f35, 19.0f, f34, f37, 21.0f, f36, f37, 18.0f, min - f18, f16, 19.0f, f25 + f18, f16, 19.0f};
            float[] fArr2 = {0.02f, 0.42f, 0.0f, 0.32f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.14f, 0.6f, 0.16f, 0.64f, 0.14f, 0.7f, 0.14f, 0.9f, 0.2f, 0.75f, 0.2f, 0.85f, 0.09f, 0.45f, 0.09f, 0.45f, 0.09f, 0.45f, 0.11f, 0.45f, 0.14f, 0.75f, 0.2f, 0.8f};
            int i3 = 0;
            for (int i4 = 54; i3 < i4; i4 = 54) {
                float f39 = fArr[i3];
                float f40 = fArr[i3 + 1];
                float N6 = gl.N(fArr[i3 + 2]) * 0.5f;
                float f41 = fArr2[i2];
                float f42 = fArr2[i2 + 1];
                float f43 = f38 - l;
                if (f43 < f41) {
                    f4 = max2;
                    f5 = f38;
                } else {
                    float l2 = f38 - Utilities.l((f43 - f41) / (f42 - f41));
                    f4 = max2;
                    f5 = l2;
                }
                float[] fArr3 = fArr;
                if (i3 == 18 || i3 == 19 || i3 == 6 || i3 == 7) {
                    f5 = s33.i.getInterpolation(f5);
                }
                float f44 = l;
                float f45 = f38;
                float B = ls6.B(f45, f7, gl.L(12.0f), f40);
                if (f5 < f45) {
                    f39 = gl.R1(f10, f39, s33.i.getInterpolation(f5));
                    B = gl.R1(f11, B, f5);
                    N6 = gl.R1(gl.N(8.0f), N6, f5);
                }
                if (B > f21 + gl.L(8.0f)) {
                    f38 = 1.0f;
                    f6 = 1.0f - Utilities.l((((B - f12) - f4) - gl.L(8.0f)) / gl.L(56.0f));
                } else {
                    f38 = 1.0f;
                    f6 = 1.0f;
                }
                float l3 = (f38 - Utilities.l(loe.a(f14, f16, f39, B) / (max * 2.0f))) * f3 * 0.5f * f6;
                if (f5 < f45) {
                    l3 = gl.R1(0.0f, l3, f5);
                }
                tlVar.setBounds((int) (f39 - N6), (int) (B - N6), (int) (f39 + N6), (int) (B + N6));
                tlVar.w = (int) (l3 * 255.0f);
                tlVar.draw(canvas);
                i3 += 3;
                i2 += 2;
                f7 = f2;
                fArr = fArr3;
                max2 = f4;
                l = f44;
            }
        }
    }
}
