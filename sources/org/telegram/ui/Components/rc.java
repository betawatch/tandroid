package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class rc {
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
    public int y = org.telegram.messenger.qs.e4;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.i;
        paint.setColor(i7);
        paint.setAlpha((this.g * this.y) / org.telegram.messenger.qs.e4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7) {
        float f10 = 0.18f / this.x;
        float f11 = this.k[i7];
        Random random = this.j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f11;
        float[] fArr = this.l;
        float f12 = nextFloat >= 0.0f ? 1.0f : 0.0f;
        nextFloat = f12;
        fArr[i7] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f10 * 0.35f) + this.m[i7];
        float[] fArr2 = this.n;
        float f13 = -f10;
        if (nextFloat2 < f13) {
            f10 = f13;
        } else if (nextFloat2 <= f10) {
            f10 = nextFloat2;
        }
        fArr2[i7] = f10;
        this.p[i7] = ((random.nextFloat() * 0.003f) + 0.017f) * this.a;
    }

    public final void c(int i7) {
        this.x = i7;
        this.k = new float[i7];
        this.l = new float[i7];
        this.m = new float[i7];
        this.n = new float[i7];
        this.o = new float[i7];
        this.p = new float[i7];
        this.q = new float[i7];
        this.r = new float[i7];
        this.s = new float[i7];
        this.t = new float[i7];
        this.u = new float[i7];
        this.v = new float[i7];
        this.w = new float[i7];
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
        for (int i7 = 0; i7 < this.x; i7++) {
            float[] fArr = this.o;
            float f11 = fArr[i7];
            float f12 = this.p[i7];
            qc qcVar = sc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.k[i7] = this.l[i7];
                this.m[i7] = this.n[i7];
                b(i7);
            }
        }
    }
}
