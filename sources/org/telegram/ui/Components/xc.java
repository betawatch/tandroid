package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xc {
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
        int i9 = this.h;
        Paint paint = this.i;
        paint.setColor(i9);
        paint.setAlpha((this.g * this.y) / 255);
    }

    public final void b(int i9) {
        float f10 = 0.18f / this.x;
        float f11 = this.k[i9];
        Random random = this.j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f11;
        float[] fArr = this.l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i9] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f10 * 0.35f) + this.m[i9];
        float[] fArr2 = this.n;
        float f12 = -f10;
        if (nextFloat2 < f12) {
            f10 = f12;
        } else if (nextFloat2 <= f10) {
            f10 = nextFloat2;
        }
        fArr2[i9] = f10;
        this.p[i9] = ((random.nextFloat() * 0.003f) + 0.017f) * this.a;
    }

    public final void c(int i9) {
        this.x = i9;
        this.k = new float[i9];
        this.l = new float[i9];
        this.m = new float[i9];
        this.n = new float[i9];
        this.o = new float[i9];
        this.p = new float[i9];
        this.q = new float[i9];
        this.r = new float[i9];
        this.s = new float[i9];
        this.t = new float[i9];
        this.u = new float[i9];
        this.v = new float[i9];
        this.w = new float[i9];
        for (int i10 = 0; i10 < this.x; i10++) {
            float[] fArr = this.k;
            Random random = this.j;
            fArr[i10] = random.nextFloat();
            this.m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.x;
            b(i10);
            this.o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i9 = 0; i9 < this.x; i9++) {
            float[] fArr = this.o;
            float f11 = fArr[i9];
            float f12 = this.p[i9];
            dh.a aVar = yc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i9] = f13;
            if (f13 >= 1.0f) {
                fArr[i9] = 0.0f;
                this.k[i9] = this.l[i9];
                this.m[i9] = this.n[i9];
                b(i9);
            }
        }
    }
}
