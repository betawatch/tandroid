package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class s9 {
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

    public s9(int i10) {
        this(i10, 512);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        if (!LiteMode.isEnabled(this.r)) {
            return;
        }
        Path path = this.c;
        path.reset();
        int i10 = 0;
        while (true) {
            float f12 = i10;
            float f13 = this.n;
            if (f12 >= f13) {
                canvas.save();
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            float[] fArr = this.i;
            float f14 = fArr[i10];
            int i11 = i10 + 1;
            int i12 = ((float) i11) < f13 ? i11 : 0;
            float f15 = fArr[i12];
            float[] fArr2 = this.e;
            float f16 = 1.0f - f14;
            float f17 = fArr2[i10] * f16;
            float[] fArr3 = this.g;
            float f18 = (fArr3[i10] * f14) + f17;
            float f19 = 1.0f - f15;
            float f20 = (fArr3[i12] * f15) + (fArr2[i12] * f19);
            float[] fArr4 = this.f;
            float f21 = fArr4[i10] * f16;
            float[] fArr5 = this.h;
            float f22 = (fArr5[i10] * f14) + f21;
            float f23 = (fArr5[i12] * f15) + (fArr4[i12] * f19);
            float max = (((Math.max(f18, f20) - Math.min(f18, f20)) / 2.0f) + Math.min(f18, f20)) * this.o * this.p;
            Matrix matrix = this.q;
            matrix.reset();
            matrix.setRotate(f22, f10, f11);
            float[] fArr6 = this.k;
            fArr6[0] = f10;
            float f24 = f11 - f18;
            fArr6[1] = f24;
            fArr6[2] = f10 + max;
            fArr6[3] = f24;
            matrix.mapPoints(fArr6);
            float[] fArr7 = this.l;
            fArr7[0] = f10;
            float f25 = f11 - f20;
            fArr7[1] = f25;
            fArr7[2] = f10 - max;
            fArr7[3] = f25;
            matrix.reset();
            matrix.setRotate(f23, f10, f11);
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
        float f10 = this.n;
        float f11 = this.b;
        float f12 = this.a;
        Random random = this.m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f11 - f12)) + f12;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f10) * 0.05f) + ((360.0f / f10) * i10);
        this.j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f10, boolean z10) {
        this.s = f10;
        if (LiteMode.isEnabled(this.r)) {
            if (z10) {
                float f11 = this.s;
                float f12 = this.t;
                if (f11 > f12) {
                    this.u = (f11 - f12) / 205.0f;
                    return;
                } else {
                    this.u = (f11 - f12) / 275.0f;
                    return;
                }
            }
            float f13 = this.s;
            float f14 = this.t;
            if (f13 > f14) {
                this.u = (f13 - f14) / 320.0f;
            } else {
                this.u = (f13 - f14) / 375.0f;
            }
        }
    }

    public final void e(float f10, float f11) {
        if (LiteMode.isEnabled(this.r)) {
            for (int i10 = 0; i10 < this.n; i10++) {
                float[] fArr = this.i;
                float f12 = fArr[i10];
                float f13 = this.j[i10];
                float f14 = (f13 * f10 * 8.2f * f11) + (0.8f * f13) + f12;
                fArr[i10] = f14;
                if (f14 >= 1.0f) {
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

    public final void f(long j10) {
        float f10 = this.s;
        float f11 = this.t;
        if (f10 != f11) {
            float f12 = this.u;
            float f13 = (j10 * f12) + f11;
            this.t = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.t = f10;
                }
            } else if (f13 < f10) {
                this.t = f10;
            }
        }
    }

    public s9(int i10, int i11) {
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
