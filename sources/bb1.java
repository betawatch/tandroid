// default package

import android.graphics.Paint;
import java.util.Random;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bb1 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public short g;
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
    public int y = jn7.d4;

    public final void a() {
        int i = this.h;
        Paint paint = this.i;
        paint.setColor(i);
        paint.setAlpha((this.g * this.y) / jn7.d4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r3 > 1.0f) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        float f = 0.18f / this.x;
        float f2 = this.k[i];
        Random random = this.j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f2;
        float[] fArr = this.l;
        float f3 = nextFloat >= 0.0f ? 1.0f : 0.0f;
        nextFloat = f3;
        fArr[i] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f * 0.35f) + this.m[i];
        float[] fArr2 = this.n;
        float f4 = -f;
        if (nextFloat2 < f4) {
            f = f4;
        } else if (nextFloat2 <= f) {
            f = nextFloat2;
        }
        fArr2[i] = f;
        this.p[i] = ik8.e(random, 0.003f, 0.017f) * this.a;
    }

    public final void c(int i) {
        this.x = i;
        this.k = new float[i];
        this.l = new float[i];
        this.m = new float[i];
        this.n = new float[i];
        this.o = new float[i];
        this.p = new float[i];
        this.q = new float[i];
        this.r = new float[i];
        this.s = new float[i];
        this.t = new float[i];
        this.u = new float[i];
        this.v = new float[i];
        this.w = new float[i];
        for (int i2 = 0; i2 < this.x; i2++) {
            float[] fArr = this.k;
            Random random = this.j;
            fArr[i2] = random.nextFloat();
            this.m[i2] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.x;
            b(i2);
            this.o[i2] = random.nextFloat();
        }
        a();
    }

    public final void d(float f) {
        for (int i = 0; i < this.x; i++) {
            float[] fArr = this.o;
            float f2 = fArr[i];
            float f3 = this.p[i];
            ab1 ab1Var = cb1.H;
            float f4 = (f3 * f * 8.2f) + (0.8f * f3) + f2;
            fArr[i] = f4;
            if (f4 >= 1.0f) {
                fArr[i] = 0.0f;
                this.k[i] = this.l[i];
                this.m[i] = this.n[i];
                b(i);
            }
        }
    }
}
