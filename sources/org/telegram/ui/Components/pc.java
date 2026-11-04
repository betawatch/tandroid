package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pc {
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
    public int y = org.telegram.messenger.hs.e4;

    public final void a() {
        int i3 = this.h;
        Paint paint = this.i;
        paint.setColor(i3);
        paint.setAlpha((this.g * this.y) / org.telegram.messenger.hs.e4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i3) {
        float f10 = 0.18f / this.x;
        float f11 = this.k[i3];
        Random random = this.j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f11;
        float[] fArr = this.l;
        float f12 = nextFloat >= 0.0f ? 1.0f : 0.0f;
        nextFloat = f12;
        fArr[i3] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f10 * 0.35f) + this.m[i3];
        float[] fArr2 = this.n;
        float f13 = -f10;
        if (nextFloat2 < f13) {
            f10 = f13;
        } else if (nextFloat2 <= f10) {
            f10 = nextFloat2;
        }
        fArr2[i3] = f10;
        this.p[i3] = ((random.nextFloat() * 0.003f) + 0.017f) * this.a;
    }

    public final void c(int i3) {
        this.x = i3;
        this.k = new float[i3];
        this.l = new float[i3];
        this.m = new float[i3];
        this.n = new float[i3];
        this.o = new float[i3];
        this.p = new float[i3];
        this.q = new float[i3];
        this.r = new float[i3];
        this.s = new float[i3];
        this.t = new float[i3];
        this.u = new float[i3];
        this.v = new float[i3];
        this.w = new float[i3];
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
        for (int i3 = 0; i3 < this.x; i3++) {
            float[] fArr = this.o;
            float f11 = fArr[i3];
            float f12 = this.p[i3];
            oc ocVar = qc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i3] = f13;
            if (f13 >= 1.0f) {
                fArr[i3] = 0.0f;
                this.k[i3] = this.l[i3];
                this.m[i3] = this.n[i3];
                b(i3);
            }
        }
    }
}
