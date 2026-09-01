package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yc {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public float[] k;
    public float[] l;
    public float[] m;
    public float[] n;
    public float[] o;
    public float[] p;
    public float[] q;
    public float[] r;
    public float[] s;
    public float[] t;
    public float[] u;
    public float[] v;
    public float[] w;
    public int x;
    public int h = -11318601;
    public final Paint i = new Paint(1);
    public final Random j = new Random();
    public int y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.i;
        paint.setColor(i10);
        paint.setAlpha((this.g * this.y) / 255);
    }

    public final void b(int i10) {
        float f10 = 0.18f / this.x;
        float f11 = this.k[i10];
        Random random = this.j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f11;
        float[] fArr = this.l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f10 * 0.35f) + this.m[i10];
        float[] fArr2 = this.n;
        float f12 = -f10;
        if (nextFloat2 < f12) {
            f10 = f12;
        } else if (nextFloat2 <= f10) {
            f10 = nextFloat2;
        }
        fArr2[i10] = f10;
        this.p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.a;
    }

    public final void c(int i10) {
        this.x = i10;
        this.k = new float[i10];
        this.l = new float[i10];
        this.m = new float[i10];
        this.n = new float[i10];
        this.o = new float[i10];
        this.p = new float[i10];
        this.q = new float[i10];
        this.r = new float[i10];
        this.s = new float[i10];
        this.t = new float[i10];
        this.u = new float[i10];
        this.v = new float[i10];
        this.w = new float[i10];
        for (int i11 = 0; i11 < this.x; i11++) {
            float[] fArr = this.k;
            Random random = this.j;
            fArr[i11] = random.nextFloat();
            this.m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.x;
            b(i11);
            this.o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i10 = 0; i10 < this.x; i10++) {
            float[] fArr = this.o;
            float f11 = fArr[i10];
            float f12 = this.p[i10];
            jh.a aVar = zc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i10] = f13;
            if (f13 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.k[i10] = this.l[i10];
                this.m[i10] = this.n[i10];
                b(i10);
            }
        }
    }
}
