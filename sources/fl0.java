// default package

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class fl0 {
    public float a;
    public float b;
    public final Path c;
    public final Paint d;
    public final float[] e;
    public final float[] f;
    public final float[] g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final Random m;
    public final float n;
    public final float o;
    public final float p;
    public final Matrix q;
    public final int r;
    public float s;
    public float t;
    public float u;

    public fl0(int i, int i2) {
        this.c = new Path();
        this.d = new Paint(1);
        this.k = new float[4];
        this.l = new float[4];
        this.m = new Random();
        this.p = 1.0f;
        this.q = new Matrix();
        this.n = i;
        this.o = (float) (Math.tan(3.141592653589793d / (r0 * 2.0f)) * 1.3333333333333333d);
        this.e = new float[i];
        this.f = new float[i];
        this.g = new float[i];
        this.h = new float[i];
        this.i = new float[i];
        this.j = new float[i];
        for (int i3 = 0; i3 < this.n; i3++) {
            c(this.e, this.f, i3);
            c(this.g, this.h, i3);
            this.i[i3] = 0.0f;
        }
        this.r = i2;
    }

    public final void a(float f, float f2, Canvas canvas, Paint paint) {
        if (!e86.e(this.r)) {
            return;
        }
        Path path = this.c;
        path.reset();
        int i = 0;
        while (true) {
            float f3 = i;
            float f4 = this.n;
            if (f3 >= f4) {
                canvas.save();
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            float[] fArr = this.i;
            float f5 = fArr[i];
            int i2 = i + 1;
            int i3 = ((float) i2) < f4 ? i2 : 0;
            float f6 = fArr[i3];
            float[] fArr2 = this.e;
            float f7 = 1.0f - f5;
            float f8 = fArr2[i] * f7;
            float[] fArr3 = this.g;
            float f9 = (fArr3[i] * f5) + f8;
            float f10 = 1.0f - f6;
            float f11 = (fArr3[i3] * f6) + (fArr2[i3] * f10);
            float[] fArr4 = this.f;
            float f12 = fArr4[i] * f7;
            float[] fArr5 = this.h;
            float f13 = (fArr5[i] * f5) + f12;
            float f14 = (fArr5[i3] * f6) + (fArr4[i3] * f10);
            float max = (((Math.max(f9, f11) - Math.min(f9, f11)) / 2.0f) + Math.min(f9, f11)) * this.o * this.p;
            Matrix matrix = this.q;
            matrix.reset();
            matrix.setRotate(f13, f, f2);
            float[] fArr6 = this.k;
            fArr6[0] = f;
            float f15 = f2 - f9;
            fArr6[1] = f15;
            fArr6[2] = f + max;
            fArr6[3] = f15;
            matrix.mapPoints(fArr6);
            float[] fArr7 = this.l;
            fArr7[0] = f;
            float f16 = f2 - f11;
            fArr7[1] = f16;
            fArr7[2] = f - max;
            fArr7[3] = f16;
            matrix.reset();
            matrix.setRotate(f14, f, f2);
            matrix.mapPoints(fArr7);
            if (i == 0) {
                path.moveTo(fArr6[0], fArr6[1]);
            }
            path.cubicTo(fArr6[2], fArr6[3], fArr7[2], fArr7[3], fArr7[0], fArr7[1]);
            i = i2;
        }
    }

    public final void b() {
        for (int i = 0; i < this.n; i++) {
            c(this.e, this.f, i);
            c(this.g, this.h, i);
            this.i[i] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i) {
        float f = this.n;
        float f2 = this.b;
        float f3 = this.a;
        Random random = this.m;
        fArr[i] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f2 - f3)) + f3;
        fArr2[i] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f) * 0.05f) + ((360.0f / f) * i);
        this.j[i] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(boolean z, float f) {
        this.s = f;
        if (e86.e(this.r)) {
            float f2 = this.s;
            float f3 = this.t;
            if (z) {
                float f4 = f2 - f3;
                if (f2 > f3) {
                    this.u = f4 / 205.0f;
                    return;
                } else {
                    this.u = f4 / 275.0f;
                    return;
                }
            }
            float f5 = f2 - f3;
            if (f2 > f3) {
                this.u = f5 / 320.0f;
            } else {
                this.u = f5 / 375.0f;
            }
        }
    }

    public final void e(float f, float f2) {
        if (e86.e(this.r)) {
            for (int i = 0; i < this.n; i++) {
                float[] fArr = this.i;
                float f3 = fArr[i];
                float f4 = this.j[i];
                float f5 = (f4 * f * 8.2f * f2) + (0.8f * f4) + f3;
                fArr[i] = f5;
                if (f5 >= 1.0f) {
                    fArr[i] = 0.0f;
                    float[] fArr2 = this.g;
                    this.e[i] = fArr2[i];
                    float[] fArr3 = this.h;
                    this.f[i] = fArr3[i];
                    c(fArr2, fArr3, i);
                }
            }
        }
    }

    public final void f(long j) {
        float f = this.s;
        float f2 = this.t;
        if (f != f2) {
            float f3 = this.u;
            float f4 = (j * f3) + f2;
            this.t = f4;
            if (f3 > 0.0f) {
                if (f4 > f) {
                    this.t = f;
                }
            } else if (f4 < f) {
                this.t = f;
            }
        }
    }

    public fl0(int i) {
        this(i, 512);
    }
}
