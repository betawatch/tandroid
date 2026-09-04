package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class ca {
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

    public ca(int i10) {
        this(i10, 512);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        if (!LiteMode.isEnabled(this.r)) {
            return;
        }
        Path path = this.c;
        path.reset();
        int i10 = 0;
        while (true) {
            float f11 = i10;
            float f12 = this.n;
            if (f11 >= f12) {
                canvas.save();
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            float[] fArr = this.i;
            float f13 = fArr[i10];
            int i11 = i10 + 1;
            int i12 = ((float) i11) < f12 ? i11 : 0;
            float f14 = fArr[i12];
            float[] fArr2 = this.e;
            float f15 = 1.0f - f13;
            float f16 = fArr2[i10] * f15;
            float[] fArr3 = this.g;
            float f17 = (fArr3[i10] * f13) + f16;
            float f18 = 1.0f - f14;
            float f19 = (fArr3[i12] * f14) + (fArr2[i12] * f18);
            float[] fArr4 = this.f;
            float f20 = fArr4[i10] * f15;
            float[] fArr5 = this.h;
            float f21 = (fArr5[i10] * f13) + f20;
            float f22 = (fArr5[i12] * f14) + (fArr4[i12] * f18);
            float max = (((Math.max(f17, f19) - Math.min(f17, f19)) / 2.0f) + Math.min(f17, f19)) * this.o * this.p;
            Matrix matrix = this.q;
            matrix.reset();
            matrix.setRotate(f21, f7, f10);
            float[] fArr6 = this.k;
            fArr6[0] = f7;
            float f23 = f10 - f17;
            fArr6[1] = f23;
            fArr6[2] = f7 + max;
            fArr6[3] = f23;
            matrix.mapPoints(fArr6);
            float[] fArr7 = this.l;
            fArr7[0] = f7;
            float f24 = f10 - f19;
            fArr7[1] = f24;
            fArr7[2] = f7 - max;
            fArr7[3] = f24;
            matrix.reset();
            matrix.setRotate(f22, f7, f10);
            matrix.mapPoints(fArr7);
            if (i10 == 0) {
                path.moveTo(fArr6[0], fArr6[1]);
            }
            path.cubicTo(fArr6[2], fArr6[3], fArr7[2], fArr7[3], fArr7[0], fArr7[1]);
            i10 = i11;
        }
    }

    public final void b() {
        for (int i10 = 0; i10 < this.n; i10++) {
            c(this.e, this.f, i10);
            c(this.g, this.h, i10);
            this.i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f7 = this.n;
        float f10 = this.b;
        float f11 = this.a;
        Random random = this.m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f7) * 0.05f) + ((360.0f / f7) * i10);
        this.j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f7, boolean z10) {
        this.s = f7;
        if (LiteMode.isEnabled(this.r)) {
            if (z10) {
                float f10 = this.s;
                float f11 = this.t;
                if (f10 > f11) {
                    this.u = (f10 - f11) / 205.0f;
                    return;
                } else {
                    this.u = (f10 - f11) / 275.0f;
                    return;
                }
            }
            float f12 = this.s;
            float f13 = this.t;
            if (f12 > f13) {
                this.u = (f12 - f13) / 320.0f;
            } else {
                this.u = (f12 - f13) / 375.0f;
            }
        }
    }

    public final void e(float f7, float f10) {
        if (LiteMode.isEnabled(this.r)) {
            for (int i10 = 0; i10 < this.n; i10++) {
                float[] fArr = this.i;
                float f11 = fArr[i10];
                float f12 = this.j[i10];
                float f13 = (f12 * f7 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.g;
                    this.e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j3) {
        float f7 = this.s;
        float f10 = this.t;
        if (f7 != f10) {
            float f11 = this.u;
            float f12 = (j3 * f11) + f10;
            this.t = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.t = f7;
                }
            } else if (f12 < f7) {
                this.t = f7;
            }
        }
    }

    public ca(int i10, int i11) {
        this.c = new Path();
        this.d = new Paint(1);
        this.k = new float[4];
        this.l = new float[4];
        this.m = new Random();
        this.p = 1.0f;
        this.q = new Matrix();
        this.n = i10;
        this.o = (float) (Math.tan(3.141592653589793d / (r0 * 2.0f)) * 1.3333333333333333d);
        this.e = new float[i10];
        this.f = new float[i10];
        this.g = new float[i10];
        this.h = new float[i10];
        this.i = new float[i10];
        this.j = new float[i10];
        for (int i12 = 0; i12 < this.n; i12++) {
            c(this.e, this.f, i12);
            c(this.g, this.h, i12);
            this.i[i12] = 0.0f;
        }
        this.r = i11;
    }
}
